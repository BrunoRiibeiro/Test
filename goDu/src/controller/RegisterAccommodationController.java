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
import view.RegisterAccommodation;

public class RegisterAccommodationController {

	private final RegisterAccommodation view;

	public RegisterAccommodationController(RegisterAccommodation view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			String pickedNameSplitted = GroupController.nameGroupEdit.substring(0,
					GroupController.nameGroupEdit.lastIndexOf(" -"));
			registerNewAccommodation((pickedNameSplitted));
			System.out.println(DatabaseProvider.getGroups());
			new Home();
		} else if (source == view.getButtonCancel()) {
			new EditGroup();
		}
	}

	public void registerNewAccommodation(String name) {
		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (name.equals(currentGroup.getNameGroup())) {

				String accomodation = view.getTextFieldAccommodation().getText();
				double accomodationCost = Double.parseDouble(view.getTextFieldCost().getText());

				String names = currentGroup.getNameGroup();
				User creator = currentGroup.getCreator();
				String motivation = currentGroup.getMotivation();
				String expectedDate = currentGroup.getExpectedDate();
				List<User> members = currentGroup.getMembers();
				List<Transportation> tRANSPORTATION = currentGroup.getTRANSPORTATION();
				int numberOfMembers = currentGroup.getNumberOfMembers();
				List<Restaurant> rESTAURANT = currentGroup.getRESTAURANT();
				List<Accommodation> aCCOMODATION = currentGroup.getACCOMODATION();
				double totalPrice = currentGroup.getTotalPrice();
				Accommodation accomodations = new Accommodation(accomodation, accomodationCost);
				aCCOMODATION.add(accomodations);

				Group group = new Group(names, creator, motivation, expectedDate, members, tRANSPORTATION,
						numberOfMembers, rESTAURANT, aCCOMODATION, totalPrice);

				DatabaseProvider.getGroups().add(group);

				DatabaseProvider.getGroups().remove(currentGroup);
			}
		}
	}

}
