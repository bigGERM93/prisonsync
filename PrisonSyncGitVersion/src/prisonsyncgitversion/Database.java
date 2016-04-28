package prisonsyncgitversion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prison Group
 */
public class Database {

	private Connection con;

	//http://www.db4free.net
	//Username: cs360admin
	//Password: nottoolate10
	//
	/**
	 *
	 * @return
	 */
	public boolean Connect() {

		try {
			if (con == null || con.isValid(2) != true) {
				{
					Properties connectionProps = new Properties();
					connectionProps.put("user", "cs360admin");
					connectionProps.put("password", "nottoolate10");

					con = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/prisonsystem", connectionProps);

					System.out.println("Connected to database");
					return true;
				}
			}
		} catch (SQLException ex) {
			Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	/**
	 *
	 * @param query
	 * @return
	 */
	public ResultSet runQuery(String query) {
		try {
			Statement stmt = con.createStatement();
			return stmt.executeQuery(query);
		} catch (SQLException ex) {
			Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	/**
	 *
	 * @param update
	 * @throws SQLException
	 */
	public void runUpdate(String update) throws SQLException {

		Statement stmt = con.createStatement();
		stmt.executeUpdate(update);
	}
}
