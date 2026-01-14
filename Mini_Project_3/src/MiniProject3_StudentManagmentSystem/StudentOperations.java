package MiniProject3_StudentManagmentSystem;


import java.sql.SQLException;

public interface StudentOperations {

	void display()  throws SQLException, ClassNotFoundException ;
	void displaySorted()  throws SQLException, ClassNotFoundException ;
	int addStudent(int enrol, String name, String Branch)  throws SQLException, ClassNotFoundException ;
	int deleteStudent(int enrol)  throws SQLException, ClassNotFoundException ;
	int updateBranch(int enrol, String Branch)  throws SQLException, ClassNotFoundException ;
}