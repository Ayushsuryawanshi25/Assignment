package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



// Write a program to create a table called Students using JDBC and insert records into it
public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection someConnection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student",
            		                    "root",
            				            "Ayush@2507");
            System.out.println("connection Successful");
            //stmt
            Statement stmt = someConnection.createStatement();

            // 4. Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS Students (" +
                    "id INT PRIMARY KEY," +
                    "name VARCHAR(50)," +
                    "age INT," +
                    "course VARCHAR(50))";

            stmt.executeUpdate(createTable);
            
            System.out.println("Table Created Successfully");
            stmt.executeUpdate("INSERT INTO Students VALUES (1, 'Ayush', 21, 'Computer Science')");
            stmt.executeUpdate("INSERT INTO Students VALUES (2, 'Rahul', 22, 'Mechanical')");
            stmt.executeUpdate("INSERT INTO Students VALUES (3, 'Sneha', 20, 'Electronics')");
            
            
            System.out.println("Records Inserted Successfully");

            
            stmt.close();
            someConnection.close();

		}
		catch(Exception e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
		
	}

}
