/**
 * 
 */
package assignment5_6;

/**
 * @author Sergio Sanchez
 *
 */
public class UserAuth {
	
	public String username;
	public String password;
	private final String DB_USERNAME = "ssanchez";
	private final String DB_PASSWORD = "Abc123";
	
	public UserAuth() {
		super();
		this.username = "";
		this.password = "";
	}
	
	public UserAuth(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public boolean isUserPassValid() {
		if (username.equalsIgnoreCase(DB_USERNAME) && password.equals(DB_PASSWORD))
			return true;
		else
			return false;
	}
	
}
