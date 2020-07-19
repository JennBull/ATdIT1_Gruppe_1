import java.sql.*;

public class DBConnection {
	static Connection conn;

	public DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7355900?user=sql7355900&password=kHaqmas865");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public ResultSet getAllProblems() {
		try {
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM problem");

			while (rs.next()) {
				int id = rs.getInt("id");
				String description = rs.getString("description");
				int area_id = rs.getInt("area_id");
				int status_id = rs.getInt("status_id");
				String tree = rs.getString("tree");
				
				System.out.format("%s, %s, %s, %s, %s \n", id, description, area_id, status_id, tree);
			}
			return rs;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	public static void main(String[] args) {
		
		DBConnection dbConnection = new DBConnection();
		dbConnection.getAllProblems();
	}
}