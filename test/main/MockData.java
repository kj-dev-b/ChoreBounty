package main;
import java.util.*;

import main.Chore;
import main.User;

public class MockData {
	
	public static Chore mockChore = new Chore(1, "test name", "test description");
	public static List<Chore> mockChoreList = new ArrayList<>() {
		{
			add(new Chore(10.0, "Wash Dishes", "Get yer hands in there and wash, sucka"));
			add(new Chore(20.0, "Buy Beer", "Find a circle K and case that joint, sucka"));
		}	
	};
	public static List<Chore> mockChoreListSmall = new ArrayList<>() {
		{
			add(new Chore(10.0, "Wash Dishes", "Get yer hands in there and wash, sucka"));
		}	
	};
	public static User mockUser = new User("Nikki Minaj");
	public static List<User> mockUserList = new ArrayList<>() {
		{
			add(new User("Rhaegor"));
			add(new User("Sairah"));
		}
	};
	
	
	
}
