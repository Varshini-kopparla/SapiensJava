package jdbcMav1.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcDemoCreateTable {
 public static void main(String[] args) throws ClassNotFoundException, 
SQLException {
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Connecting to a selected database...");
 Connection connection = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vk@112233");
 Statement statement = connection.createStatement();
 String sql = "CREATE TABLE EMPLOYEE(\n" +
 " EMPID INT NOT NULL AUTO_INCREMENT,\n" +
 " EMPNAME VARCHAR (20) NOT NULL,\n" +
 " DESIGNATION VARCHAR (20) NOT NULL,\n" +
 " QUALIFICATION VARCHAR (20) NOT NULL,\n" +
 " DOB VARCHAR (20) NOT NULL,\n" +
 " CONTACTNUM INT NOT NULL,\n" +
 " CURRENTCITY CHAR (25) ,\n" +
 " SALARY DECIMAL (18, 2), \n" +
 " TOTALEXPERIENCE INT NOT NULL,\n" +
 " PRIMARY KEY (EMPID)\n" +
 ");";
 statement.executeUpdate(sql);
 System.out.println("Success");
 }
}

