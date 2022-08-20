package controller;

import model.User;
import model.database.DatabaseProvider;
import view.RegisterUser;

public class RegisterUserController {

	private final RegisterUser view;

	public RegisterUserController(RegisterUser view) {
		super();
		this.view = view;
	}
	
	public void sendAction(Object source) {
		registerNewUser();
		System.out.println(DatabaseProvider.getUsers());
	}
	
	private void registerNewUser() {
		String name = view.getTextFieldName().getText();
		String birthday = view.getTextFieldBrithday().getText();
		User user = new User(name, birthday);
		
		DatabaseProvider.getUsers().add(user);
	}
	
}
