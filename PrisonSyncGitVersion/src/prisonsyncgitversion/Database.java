package prisonsyncgitversion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Prison Group
 */
public class Database {

    private Connection maindb;
    
    //http://www.db4free.net
    //Username: cs360admin
    //Password: nottoolate10
    //

    /**
     *
     * @throws SQLException
     */
    public void Connect() throws SQLException {

        if (maindb == null || maindb.isValid(2) != true) {
            {
                Properties connectionProps = new Properties();
                connectionProps.put("user", "cs360admin");
                connectionProps.put("password", "nottoolate10");

                maindb = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/cs360", connectionProps);

                System.out.println("Connected to database");
            }
        }
    }

    /**
     *
     * @param query
     * @return
     * @throws SQLException
     */
    public ResultSet runQuery(String query) throws SQLException {

        Statement stmt = maindb.createStatement();
        return stmt.executeQuery(query);
    }
    
    /**
     *
     * @param update
     * @throws SQLException
     */
    public void runUpdate(String update) throws SQLException {

        Statement stmt = maindb.createStatement();
        stmt.executeUpdate(update);
    }
}
