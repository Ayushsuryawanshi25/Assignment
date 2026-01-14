//Mini Project2: Submission date: 30/12/2025
//Sr. No Project
//1. Employee Management System using Java Collections and File Handling.
//Uses Collections Framework for data handling
//Uses File Handling to store and retrieve employee data
//Demonstrates real-world CRUD (insert, update, delete and search) operations. Add
//login system (username/password)
//1. Add Employee
//2. Display All Employees
//3. Search Employee by ID
//4. Update Employee Salary
//5. Delete Employee
//6. Display Sorted Employees
//7. Display Departments
//8. Exit
//Validation Rules
// Employee ID must be unique
// Salary must be positive
// Department cannot be empty
//File must update after every change
//Exception handling with custom messages



import java.sql.*;
import java.util.*;

public class EmployeeManagmentSystem {
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Enter username : ");
			String username = sc.nextLine();
			
			System.out.println("Enter password : ");
			String password = sc.nextLine();
			
			if(Login.authentication(username,password)) {
				System.out.println("Login successful !");
			}else {
				System.out.println("Incorrect usename or password !");
			}
			
			sc.close();
		}

	}