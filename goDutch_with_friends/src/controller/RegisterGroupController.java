package controller;

import javax.swing.ListModel;

import model.database.DatabaseProvider;
import view.Groups;
import view.RegisterGroup;

public class RegisterGroupController {

	public RegisterGroupController(RegisterGroup view) {
		super();
	}

	public RegisterGroupController(Groups groups) {
		// TODO Auto-generated constructor stub
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

	public ListModel<String> atualizarModeloLista() {
		// TODO Auto-generated method stub
		return null;
	}

}
