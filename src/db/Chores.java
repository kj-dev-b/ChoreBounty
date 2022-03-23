package db;

import java.util.List;

import main.Chore;

public class Chores {
	
	private Database database;

    public Chores(Database database) {
        this.database = database;
    }
	
	public List<Chore> getAllChores() {
		// not implemented
		return this.database.getAllChores();
	}
	
	public Chore getChoreByName(String choreName) {
		// not implemented
		return this.database.getChoreByName(choreName);
	}
	
	public List<Chore> getChoresForUser(String userName) {
		// not implemented
		return this.database.getChoresForUser(userName);
	}

}
