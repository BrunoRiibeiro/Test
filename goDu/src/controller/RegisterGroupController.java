package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Group;
import model.User;
import model.database.DatabaseProvider;
import view.Home;
import view.RegisterGroup;
import view.RegisterUser;

public class RegisterGroupController {

	private final RegisterGroup view;

	public RegisterGroupController(RegisterGroup view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			registerNewGroup();
			System.out.println(DatabaseProvider.getGroups());
			new Home();
		} else if (source == view.getButtonCancel()) {
			new Home();
		} else if (source == view.getButtonNewUser()) {
			new RegisterUser();
		}

		view.dispose();
	}

	private void registerNewGroup() {
		String name = view.getFieldName().getText();
		User creator = searchForPickedUser(view.getFieldCreator().getSelectedItem().toString());
		String expectedDate = view.getFieldDate().getText();
		String motivation = view.getFieldMotivation().getText();

		Group group = new Group(name, creator, expectedDate, motivation);

		DatabaseProvider.getGroups().add(group);
	}

	public DefaultComboBoxModel<Object> updateModel() {
		return new DefaultComboBoxModel<>(createArrayUser());
	}

	public Object[] createArrayUser() {
		List<String> model = new ArrayList<>();

		for (User user : DatabaseProvider.getUsers()) {
			model.add(user.getName());
		}

		return model.toArray();
	}

	public User searchForPickedUser(String name) {
		for (User currentUser : DatabaseProvider.getUsers()) {
			if (currentUser.getName().equals(name)) {
				return currentUser;
			}
		}

		return null;
	}
}
