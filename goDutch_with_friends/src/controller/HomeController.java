package controller;

import view.Home;

public class HomeController {
	
	private final Home view;

	public HomeController(Home view) {
		super();
		this.view = view;
	}
	
	public void sendAction(Object source) {
		System.out.println("0K");
	}
	
}
