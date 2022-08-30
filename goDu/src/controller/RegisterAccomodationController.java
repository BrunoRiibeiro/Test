package controller;

import java.util.List;

import model.Accomodation;
import model.Group;
import model.Restaurant;
import model.Transportation;
import model.User;
import model.database.DatabaseProvider;
import view.EditGroup;
import view.Home;
import view.RegisterAccomodation;

public class RegisterAccomodationController {

	private final RegisterAccomodation view;

	public RegisterAccomodationController(RegisterAccomodation view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			String pickedNameSplitted = GroupController.nameGroupEdit.substring(0,
					GroupController.nameGroupEdit.lastIndexOf(" -"));
			registerNewAccomodation((pickedNameSplitted));
			System.out.println(DatabaseProvider.getGroups());
			new Home();
		} else if (source == view.getButtonCancel()) {
			new EditGroup();
		}
	}

	public void registerNewAccomodation(String name) {
		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (name.equals(currentGroup.getNameGroup())) {

				String accomodation = view.getTextFieldAccomodation().getText();
				double accomodationCost = Double.parseDouble(view.getTextFieldCost().getText());

				String names = currentGroup.getNameGroup();
				User creator = currentGroup.getCreator();
				String motivation = currentGroup.getMotivation();
				String expectedDate = currentGroup.getExpectedDate();
				List<User> members = currentGroup.getMembers();
				List<Transportation> tRANSPORTATION = currentGroup.getTRANSPORTATION();
				int numberOfMembers = currentGroup.getNumberOfMembers();
				List<Restaurant> rESTAURANT = currentGroup.getRESTAURANT();
				List<Accomodation> aCCOMODATION = currentGroup.getACCOMODATION();
				double totalPrice = currentGroup.getTotalPrice();
				Accomodation accomodations = new Accomodation(accomodation, accomodationCost);
				aCCOMODATION.add(accomodations);

				Group group = new Group(names, creator, motivation, expectedDate, members, tRANSPORTATION,
						numberOfMembers, rESTAURANT, aCCOMODATION, totalPrice);

				DatabaseProvider.getGroups().add(group);

				DatabaseProvider.getGroups().remove(currentGroup);
			}
		}
	}

}
