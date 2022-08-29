package model.database;

import java.util.ArrayList;
import java.util.List;

import model.Accomodation;
import model.Group;
import model.Restaurant;
import model.Transportation;
import model.User;

public class DatabaseProvider {
	private static final List<User> USERS = new ArrayList<>();
	private static final List<Group> GROUPS = new ArrayList<>();
	private static final List<Transportation> TRANSPORTS = new ArrayList<>();
	private static final List<Restaurant> RESTAURANTS = new ArrayList<>();
	private static final List<Accomodation> ACCOMODATIONS = new ArrayList<>();

	private DatabaseProvider() {

	}

	public static List<User> getUsers() {
		return USERS;
	}

	public static List<Group> getGroups() {
		return GROUPS;
	}

	public static List<Transportation> getTransports() {
		return TRANSPORTS;
	}

	public static List<Restaurant> getRestaurant() {
		return RESTAURANTS;
	}

	public static List<Accomodation> getAccomodation() {
		return ACCOMODATIONS;
	}

}
