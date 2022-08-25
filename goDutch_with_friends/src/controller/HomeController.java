package controller;

import view.GroupView;
import view.Home;
import view.RegisterGroup;
import view.RegisterUser;
import view.UserView;

public class HomeController {

	private final Home view;

	public HomeController(Home view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonRegisterUser()) {
			new RegisterUser();
		} else if (source == view.getButtonRegisterGroup()) {
			new RegisterGroup();
		} else if (source == view.getButtonGroup()) {
			new GroupView();
		} else if (source == view.getButtonUser()) {
			new UserView();
		}
	}

}
