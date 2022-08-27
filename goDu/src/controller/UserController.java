package controller;

import javax.swing.DefaultListModel;

import model.User;
import model.database.DatabaseProvider;
import view.Home;
import view.RegisterUser;
import view.UserView;

public class UserController {
	private final UserView view;
	private User pickedUser;

	public UserController(UserView view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonBack()) {
			new Home();
		} else if (source == view.getButtonEdit()) {
			String pickedName = view.getFieldUser().getSelectedValue();

			if (pickedName != null) {
				pickedUser = recoverPickedUser(pickedName);
				// new RegisterUser();
				// MainFrameControl.mostrarCadastraPapel();
			}
		} else if (source == view.getButtonNewUser()) {
			new RegisterUser();
		}
	}

	public User getPickedUser() {
		return pickedUser;
	}

	public User recoverPickedUser(String nome) {
		for (User currentUser : DatabaseProvider.getUsers()) {
			if (nome.equals(currentUser.getName())) {
				return currentUser;
			}
		}
		return null;
	}

	/**
	 * Gera um Model com o nome de todos os atores cadastrados.
	 * 
	 * @return DefaultListModel
	 */
	public DefaultListModel<String> updateList() {
		DefaultListModel<String> names = new DefaultListModel<>();

		for (User currentUser : DatabaseProvider.getUsers()) {
			names.addElement(currentUser.getName());
		}

		return names;
	}

}