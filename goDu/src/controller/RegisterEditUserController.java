package controller;

import model.User;
import model.database.DatabaseProvider;
import view.Home;
import view.RegisterEditUser;
import view.ShowUser;

public class RegisterEditUserController {

	private final RegisterEditUser view;

	public RegisterEditUserController(RegisterEditUser view) {
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

		view.dispose();
	}

	private void editUser() {

		String name;

		if (view.getFieldName().getText().isEmpty()) {
			name = view.getPickedUserEdit().getName();
		} else {
			name = view.getFieldName().getText();
		}

		String birthday = view.getFieldBirthday().getText();
		User user = new User(name, birthday);

		User oldUser = view.getPickedUserEdit();

		DatabaseProvider.getUsers().add(user);
		DatabaseProvider.getUsers().remove(oldUser);

	}

}
