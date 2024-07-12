package CricketManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rokzz12
 */
// Connect to the MySQL database
public class ConnectionProvider {

	public static Connection getConnection() {
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/cricket_database", "root", "");
			return con;
		} catch (ClassNotFoundException | SQLException e) {
		}
		return null;
	}
}
