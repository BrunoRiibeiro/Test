package controller;

import view.EditGroup;
import view.ShowGroup;
import view.ShowTransportation;

public class EditGroupController {

	private final EditGroup view;

	public EditGroupController(EditGroup view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonAccomodation()) {
			// new RegisterUser();
		} else if (source == view.getButtonRestaurant()) {
			// new RegisterGroup();
		} else if (source == view.getButtonTransportation()) {
			new ShowTransportation();
		} else if (source == view.getButtonEditProfile()) {
			// new ShowUser();
		} else if (source == view.getButtonBackGroup()) {
			new ShowGroup();
		}
	}

}
