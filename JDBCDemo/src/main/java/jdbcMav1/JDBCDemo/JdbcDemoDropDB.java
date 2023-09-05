package jdbcMav1.JDBCDemo;


import java.sql.*;
import java.util.Scanner;
public class JdbcDemoDropDB {
 public static void main(String[] args) throws ClassNotFoundException, 
SQLException {
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Connecting to a selected database...");
 Connection connection = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vk@112233");
 Statement statement = connection.createStatement();
 //Drop DB
 String sql = "drop database employee";
 statement.executeUpdate(sql);
 System.out.println("Success");
 connection.close();
 }
}