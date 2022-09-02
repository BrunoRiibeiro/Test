package view;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import controller.EditGroupController;
import model.Group;

public class EditGroup extends Jstructure {

	private static final long serialVersionUID = -7401111180569084823L;
	private final JButton buttonBackGroup;
	private Group pickedGroupEdit;
	private final EditGroupController controller = new EditGroupController(this);

	public EditGroup(Group pickedGroupEdit) {
		super("Editar Grupos", "Acomodação", "Restaurante", "Transporte", "Editar Dados do Grupo");

		this.pickedGroupEdit = pickedGroupEdit;

		buttonBackGroup = new JButton("Voltar");
		buttonBackGroup.setFont(Jstructure.FONT);
		buttonBackGroup.setForeground(new Color(110, 24, 196));
		buttonBackGroup.setBackground(Color.LIGHT_GRAY);
		buttonBackGroup.setBounds(122, 450, 117, 21);
		buttonBackGroup.setEnabled(true);
		buttonBackGroup.addActionListener(this);
		this.add(buttonBackGroup);

		this.setVisible(true);
	}

	public EditGroupController getController() {
		return controller;
	}

	public JButton getButtonBackGroup() {
		return buttonBackGroup;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}

	public Group getPickedGroupEdit() {
		return pickedGroupEdit;
	}

}
