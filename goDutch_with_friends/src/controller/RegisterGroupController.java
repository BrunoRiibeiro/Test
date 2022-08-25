package controller;

import model.Group;
import model.database.DatabaseProvider;
import view.Home;
import view.RegisterGroup;

public class RegisterGroupController {

	private final RegisterGroup view;

	public RegisterGroupController(RegisterGroup view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirmar()) {
			registerNewGroup();
			System.out.println(DatabaseProvider.getGroups());
			new Home();
		} else if (source == view.getButtonCancelar()) {
			new Home();
		}
	}

	private void registerNewGroup() {
		String name = view.getFieldName().getText();
		String creator = view.getFieldCreator().getText();
		String expectedDate = view.getFieldData().getText();
		String motivation = view.getFieldMotivation().getText();

		Group group = new Group(name, creator, expectedDate, motivation);

		DatabaseProvider.getGroups().add(group);
	}

}
