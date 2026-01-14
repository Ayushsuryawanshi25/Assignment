
import java.sql.*;
public class DBConnection {
		public final static String url = "jdbc:mysql://localhost:3066/EmployeeManagment";
		public final static String user = "root";
		public final static String password = "Ayush@2507";
		public static Connection connectDB() throws SQLException, ClassNotFoundException{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Conncetion Successful !");
			return con;
		}
	}