package model.database;

import java.util.ArrayList;
import java.util.List;

import model.Group;
import model.User;

public class DatabaseProvider {
	private static final List<User> USERS = new ArrayList<>();
	private static final List<Group> GROUPS = new ArrayList<>();

	private DatabaseProvider() {

	}

	public static List<User> getUsers() {
		return USERS;
	}

	public static List<Group> getGroups() {
		return GROUPS;
	}
	
	public static User searchForPickedUser(String name) {
		for (User currentUser : DatabaseProvider.getUsers()) {
			if (currentUser.getName().equals(name)) {
				return currentUser;
			}
		}

		return null;
	}
	
	public static Group searchForPickedGroup(String name) {
		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (name.equals(currentGroup.getNameGroup())) {
				return currentGroup;
			}
		}
		return null;
	}
}
