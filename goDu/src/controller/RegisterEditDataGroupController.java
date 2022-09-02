package controller;

import java.util.List;

import model.Accommodation;
import model.Group;
import model.Restaurant;
import model.Transportation;
import model.User;
import model.database.DatabaseProvider;
import view.EditGroup;
import view.Home;
import view.RegisterEditDataGroup;

public class RegisterEditDataGroupController {

	private final RegisterEditDataGroup view;

	public RegisterEditDataGroupController(RegisterEditDataGroup view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			String pickedNameSplitted = view.getPickedGroupEdit().getNameGroup();
			editDataGroup((pickedNameSplitted));
			System.out.println(DatabaseProvider.getGroups());
			new Home();
		} else if (source == view.getButtonCancel()) {
			new EditGroup(view.getPickedGroupEdit());
		}

		view.dispose();
	}

	private void editDataGroup(String name) {
		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (name.equals(currentGroup.getNameGroup())) {

				String names;
				String motivation;
				String expectedDate;
				Integer numberOfMembers;

				if (view.getFieldName().getText().isEmpty()) {
					names = currentGroup.getNameGroup();
				} else {
					names = view.getFieldName().getText();
				}

				if (view.getFieldMotivation().getText().isEmpty()) {
					motivation = currentGroup.getMotivation();
				} else {
					motivation = view.getFieldMotivation().getText();
				}

				if (view.getFieldDate().getText() == "__/__/____") {
					expectedDate = currentGroup.getExpectedDate();
				} else {
					expectedDate = view.getFieldDate().getText();
				}

				if (view.getFieldMembers().getText().length() == 0) {
					numberOfMembers = currentGroup.getNumberOfMembers();
				} else if (Integer.parseInt(view.getFieldMembers().getText()) == 0) {
					numberOfMembers = currentGroup.getNumberOfMembers();
				} else {
					numberOfMembers = Integer.parseInt(view.getFieldMembers().getText());
				}

				User creator = currentGroup.getCreator();
				List<Transportation> transportation = currentGroup.getTransportation();
				List<Restaurant> restaurant = currentGroup.getRestaurant();
				List<Accommodation> accommodation = currentGroup.getAccommodation();
				double totalPrice = currentGroup.getTotalPrice();

				Group group = new Group(names, creator, motivation, expectedDate, transportation, numberOfMembers,
						restaurant, accommodation, totalPrice);

				DatabaseProvider.getGroups().add(group);

				DatabaseProvider.getGroups().remove(currentGroup);
			}
		}

	}

}
