package jdbcMav1.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemoInsertValuesDynamic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Entering the data
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Emp Id:");
		String id = scanner.next();
		System.out.println("Enter emp name:");
		String empname = scanner.next();
		System.out.println("Enter Designation:");
		String designation = scanner.next();
		System.out.println("Enter Qualification:");
		String qualification = scanner.next();
		System.out.println("Enter DOB:");
		String dob = scanner.next();
		System.out.println("Enter Contact Num:");
		String contactnum = scanner.next();
		System.out.println("Enter Current City:");
		String currentcity = scanner.next();
		System.out.println("Enter Salary:");
		String salary = scanner.next();
		System.out.println("Enter Total Experience:");
		String totalexp = scanner.next();
		// Inserting data into customers table
		String sql = "insert into employee values(" + id + "," + empname + "," + designation + "," + qualification + ","
				+ dob + "," + contactnum + "," + currentcity + "," + salary + "," + totalexp + ")";
		// Creating the connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connecting to a selected database...");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root",
				"Vk@112233");
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate(sql);
		if (result == 1)
			System.out.println("Transaction Successful" + sql);
		else
			System.out.println("Transaction Failed");
		connection.close();
	}
}