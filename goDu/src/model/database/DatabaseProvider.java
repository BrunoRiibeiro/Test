package model.database;

import java.util.ArrayList;
import java.util.List;

import model.Group;
import model.User;

/**
 * Classe utilizada como pseudo banco de dados para o armazenamento de dados de grupos e usuários.
 * 
 * @see java.util.ArrayList
 * @author Bruno Ribeiro
 * @author Igora Penha
 */
public class DatabaseProvider {
	private static final List<User> USERS = new ArrayList<>();
	private static final List<Group> GROUPS = new ArrayList<>();

	/**
	 * Construtor privado, para evitar que outras classes possam estanciá-la ou herdá-la.
	 */
	private DatabaseProvider() {

	}

	public static List<User> getUsers() {
		return USERS;
	}

	public static List<Group> getGroups() {
		return GROUPS;
	}
}
