package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Group;
import model.User;
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
		if (source == view.getButtonConfirm()) {
			registerNewGroup();
			System.out.println(DatabaseProvider.getGroups());
			new Home();
		} else if (source == view.getButtonCancel()) {
			new Home();
		}
	}

	private void registerNewGroup() {
		String name = view.getFieldName().getText();
		User creator = resgatarUserEscolhido(view.getFieldCreator().getSelectedItem().toString());
		String expectedDate = view.getFieldData().getText();
		String motivation = view.getFieldMotivation().getText();

		Group group = new Group(name, creator, expectedDate, motivation);

		DatabaseProvider.getGroups().add(group);
	}

	public DefaultComboBoxModel<Object> updateModel() {
		return new DefaultComboBoxModel<>(criarArrayUser());
	}

	public Object[] criarArrayUser() {
		List<String> model = new ArrayList<>();

		for (User user : DatabaseProvider.getUsers()) {
			model.add(user.getName());
		}

		return model.toArray();
	}

	public User resgatarUserEscolhido(String nome) {
		for (User useratual : DatabaseProvider.getUsers()) {
			if (useratual.getName().equals(nome)) {
				return useratual;
			}
		}

		return null;
	}
}
