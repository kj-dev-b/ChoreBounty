package db;

import java.util.List;

import main.Chore;

public class Chores {
	
	private Database database;

    public Chores(Database database) {
        this.database = database;
    }
	
    // Returns all chores from db
	public List<Chore> getAllChores() {
		// not implemented
		return this.database.getAllChores();
	}
	
	// Returns all chores assigned to the given user
	public List<Chore> getChoresForUser(String userName) {
		// not implemented
		return this.database.getChoresForUser(userName);
	}

}
