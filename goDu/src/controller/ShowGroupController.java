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
	private Group pickedGroupEdit;
	private String nameGroupEdit;
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

				pickedGroupEdit = model.database.DatabaseProvider.searchForPickedGroup(nameGroupEdit.substring(0, nameGroupEdit.lastIndexOf(" -")));
				new EditGroup(pickedGroupEdit);

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

	

	public void deletePickedGroup() {
		String pickedName = view.getFieldGroups().getSelectedValue();
		String pickedNameSplitted = pickedName.substring(0, pickedName.lastIndexOf(" -"));

		if (pickedName != null) {
			pickedGroup = model.database.DatabaseProvider.searchForPickedGroup(pickedNameSplitted);
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