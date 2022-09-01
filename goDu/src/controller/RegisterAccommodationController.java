package controller;

import java.util.List;

import model.Accommodation;
import model.Group;
import model.Restaurant;
import model.Transportation;
import model.User;
import model.database.DatabaseProvider;
import view.EditGroup;
import view.RegisterAccommodation;

public class RegisterAccommodationController {

	private final RegisterAccommodation view;

	public RegisterAccommodationController(RegisterAccommodation view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			String pickedNameSplitted = ShowGroupController.nameGroupEdit.substring(0,
					ShowGroupController.nameGroupEdit.lastIndexOf(" -"));
			registerNewAccommodation((pickedNameSplitted));
			System.out.println(DatabaseProvider.getGroups());
			new EditGroup();
		} else if (source == view.getButtonCancel()) {
			new EditGroup();
		}

		view.dispose();
	}

	public void registerNewAccommodation(String name) {
		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (name.equals(currentGroup.getNameGroup())) {

				String date = view.getFieldDate().getText();
				String locale = view.getFieldLocale().getText();
				String accommodation = view.getTextFieldAccommodation().getText();
				double accommodationCost = Double.parseDouble(view.getTextFieldCost().getText());

				String names = currentGroup.getNameGroup();
				User creator = currentGroup.getCreator();
				String motivation = currentGroup.getMotivation();
				String expectedDate = currentGroup.getExpectedDate();
				List<Transportation> transportation = currentGroup.getTransportation();
				int numberOfMembers = currentGroup.getNumberOfMembers();
				List<Restaurant> restaurant = currentGroup.getRestaurant();
				List<Accommodation> newAccommodation = currentGroup.getAccommodation();
				double totalPrice = currentGroup.getTotalPrice() + accommodationCost;
				Accommodation accommodations = new Accommodation(date, locale, accommodation, accommodationCost);
				newAccommodation.add(accommodations);

				Group group = new Group(names, creator, motivation, expectedDate, transportation, numberOfMembers,
						restaurant, newAccommodation, totalPrice);

				DatabaseProvider.getGroups().add(group);

				DatabaseProvider.getGroups().remove(currentGroup);
			}
		}
	}

}
