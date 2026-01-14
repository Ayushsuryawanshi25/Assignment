package MiniProject3_StudentManagmentSystem;
import java.sql.*;
import java.util.*;


public class Operations extends DBConnection implements StudentOperations {
	
	static Connection con ;
	public Operations() throws SQLException, ClassNotFoundException{
		con = DBConnection.DB_Initialize();
	}
	@Override
	public void display() throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM student";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                rs.getInt(1) + " | " +
                rs.getString(2) + " | " +
                rs.getString(3)
            );
        }
	}
	
	@Override
	public void displaySorted() throws SQLException, ClassNotFoundException  {
		String sql = "SELECT * FROM student ORDER BY enrollment ASC";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                rs.getInt(1) + " | " +
                rs.getString(2) + " | " +
                rs.getString(3)
            );
        }	}
	
	@Override
	public int addStudent(int enrol, String name, String Branch) throws SQLException, ClassNotFoundException {
		String sql = "Insert into student values (?, ?, ?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, enrol);
		st.setString(2,name);
		st.setString(3,Branch);
		return st.executeUpdate();
	}
	
	@Override
	public int deleteStudent(int enrol)  throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM student WHERE enrollment=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, enrol);
        return ps.executeUpdate();
	}
	
	@Override
	public int updateBranch(int enrol,String Branch) throws SQLException, ClassNotFoundException  {
		
		String sql = "UPDATE student SET branch=? WHERE enrollment=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, Branch);
        ps.setInt(2, enrol);
        return ps.executeUpdate();
	}
}
	