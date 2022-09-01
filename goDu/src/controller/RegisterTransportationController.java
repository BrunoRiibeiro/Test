package controller;

import java.util.List;

import model.Accommodation;
import model.Group;
import model.Restaurant;
import model.Transportation;
import model.User;
import model.database.DatabaseProvider;
import view.EditGroup;
import view.RegisterTransportation;

public class RegisterTransportationController {

	private final RegisterTransportation view;

	public RegisterTransportationController(RegisterTransportation view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			String pickedNameSplitted = ShowGroupController.nameGroupEdit.substring(0,
					ShowGroupController.nameGroupEdit.lastIndexOf(" -"));
			registerNewTransport((pickedNameSplitted));
			System.out.println(DatabaseProvider.getGroups());
			new EditGroup();
		} else if (source == view.getButtonCancel()) {
			new EditGroup();
		}

		view.dispose();
	}

	public void registerNewTransport(String name) {
		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (name.equals(currentGroup.getNameGroup())) {

				String date = view.getFieldTravelDate().getText();
				String locale = view.getFieldLocale().getText();
				String transportMode = view.getTextFieldTransportation().getText();
				Double transportationCost = Double.parseDouble(view.getTextFieldCost().getText());

				String names = currentGroup.getNameGroup();
				User creator = currentGroup.getCreator();
				String motivation = currentGroup.getMotivation();
				String expectedDate = currentGroup.getExpectedDate();
				List<Transportation> newTransportation = currentGroup.getTransportation();
				int numberOfMembers = currentGroup.getNumberOfMembers();
				List<Restaurant> restaurant = currentGroup.getRestaurant();
				List<Accommodation> accommodation = currentGroup.getAccommodation();
				double totalPrice = currentGroup.getTotalPrice() + transportationCost;
				Transportation transport = new Transportation(date, locale, transportMode, transportationCost);
				newTransportation.add(transport);

				Group group = new Group(names, creator, motivation, expectedDate, newTransportation, numberOfMembers,
						restaurant, accommodation, totalPrice);

				DatabaseProvider.getGroups().add(group);

				DatabaseProvider.getGroups().remove(currentGroup);
			}
		}
	}

}
