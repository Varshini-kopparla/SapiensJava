package jdbcMav1.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","Vk@112233");
		Statement statement = connection.createStatement();
		String sql = "CREATE DATABASE EMPLOYEE";
		statement.executeUpdate(sql);
		System.out.println("Success");
	}
}