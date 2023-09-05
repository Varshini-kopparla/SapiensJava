package jdbcMav1.JDBCDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

public class JdbcDemoText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for Emp Id input
        System.out.print("Enter Employee ID: ");
        int empid = scanner.nextInt();
        scanner.close();

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vk@11223");

            // Prepare a SQL query to retrieve employee data
            String sql = "SELECT * FROM employee WHERE empid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, empid);

            // Execute the query and retrieve the data
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Retrieve data from the result set
                int retrievedEmpId = resultSet.getInt("empid");
                String empName = resultSet.getString("empname");
                // Add more columns as needed

                // Display the data on the console
                System.out.println("Employee ID: " + retrievedEmpId);
                System.out.println("Employee Name: " + empName);
                // Display other columns as needed

                // Write the data to a text file with a timestamp
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String filename = "employee_info_" + timestamp.getTime() + ".txt";
                FileWriter fileWriter = new FileWriter(filename);
                fileWriter.write("Employee ID: " + retrievedEmpId + "\n");
                fileWriter.write("Employee Name: " + empName + "\n");
                // Write other columns as needed
                fileWriter.close();

                System.out.println("Data written to file: " + filename);
            } else {
                System.out.println("Employee not found.");
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
