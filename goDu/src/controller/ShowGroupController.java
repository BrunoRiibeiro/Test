package controller;

import javax.swing.DefaultListModel;

import model.Group;
import model.database.DatabaseProvider;
import view.EditGroup;
import view.Home;
import view.RegisterGroup;
import view.ShowGroup;

public class ShowGroupController {
	private ShowGroup view;
	public static Group pickedGroupEdit;
	public static String nameGroupEdit;
	private Group pickedGroup;

	public ShowGroupController(ShowGroup view) {
		super();
		this.view = view;
	}

	public ShowGroupController() {

	}

	public void sendAction(Object source) {
		if (source == view.getButtonBack()) {
			new Home();
		} else if (source == view.getButtonEdit()) {
			nameGroupEdit = view.getFieldGroups().getSelectedValue();

			if (nameGroupEdit != null) {
				pickedGroup = searchForPickedGroup(nameGroupEdit);
				new EditGroup();

			}
		} else if (source == view.getButtonNewGroup()) {
			new RegisterGroup();
		} else if (source == view.getButtonDelete()) {
			deletePickedGroup();
		}

		view.dispose();
	}

	public Group getPickedGroup() {
		return pickedGroup;
	}

	public Group searchForPickedGroup(String name) {
		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (name.equals(currentGroup.getNameGroup())) {
				return currentGroup;
			}
		}
		return null;
	}

	public void deletePickedGroup() {
		String pickedName = view.getFieldGroups().getSelectedValue();
		String pickedNameSplitted = pickedName.substring(0, pickedName.lastIndexOf(" -"));

		if (pickedName != null) {
			pickedGroup = searchForPickedGroup(pickedNameSplitted);
			DatabaseProvider.getGroups().remove(pickedGroup);
		}

		new ShowGroup();
	}

	public DefaultListModel<String> updateList() {
		DefaultListModel<String> names = new DefaultListModel<>();

		for (Group currentGroup : DatabaseProvider.getGroups()) {
			names.addElement(currentGroup.getNameGroup() + " - Preço total: " + currentGroup.getTotalPrice());
		}

		return names;
	}
}