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
}
