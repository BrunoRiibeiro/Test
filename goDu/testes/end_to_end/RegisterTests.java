package end_to_end;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.database.DatabaseProvider;
import view.RegisterGroup;
import view.RegisterRestaurant;
import view.RegisterUser;
import view.ShowGroup;

class RegisterTests {

	@BeforeEach
	void cleanDatabase() {
		DatabaseProvider.getGroups().clear();
		DatabaseProvider.getUsers().clear();
	}

	@Test
	void tryToRegisterANewUser() {
		var userTest = new RegisterUser();

		userTest.getTextFieldName().setText("Leo King");
		userTest.getTextFieldBirthday().setText("03/07/2002");

		assertTrue(DatabaseProvider.getUsers().isEmpty());

		userTest.getButtonConfirm().doClick();

		assertEquals(1, DatabaseProvider.getUsers().size());

		var savedUser = DatabaseProvider.getUsers().get(0);

		assertEquals("Leo King", savedUser.getName());
		assertEquals("03/07/2002", savedUser.getBirthday());
	}

	@Test
	void tryToRegisterANewGroup() {
		var userTest = new RegisterUser();

		userTest.getTextFieldName().setText("Leo King");
		userTest.getTextFieldBirthday().setText("03/07/2002");
		userTest.getButtonConfirm().doClick();

		var groupTest = new RegisterGroup();

		groupTest.getFieldName().setText("Amigos do Leo");
		groupTest.getFieldCreator().setSelectedItem(userTest);
		groupTest.getFieldDate().setText("03/07/2023");
		groupTest.getFieldMotivation().setText("Niver");

		assertTrue(DatabaseProvider.getGroups().isEmpty());

		groupTest.getButtonConfirm().doClick();

		assertEquals(1, DatabaseProvider.getGroups().size());

		var savedGroup = DatabaseProvider.getGroups().get(0);

		assertEquals("Amigos do Leo", savedGroup.getNameGroup());
		assertEquals("Leo King", savedGroup.getCreator().getName());
		assertEquals("03/07/2002", savedGroup.getCreator().getBirthday());
		assertEquals("03/07/2023", savedGroup.getExpectedDate());
		assertEquals("Niver", savedGroup.getMotivation());
	}

	@Test
	void tryToEditGroup() {
		var userTest = new RegisterUser();

		userTest.getTextFieldName().setText("Leo King");
		userTest.getTextFieldBirthday().setText("03/07/2002");

		userTest.getButtonConfirm().doClick();

		var groupTest = new RegisterGroup();

		groupTest.getFieldName().setText("Amigos do Leo");
		groupTest.getFieldCreator().setSelectedItem(userTest);
		groupTest.getFieldDate().setText("03/07/2023");
		groupTest.getFieldMotivation().setText("Niver");

		groupTest.getButtonConfirm().doClick();

		var showGroup = new ShowGroup();

		showGroup.getFieldGroups().setSelectedValue(DatabaseProvider.getGroups().get(0).getNameGroup(), true);
		showGroup.getButtonEdit().doClick();

		var addRestaurant = new RegisterRestaurant();

		addRestaurant.getTextFieldRestaurant().setText("Leo Bomba");
		addRestaurant.getFieldlocale().setText("Taguatinga Sul");
		addRestaurant.getFieldDate().setText("03/07/2023");
		addRestaurant.getFieldStars().setText("4");
		addRestaurant.getFieldMeal().setText("Trio Leo Tudo");
		addRestaurant.getTextFieldCost().setText("13");

		addRestaurant.getButtonConfirm().doClick();

//		var addAccommodation = new RegisterAccommodation();
//
//		addAccommodation.getTextFieldAccommodation().setText("Motel");
//		addAccommodation.getFieldLocale().setText("Taguatinga Sul");
//		addAccommodation.getFieldDate().setText("03/07/2023");
//		addAccommodation.getTextFieldCost().setText("67.9");
//
//		addAccommodation.getButtonConfirm().doClick();
//
//		var addTransportation = new RegisterTransportation();
//
//		addTransportation.getTextFieldTransportation().setText("Carroagem");
//		addTransportation.getFieldLocale().setText("Taguatinga Sul");
//		addTransportation.getFieldTravelDate().setText("03/07/2023");
//		addTransportation.getTextFieldCost().setText("23.6");
//
//		addTransportation.getButtonConfirm().doClick();

		assertEquals(1, DatabaseProvider.getGroups().size());

		var savedGroup = DatabaseProvider.getGroups().get(0);

		assertEquals("Leo Bomba", savedGroup.getRestaurant().get(0).getName());
		assertEquals("Taguatinga Sul", savedGroup.getRestaurant().get(0).getLocale());
		assertEquals("03/07/2023", savedGroup.getRestaurant().get(0).getDate());
		assertEquals("4", savedGroup.getRestaurant().get(0).getStars());
		assertEquals("Trio Leo Tudo", savedGroup.getRestaurant().get(0).getMeal());
		assertEquals("13", savedGroup.getRestaurant().get(0).getMealPrice());
//
//		assertEquals("Motel", savedGroup.getAccommodation().get(0).getAccommodation());
//		assertEquals("Taguatinga Sul", savedGroup.getAccommodation().get(0).getLocale());
//		assertEquals("03/07/2023", savedGroup.getAccommodation().get(0).getDate());
//		assertEquals("67.9", savedGroup.getAccommodation().get(0).getAccommodationCost());
//
//		assertEquals("Carroagem", savedGroup.getTransportation().get(0).getTransportMode());
//		assertEquals("Taguatinga Sul", savedGroup.getTransportation().get(0).getLocale());
//		assertEquals("03/07/2023", savedGroup.getTransportation().get(0).getDate());
//		assertEquals("23.6", savedGroup.getTransportation().get(0).getTransportCost());

	}

}
