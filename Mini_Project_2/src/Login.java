
import java.sql.*;
public class Login {
	static Connection con = null;
	
	public static boolean authentication(String username, String password) {
		 boolean status = false;
		
		try {
			con = DBConnection.connectDB();
			String sql = "SELECT * FROM authentication WHERE username = ? AND password = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
			con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return status;
	}
}
