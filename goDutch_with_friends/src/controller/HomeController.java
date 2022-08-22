package controller;

import view.Home;
import view.RegisterUser;

public class HomeController {
	
	private final Home view;

	public HomeController(Home view) {
		super();
		this.view = view;
	}
	
	public void sendAction(Object source) {
		if(source == view.getButtonRegisterUser())
			new RegisterUser();
	}
	
}
