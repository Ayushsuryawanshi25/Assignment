package assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try {
		            Connection con = DriverManager.getConnection(
		                    "jdbc:mysql://localhost:3306/college",
		                    "root",
		                    "password"
		            );

		            Statement stmt = con.createStatement();

		            String updateQuery =
		                    "UPDATE students SET percentage = percentage + (percentage * 0.05) " +
		                    "WHERE branch = 'CSE'";

		            int rows = stmt.executeUpdate(updateQuery);
		            System.out.println(rows + " record(s) updated");

		            con.close();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }

	}

}
