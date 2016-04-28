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
			} else {
				auth = false;
			}
		} catch (SQLException ex) {
			Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
			auth = false;
		}

	}

	public Employee getEmployee(int id) {
		try {
			ResultSet rs;
			rs = db.runQuery("SELECT * FROM prisonsystem.Employees WHERE idEmployees=" + id + ";");
			rs.next();
			return new Employee(rs.getString("First"),rs.getString("Middle"),rs.getString("Last"),rs.getString("First"),rs.getString("DoB"),rs.getString("SSN"),rs.getString("Height"),rs.getString("Weight"),rs.getString("Desc"));
		} catch (SQLException ex) {
			Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	
		public Inmate getInmate(int id) {
		try {
			ResultSet rs;
			rs = db.runQuery("SELECT * FROM prisonsystem.Inmates WHERE idInmates=" + id + ";");
			rs.next();
			return new Inmate(rs.getString("First"),rs.getString("Middle"),rs.getString("Last"),rs.getString("First"),rs.getString("DoB"),rs.getString("SSN"),rs.getString("Height"),rs.getString("Weight"),rs.getString("Desc"));
		} catch (SQLException ex) {
			Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	/**
	 *
	 * @return
	 */
	public boolean authenticated() {
		return auth;
	}

}
