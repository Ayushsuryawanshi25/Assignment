package MiniProject3_StudentManagmentSystem;

import java.sql.*;
public class DBConnection {
	
	public static final String URL ="jdbc:mysql://localhost:3306/miniproject3";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "Ayush@2507";
	public static Connection DB_Initialize() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println("Data Base connected Succesfully!");
		return con;
	}
	
}