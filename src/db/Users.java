package db;

import java.util.List;

import main.User;

public class Users {
	
	private Database database;

    public Users(Database database) {
        this.database = database;
    }

    // Returns all users from the db
	public List<User> getAllUsers() {
		// not implemented
		return null;
	}
	
	// Gets a single user matching the given name
	public User getUserByName(String userName) {
		// not implemented
		return null;
	}

}
