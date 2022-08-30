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
import view.RegisterTransportation;

public class TransportationController {

	private final RegisterTransportation view;

	public TransportationController(RegisterTransportation view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			String pickedNameSplitted = GroupController.nameGroupEdit.substring(0,
					GroupController.nameGroupEdit.lastIndexOf(" -"));
			registerNewTransport((pickedNameSplitted));
			System.out.println(DatabaseProvider.getGroups());
			new Home();
		} else if (source == view.getButtonCancel()) {
			new EditGroup();
		}
	}

	public void registerNewTransport(String name) {
		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (name.equals(currentGroup.getNameGroup())) {

				String transportMode = view.getTextFieldTransportation().getText();
				Double cost = Double.parseDouble(view.getTextFieldCost().getText());

				String names = currentGroup.getNameGroup();
				User creator = currentGroup.getCreator();
				String motivation = currentGroup.getMotivation();
				String expectedDate = currentGroup.getExpectedDate();
				List<User> members = currentGroup.getMembers();
				List<Transportation> tRANSPORTATION = currentGroup.getTRANSPORTATION();
				int numberOfMembers = currentGroup.getNumberOfMembers();
				List<Restaurant> rESTAURANT = currentGroup.getRESTAURANT();
				List<Accommodation> aCCOMODATION = currentGroup.getACCOMMODATION();
				double totalPrice = currentGroup.getTotalPrice();
				Transportation transport = new Transportation(transportMode, cost);
				tRANSPORTATION.add(transport);

				Group group = new Group(names, creator, motivation, expectedDate, members, tRANSPORTATION,
						numberOfMembers, rESTAURANT, aCCOMODATION, totalPrice);

				DatabaseProvider.getGroups().add(group);

				DatabaseProvider.getGroups().remove(currentGroup);
			}
		}
	}

}
