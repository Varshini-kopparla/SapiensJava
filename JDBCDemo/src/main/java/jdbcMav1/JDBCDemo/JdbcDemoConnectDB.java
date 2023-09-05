package jdbcMav1.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoConnectDB {
	public static void main(String[] args) throws ClassNotFoundException, 
SQLException {
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Connecting to a selected database...");
 @SuppressWarnings("unused")
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vk@112233");
 System.out.println("Connected database successfully...");
 }
}