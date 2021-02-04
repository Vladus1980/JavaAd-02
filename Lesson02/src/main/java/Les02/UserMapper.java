package Les02;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {
	
	public static User map(ResultSet result) throws SQLException {
		
		String user_firstname = result.getString("user_firstname");
		String user_lastname = result.getString("user_lastname");
		int user_age = result.getInt("user_age");
		String user_email = result.getString("user_email");
		
		return new User (user_firstname, user_lastname, user_age, user_email);
		
	}

}
