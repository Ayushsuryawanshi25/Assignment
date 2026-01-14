package assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Program_4 {
	public class DeleteCivil2024 {
	    public static void main(String[] args) {
	        try {
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/college",
	                    "root",
	                    "password"
	            );

	            Statement stmt = con.createStatement();

	            String deleteQuery =
	                    "DELETE FROM students WHERE year_of_passing = 2024 AND branch = 'Civil'";

	            int rows = stmt.executeUpdate(deleteQuery);
	            System.out.println(rows + " record(s) deleted");

	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	}