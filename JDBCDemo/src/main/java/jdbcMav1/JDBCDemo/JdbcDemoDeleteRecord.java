package jdbcMav1.JDBCDemo;

import java.sql.*;
import java.util.Scanner;
public class JdbcDemoDeleteRecord {
 public static void main(String[] args) throws ClassNotFoundException, 
SQLException {
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Connecting to a selected database...");
 Connection connection = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vk@112233");

 Statement statement = connection.createStatement();
 //deleting a record
 String sql = "delete from employee where empid = 101";
 statement.executeUpdate(sql);
 String sql1 = "select * from employee";
 ResultSet resultSet = statement.executeQuery(sql1);
 while (resultSet.next()){
 System.out.println("\n Employee Data ");
 System.out.println("ID: " +resultSet.getString(1));
 System.out.println("Name: "+resultSet.getString(2));
 System.out.println("Age: " +resultSet.getString(3));
 }
 System.out.println("Success");
 connection.close();
 }
}
