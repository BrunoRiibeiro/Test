package controller;

import javax.swing.DefaultListModel;

import model.User;
import model.database.DatabaseProvider;
import view.Home;
import view.RegisterGroup;
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
			String pickedName = view.getFieldGroups().getSelectedValue();

			if (pickedName != null) {
				pickedUser = recoverPickedUser(pickedName);
				// new RegisterUser();
				// MainFrameControl.mostrarCadastraPapel();
			}
		} else if (source == view.getButtonNewGroup()) {
			new RegisterGroup();
		}
	}
	public User getPickedUser() {
		return pickedUser;
	}
	
	public User recoverPickedUser(String name) {
		for (User currentUser : DatabaseProvider.getUsers()) {
			if (name.equals(currentUser.getName())) {
				return currentUser;
			}
		}
		return null;
	}

	public DefaultListModel<String> updateList() {
		DefaultListModel<String> names = new DefaultListModel<>();

		for (User currentUser : DatabaseProvider.getUsers()) {
			names.addElement(currentUser.getName());
		}

		return names;
	}
}