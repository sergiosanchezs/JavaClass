/**
 * 
 */
package assignment5_6;

/**
 * Class to assign values to username and password
 * to the variables and check if they match with 
 * the constants in the system.
 * 
 * @author Sergio Sanchez
 * 
 */
public class UserAuth {
	
	public String username;
	public String password;
	private final String DB_USERNAME = "ssanchez";
	private final String DB_PASSWORD = "Abc123";
	
	/**
	 * Creating a User to authenticate it into the system
	 * with empty username and password fields.
	 */
	public UserAuth() {
		super();
		this.username = "";
		this.password = "";
	}
	
	/**
	 * Creating a User to authenticate it into the system
	 * with username and password fields assigned by the user.
	 * 
	 * @param username username defined by user.
	 * @param password password defined by user.
	 */
	public UserAuth(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	/**
	 * Check if the username and password defined by user
	 * match with the one that is in the system.
	 * 
	 * @return a boolean indicating if the username and 
	 * the password math with the constants.
	 */
	public boolean isUserPassValid() {
		if (username.equalsIgnoreCase(DB_USERNAME) && password.equals(DB_PASSWORD))
			return true;
		else
			return false;
	}
	
}
