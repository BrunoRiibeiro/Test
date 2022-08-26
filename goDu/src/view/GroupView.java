package view;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controller.GroupController;

/**
 * JPanel para selecionar grupo para a edicao.
 * 
 */
public class GroupView extends JPanel implements ActionListener {
	private static final long serialVersionUID = 3378863774624440091L;
	private final JList<String> fieldGroups;
	private final JButton buttonSelect;
	private final JButton buttonNewGroup;
	private final JButton buttonFinish;
	private GroupController controller = new GroupController(this);

	/**
	 * Cria o panel com uma lista com bot�o, um bot�o para cadastrar um novo grupo e
	 * um bot�o para finalizar o cadastro.
	 */
	public GroupView() {
		
		JFrame frame = new JFrame();
		frame.setBackground(new Color(245, 245, 220));
		frame.setLayout(null);
		frame.setBounds(100, 100, 830, 522);

		JLabel labelTitle = new JLabel("Grupos cadastrados:");
		labelTitle.setFont(Jstructure.FONT);
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(278, 61, 254, 16);
		frame.add(labelTitle);

		JLabel labelTitle2 = new JLabel("Lista:");
		labelTitle2.setFont(Jstructure.FONT);
		labelTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle2.setBounds(108, 84, 602, 16);
		frame.add(labelTitle2);

		buttonSelect = new JButton("Selecionar");
		buttonSelect.setForeground(new Color(153, 51, 102));
		buttonSelect.setFont(Jstructure.FONT);
		buttonSelect.setBackground(Color.LIGHT_GRAY);
		buttonSelect.setBounds(122, 410, 117, 21);
		buttonSelect.addActionListener(this);
		frame.add(buttonSelect);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(122, 110, 588, 289);
		frame.add(scrollPane);

		fieldGroups = new JList<>();
		scrollPane.setViewportView(fieldGroups);
		fieldGroups.setModel(controller.updateList());
		fieldGroups.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		fieldGroups.setFont(Jstructure.FONT);
		fieldGroups.setForeground(Color.BLACK);
		fieldGroups.setBackground(new Color(245, 245, 220));

		buttonNewGroup = new JButton("Novo usuario");
		buttonNewGroup.setFont(Jstructure.FONT);
		buttonNewGroup.setForeground(Color.BLACK);
		buttonNewGroup.setBackground(SystemColor.activeCaption);
		buttonNewGroup.setBounds(122, 437, 182, 49);
		buttonNewGroup.addActionListener(this);
		frame.add(buttonNewGroup);

		buttonFinish = new JButton("Finalizar");
		buttonFinish.setEnabled(false);
		buttonFinish.setForeground(new Color(153, 0, 0));
		buttonFinish.setFont(Jstructure.FONT);
		buttonFinish.setBackground(Color.LIGHT_GRAY);
		buttonFinish.setBounds(601, 460, 107, 21);
		buttonFinish.addActionListener(this);
		frame.add(buttonFinish);

		frame.setVisible(true);

	}

	public JButton getButtonSelect() {
		return buttonSelect;
	}

	public JButton getButtonFinish() {
		return buttonFinish;
	}

	public GroupController getController() {
		return controller;
	}

	/**
	 * Executa o comando para o bot�o selecionado.
	 * 
	 * implementa��o da interface ActionListener
	 */
	public JList<String> getFieldGroups() {
		return fieldGroups;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}
}