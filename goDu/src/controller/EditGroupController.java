package controller;

import view.EditGroup;
import view.RegisterAccommodation;
import view.RegisterRestaurant;
import view.RegisterTransportation;
import view.ShowGroup;

public class EditGroupController {

	private final EditGroup view;

	public EditGroupController(EditGroup view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButton1()) {
			new RegisterAccommodation();
		} else if (source == view.getButton2()) {
			new RegisterRestaurant();
		} else if (source == view.getButton3()) {
			new RegisterTransportation();
		} else if (source == view.getButton4()) {
			// new ShowUser();
		} else if (source == view.getButtonBackGroup()) {
			new ShowGroup();
		}
	}

}
