package assignment4;
import java.sql.Connection;
import java.sql.DriverManager;

public class Program_1 {

	public static void main(String[] args) {
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");

		            Connection con = DriverManager.getConnection(
		                    "jdbc:mysql://localhost:3306/student",
		                    "root",
		                    "Ayush@2507"
		            );

		            if (con != null) {
		                System.out.println("Connection Successful");
		            }
		        } catch (Exception e) {
		            System.out.println("Unable to connect");
		            e.printStackTrace();
		        }
		    }		
}

