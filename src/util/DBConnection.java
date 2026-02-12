/**
 * 
 */
package util;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */
public class DBConnection {

	private static DBConnection instance;
	private String url;
	private String login;
	private String pwd;
	/**
	 * 
	 */
	public DBConnection() {
		this.url = "jdbc:mariadb://localhost:3306/dp_bank";
		this.login = "dp_bank";
		this.pwd = "fmsb4nk2026";
		try {
			DriverManager.getConnection(this.url, this.login, this.pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
    // point d'accès unique
    public static synchronized DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public void executeRequest(String sql) {
        System.out.println("Exécution sur [" + url + "] : " + sql);
    }
}
