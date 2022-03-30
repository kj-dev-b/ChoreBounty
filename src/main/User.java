package main;

public class User {

	private String userName;
	private static int numberOfUsers = 0;
	
	public User() {
		this("defaultUser" + (numberOfUsers + 1));
	}
	
	public User(String userName) {
		this.userName = userName;
		numberOfUsers++;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	   
	public String getUserName () {
		return this.userName;
	}
	
	public static int getNumberOfUsers() {
		return numberOfUsers;
	}

}
