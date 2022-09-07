package view;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.border.LineBorder;

import controller.ShowGroupController;

/**
 * JPanel para selecionar grupo para a edicao.
 * 
 */
public class ShowGroup extends JstructureShow {
	private static final long serialVersionUID = 3378863774624440091L;
	private ShowGroupController controller = new ShowGroupController(this);
	private final JList<String> fieldGroups;
	private final JButton buttonNewGroup;

	/**
	 * Cria o panel com uma lista com bot�o, um bot�o para cadastrar um novo grupo e
	 * um bot�o para finalizar o cadastro.
	 */
	public ShowGroup() {
		super("Grupos", "Grupos cadastrados:", "Lista:");

		fieldGroups = new JList<>();
		fieldGroups.setModel(controller.updateList());
		fieldGroups.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		fieldGroups.setFont(JstructureShow.FONT);
		fieldGroups.setForeground(Color.BLACK);
		fieldGroups.setBackground(new Color(245, 245, 220));
		this.addSourceList(fieldGroups);

		buttonNewGroup = new JButton("Novo grupo");
		buttonNewGroup.setFont(JstructureShow.FONT);
		buttonNewGroup.setForeground(new Color(33, 113, 204));
		buttonNewGroup.setBackground(Color.LIGHT_GRAY);
		buttonNewGroup.setBounds(122, 420, 117, 21);
		buttonNewGroup.setEnabled(true);
		buttonNewGroup.addActionListener(this);
		this.add(buttonNewGroup);

		this.setVisible(true);
	}

	public JList<String> getFieldGroups() {
		return fieldGroups;
	}

	public JButton getButtonNewGroup() {
		return buttonNewGroup;
	}

	public ShowGroupController getController() {
		return controller;
	}

	/**
	 * Executa o comando para o bot�o selecionado.
	 * 
	 * implementa��o da interface ActionListener
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}
}