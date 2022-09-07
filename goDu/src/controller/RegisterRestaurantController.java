package controller;

import java.util.List;

import model.Accommodation;
import model.Group;
import model.Restaurant;
import model.Transportation;
import model.User;
import model.database.DatabaseProvider;
import view.EditGroup;
import view.RegisterRestaurant;

public class RegisterRestaurantController {

	private RegisterRestaurant view;

	public RegisterRestaurantController(RegisterRestaurant view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			String pickedNameSplitted = view.getPickedGroupEdit().getNameGroup();
			registerNewRestaurant((pickedNameSplitted));
			System.out.println(DatabaseProvider.getGroups());
			new EditGroup(view.getPickedGroupEdit());
		} else if (source == view.getButtonCancel()) {
			new EditGroup(view.getPickedGroupEdit());
		}

		view.dispose();
	}

	public void registerNewRestaurant(String name) {
		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (name.equals(currentGroup.getNameGroup())) {

				String date = view.getFieldDate().getText();
				String locale = view.getFieldlocale().getText();
				String nameRestaurant = view.getFieldRestaurant().getText();
				Integer stars = Integer.parseInt(view.getFieldStars().getText());
				String meal = view.getFieldMeal().getText();
				double mealCost = Double.parseDouble(view.getFieldCost().getText());

				String names = currentGroup.getNameGroup();
				User creator = currentGroup.getCreator();
				String motivation = currentGroup.getMotivation();
				String expectedDate = currentGroup.getExpectedDate();
				List<Transportation> transportation = currentGroup.getTransportation();
				int numberOfMembers = currentGroup.getNumberOfMembers();
				List<Restaurant> newRestaurant = currentGroup.getRestaurant();
				List<Accommodation> accommodation = currentGroup.getAccommodation();
				double totalPrice = currentGroup.getTotalPrice() + mealCost;
				Restaurant restaurant = new Restaurant(date, locale, nameRestaurant, stars, meal, mealCost);
				newRestaurant.add(restaurant);

				Group group = new Group(names, creator, motivation, expectedDate, transportation, numberOfMembers,
						newRestaurant, accommodation, totalPrice);

				DatabaseProvider.getGroups().add(group);

				DatabaseProvider.getGroups().remove(currentGroup);
			}
		}
	}

}
