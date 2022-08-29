package controller;

import view.ShowGroup;
import view.ShowUser;
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
		} else if (source == view.getButtonRegisterGroup()) {
			new RegisterGroup();
		} else if (source == view.getButtonGroup()) {
			new ShowGroup();
		} else if (source == view.getButtonUser()) {
			new ShowUser();
		}
	}

}
