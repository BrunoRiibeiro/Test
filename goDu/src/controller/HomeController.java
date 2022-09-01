package controller;

import view.Home;
import view.RegisterGroup;
import view.RegisterUser;
import view.ShowGroup;
import view.ShowInformationGroup;
import view.ShowUser;

public class HomeController {

	private final Home view;

	public HomeController(Home view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButton1()) {
			new RegisterUser();
		} else if (source == view.getButton2()) {
			new RegisterGroup();
		} else if (source == view.getButton3()) {
			new ShowGroup();
		} else if (source == view.getButton4()) {
			new ShowUser();
		} else if (source == view.getButton5()) {
			new ShowInformationGroup();
		}

		view.dispose();
	}

}
