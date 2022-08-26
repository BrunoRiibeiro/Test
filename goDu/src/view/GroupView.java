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
	private final JButton buttonBack, buttonEdit, buttonNewGroup, buttonDelete;
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
		
		buttonNewGroup = new JButton("Novo grupo");
		buttonNewGroup.setFont(Jstructure.FONT);
		buttonNewGroup.setForeground(new Color(77, 112, 98));
		buttonNewGroup.setBackground(Color.LIGHT_GRAY);
		buttonNewGroup.setBounds(122, 420, 117, 21);
		buttonNewGroup.setEnabled(true);
		buttonNewGroup.addActionListener(this);
		frame.add(buttonNewGroup);

		buttonBack = new JButton("Voltar");
		buttonBack.setFont(Jstructure.FONT);
		buttonBack.setForeground(new Color(110, 24, 196));
		buttonBack.setBackground(Color.LIGHT_GRAY);
		buttonBack.setBounds(122, 450, 117, 21);
		buttonBack.setEnabled(true);
		buttonBack.addActionListener(this);
		frame.add(buttonBack);

		buttonEdit = new JButton("Editar");
		buttonEdit.setFont(Jstructure.FONT);
		buttonEdit.setForeground(new Color(173, 140, 42));
		buttonEdit.setBackground(Color.LIGHT_GRAY);
		buttonEdit.setBounds(601, 420, 107, 21);
		buttonEdit.setEnabled(true);
		buttonEdit.addActionListener(this);
		frame.add(buttonEdit);
		
		buttonDelete = new JButton("Delete");
		buttonDelete.setFont(Jstructure.FONT);
		buttonDelete.setForeground(new Color(186, 17, 17));
		buttonDelete.setBackground(Color.LIGHT_GRAY);
		buttonDelete.setBounds(601, 450, 107, 21);
		buttonDelete.setEnabled(true);
		buttonDelete.addActionListener(this);
		frame.add(buttonDelete);

		frame.setVisible(true);

	}
	

	public JButton getButtonNewGroup() {
		return buttonNewGroup;
	}

	public JButton getButtonBack() {
		return buttonBack;
	}

	public JButton getButtonEdit() {
		return buttonEdit;
	}
	
	public JButton getButtonDelete() {
		return buttonDelete;
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