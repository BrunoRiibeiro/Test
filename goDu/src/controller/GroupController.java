package controller;

import javax.swing.DefaultListModel;

import model.Group;
import model.database.DatabaseProvider;
import view.GroupView;
import view.Home;
import view.RegisterGroup;

public class GroupController {
	private final GroupView view;
	private Group pickedGroup;

	public GroupController(GroupView view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonBack()) {
			new Home();
		} else if (source == view.getButtonEdit()) {
			String pickedName = view.getFieldGroups().getSelectedValue();

			if (pickedName != null) {
				pickedGroup = recoverPickedGroup(pickedName);
				// new RegisterGroup();
				// MainFrameControl.mostrarCadastraPapel();
			}
		} else if (source == view.getButtonNewGroup()) {
			new RegisterGroup();
		}
	}

	public Group getPickedGroup() {
		return pickedGroup;
	}

	public Group recoverPickedGroup(String name) {
		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (name.equals(currentGroup.getNameGroup())) {
				return currentGroup;
			}
		}
		return null;
	}

	public DefaultListModel<String> updateList() {
		DefaultListModel<String> names = new DefaultListModel<>();

		for (Group currentGroup : DatabaseProvider.getGroups()) {
			names.addElement(currentGroup.getNameGroup());
		}

		return names;
	}
}