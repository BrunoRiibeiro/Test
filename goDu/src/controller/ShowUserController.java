package controller;

import javax.swing.DefaultListModel;

import model.User;
import model.database.DatabaseProvider;
import view.Home;
import view.RegisterEditUser;
import view.RegisterUser;
import view.ShowUser;

public class ShowUserController {
	private ShowUser view;
	private User pickedUserEdit;
	private User pickedUserDelete;

	public ShowUserController() {

	}

	public ShowUserController(ShowUser view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonBack()) {
			new Home();
		} else if (source == view.getButtonEdit()) {
			String pickedName = view.getFieldUser().getSelectedValue();

			if (pickedName != null) {
				pickedUserEdit = model.database.DatabaseProvider.searchForPickedUser(pickedName);
				new RegisterEditUser(pickedUserEdit);
			}
		} else if (source == view.getButtonNewUser()) {
			new RegisterUser();
		} else if (source == view.getButtonDelete()) {
			String pickedName = view.getFieldUser().getSelectedValue();

			if (pickedName != null) {
				pickedUserDelete = model.database.DatabaseProvider.searchForPickedUser(pickedName);
				DatabaseProvider.getUsers().remove(pickedUserDelete);
			}
			new ShowUser();
		}

		view.dispose();
	}

	public User getPickedUserDelete() {
		return pickedUserDelete;
	}

	public User getPickedUserEdit() {
		return pickedUserEdit;
	}

	public void deletePickedUser() {
		String pickedName = view.getFieldUser().getSelectedValue();

		if (pickedName != null) {
			User pickedUser = model.database.DatabaseProvider.searchForPickedUser(pickedName);
			DatabaseProvider.getUsers().remove(pickedUser);
		}
		new ShowUser();
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