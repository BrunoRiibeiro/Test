package controller;

import model.database.DatabaseProvider;
import view.RegisterGroup;

public class RegisterGroupController {

	public RegisterGroupController(RegisterGroup view) {
		super();
	}

	public void sendAction(Object source) {
		registerNewGroup();
		System.out.println(DatabaseProvider.getGroups());
	}

	private void registerNewGroup() {

	}

	public void executarBotao(Object source) {
		// TODO Auto-generated method stub

	}

}
