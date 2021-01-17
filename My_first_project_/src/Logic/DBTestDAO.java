package Logic;
import java.sql.*;

public class DBTestDAO {
	private Connection conn;
	private PreparedStatement pstet;
	
	public DBTestDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/user_table?CharacterEncording=UTF-8&serverTimezone=UTC&useSSL=false";
			String dbID = "root";
			String dbPW = "admin";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
