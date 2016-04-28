
package prisonsyncgitversion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prison Group
 */
public class Session {

	private Database db;
	private String Firstname;
	private boolean auth;

	/**
	 *
	 * @param id
	 * @param password
	 * @return
	 */
	public Session(int id, String password) {

		try {
			db = new Database();
			db.Connect();

			ResultSet rs;
			rs = db.runQuery("SELECT Salt FROM prisonsystem.Employees WHERE idEmployees=" + id + ";");
			if (rs.next()) {
				auth = true;
				String salt = rs.getString("Salt");
				rs = db.runQuery("SELECT * FROM prisonsystem.Employees WHERE idEmployees=" + id + " AND PasswordHash='" + password + "';");
				rs.next();
				Firstname = rs.getString("First");
			}else{
				auth = false;
			}
		} catch (SQLException ex) {
			Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
			auth = false;
		}

	}
	
	/**
	 *
	 * @return
	 */
	public boolean authenticated(){
		return auth;
	}

}
