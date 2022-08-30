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
import view.RegisterTransportation;

public class TransportationController {

	private final RegisterTransportation view;

	public TransportationController(RegisterTransportation view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			registerNewTransport();
			System.out.println(DatabaseProvider.getGroups());
			new Home();
		} else if (source == view.getButtonCancel()) {
			new EditGroup();
		}
	}

	private void registerNewTransport() {

		String transportMode = view.getTextFieldTransportation().getText();
		Double cost = Double.parseDouble(view.getTextFieldCost().getText());
		Group oldGroup = GroupController.pickedGroupEdit;

		String name = oldGroup.getNameGroup();
		User creator = oldGroup.getCreator();
		String motivation = oldGroup.getMotivation();
		String expectedDate = oldGroup.getExpectedDate();
		List<User> members = oldGroup.getMembers();
		List<Transportation> tRANSPORTATION = oldGroup.getTRANSPORTATION();
		int numberOfMembers = oldGroup.getNumberOfMembers();
		List<Restaurant> rESTAURANT = oldGroup.getRESTAURANT();
		List<Accomodation> aCCOMODATION = oldGroup.getACCOMODATION();
		double totalPrice = oldGroup.getTotalPrice();
		Transportation transport = new Transportation(transportMode, cost);
		tRANSPORTATION.add(transport);

		Group group = new Group(name, creator, motivation, expectedDate, members, tRANSPORTATION, numberOfMembers,
				rESTAURANT, aCCOMODATION, totalPrice);

		DatabaseProvider.getGroups().add(group);
		DatabaseProvider.getGroups().remove(oldGroup);
	}

}
