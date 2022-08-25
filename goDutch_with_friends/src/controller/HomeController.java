package controller;

import view.Groups;
import view.Home;
import view.RegisterGroup;
import view.RegisterUser;

public class HomeController {

	private final Home view;

	public HomeController(Home view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonRegisterUser()) {
			new RegisterUser();
		} else if (source == view.getButtonFriends()) {
			new RegisterGroup();
		} else if (source == view.getButtonProfile()) {
			new Groups();
		}
	}

}
