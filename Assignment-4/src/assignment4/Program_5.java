package assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "password"
            );

            Statement stmt = con.createStatement();

            String selectQuery =
                    "SELECT * FROM students WHERE semester = 7 AND branch = 'EC'";

            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("branch") + " " +
                        rs.getInt("semester") + " " +
                        rs.getDouble("percentage") + " " +
                        rs.getInt("year_of_passing")
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


