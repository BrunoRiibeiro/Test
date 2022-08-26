package controller;

import model.User;
import model.database.DatabaseProvider;
import view.Home;
import view.RegisterUser;

public class RegisterUserController {

	private final RegisterUser view;

	public RegisterUserController(RegisterUser view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			registerNewUser();
			System.out.println(DatabaseProvider.getUsers());
			new Home();
		} else if (source == view.getButtonCancel()) {
			new Home();
		}
	}

	private void registerNewUser() {
		String name = view.getTextFieldName().getText();
		String birthday = view.getTextFieldBirthday().getText();
		User user = new User(name, birthday);

		DatabaseProvider.getUsers().add(user);
	}

}
