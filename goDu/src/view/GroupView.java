package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controller.GroupController;

/**
 * JPanel para selecionar grupo para a edicao.
 * 
 */
public class GroupView extends JstructureShow implements ActionListener {
	private static final long serialVersionUID = 3378863774624440091L;
	private JList<String> fieldGroups;
	private GroupController controller = new GroupController(this);
	private final JButton buttonNewGroup;

	/**
	 * Cria o panel com uma lista com bot�o, um bot�o para cadastrar um novo grupo e
	 * um bot�o para finalizar o cadastro.
	 */
	public GroupView() {
		super("Grupos");

		JScrollPane scrollPane = new JScrollPane();

		JLabel labelTitle = new JLabel("Grupos cadastrados:");
		labelTitle.setFont(JstructureShow.FONT);
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(278, 61, 254, 16);
		this.add(labelTitle);

		JLabel labelTitle2 = new JLabel("Lista:");
		labelTitle2.setFont(JstructureShow.FONT);
		labelTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle2.setBounds(108, 84, 602, 16);
		this.add(labelTitle2);

		fieldGroups = new JList<>();
		scrollPane.setViewportView(fieldGroups);
		fieldGroups.setModel(controller.updateList());
		fieldGroups.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		fieldGroups.setFont(JstructureShow.FONT);
		fieldGroups.setForeground(Color.BLACK);
		fieldGroups.setBackground(new Color(245, 245, 220));

		buttonNewGroup = new JButton("Novo grupo");
		buttonNewGroup.setFont(JstructureShow.FONT);
		buttonNewGroup.setForeground(new Color(77, 112, 98));
		buttonNewGroup.setBackground(Color.LIGHT_GRAY);
		buttonNewGroup.setBounds(122, 420, 117, 21);
		buttonNewGroup.setEnabled(true);
		buttonNewGroup.addActionListener(this);
		this.add(buttonNewGroup);

		this.setVisible(true);
	}

	public GroupController getController() {
		return controller;
	}

	public JButton getButtonNewGroup() {
		return buttonNewGroup;
	}

	public JList<String> getFieldGroups() {
		return fieldGroups;
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