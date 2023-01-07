package Model;

import java.sql.ResultSet;

public interface DAO {

	public void connectDB();
	public boolean verifyCredentials(String email, String password);
	public void saveRegistration(String name, String city, String email, String mobile);
	public ResultSet readRegistration();
	public void deleteRegistration(String name);
	public void updateRegistration(String email, String mobile);
	
}
