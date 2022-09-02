package end_to_end;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.database.DatabaseProvider;
import view.RegisterGroup;
import view.RegisterUser;
import view.ShowInformationGroup;

class InformationGroupsTest {

	@BeforeEach
	void cleanDatabase() {
		DatabaseProvider.getGroups().clear();
	}

	@Test
	void tryToGetInformationOfGroups() {
		var userTest = new RegisterUser();

		userTest.getFieldName().setText("Leo King");
		userTest.getFieldBirthday().setText("03/07/2002");

		userTest.getButtonConfirm().doClick();

		var groupTest = new RegisterGroup();

		groupTest.getFieldName().setText("Amigos do Leo");
		groupTest.getFieldCreator().setSelectedItem(userTest);
		groupTest.getFieldDate().setText("03/07/2023");
		groupTest.getFieldMotivation().setText("Niver");

		assertTrue(DatabaseProvider.getGroups().isEmpty());

		groupTest.getButtonConfirm().doClick();

		assertEquals(1, DatabaseProvider.getGroups().size());

		var informationGroupTest = new ShowInformationGroup();
//		var controllerGroupTest = new ShowInformationGroupController(informationGroupTest);

		informationGroupTest.getFieldGroup().setSelectedItem(groupTest);

		assertEquals(
				"    - Nome do grupo: Amigos do Leo\n" + "    - Criador: Leo King\n" + "    - Motivação: Niver\n"
						+ "    - Data de planejamento: 03/07/2023\n" + "    - Números de membros: 1\n"
						+ "    - Preço Total: 0\n" + "    - Preço por Membro: 0\n"
						+ "    ____________________________________________________ \n"
						+ "    - Não há transportes cadastrados nesse grupo \n"
						+ "    ____________________________________________________ \n"
						+ "    - Não há restaurantes cadastrados nesse grupo \n"
						+ "    ____________________________________________________ \n" + ""
						+ "    - Não há acomodações cadastrados nesse grupo \n",
				informationGroupTest.getFieldReport().getText());
	}

}
