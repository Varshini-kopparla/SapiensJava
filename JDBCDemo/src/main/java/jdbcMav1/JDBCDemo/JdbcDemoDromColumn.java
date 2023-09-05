package jdbcMav1.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JdbcDemoDromColumn {
 public static void main(String[] args) throws ClassNotFoundException, 
SQLException {
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Connecting to a selected database...");
 Connection connection = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vk@112233");
 Statement statement = connection.createStatement();
 String sql = "ALTER TABLE Employee DROP COLUMN CurrentCity;";
 statement.executeUpdate(sql);
 System.out.println("Success");
 connection.close();
 }
}
