/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonsyncgitversion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author colson
 */
public class Session {

	private Database db;
	private String Username;

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
				String salt = rs.getString("Salt");
				rs = db.runQuery("SELECT * FROM prisonsystem.Employees WHERE idEmployees=" + id + " AND PasswordHash='" + password + "';");
				rs.next();
				Username = rs.getString("Name");
			}
		} catch (SQLException ex) {
			Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
