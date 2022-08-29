package controller;

import model.User;
import model.database.DatabaseProvider;
import view.EditUser;
import view.Home;
import view.ShowUser;

public class EditUserController {

	private final EditUser view;

	public EditUserController(EditUser view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			editUser();
			System.out.println(DatabaseProvider.getUsers());
			new Home();
		} else if (source == view.getButtonCancel()) {
			new ShowUser();
		}
	}

	private void editUser() {
		String name = view.getTextFieldName().getText();
		String birthday = view.getTextFieldBirthday().getText();
		User user = new User(name, birthday);

		DatabaseProvider.getUsers().add(user);
	}

}
