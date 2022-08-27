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

import controller.UserController;

/**
 * JPanel para selecionar grupo para a edicao.
 * 
 */
public class UserView extends JstructureShow implements ActionListener {
	private static final long serialVersionUID = 3378863774624440091L;
	private UserController controller = new UserController(this);
	private JList<String> fieldUser;
	private final JButton buttonNewUser;

	/**
	 * Cria o panel com uma lista com bot�o, um bot�o para cadastrar um novo grupo e
	 * um bot�o para finalizar o cadastro.
	 */
	public UserView() {
		super("Usuários");

		JScrollPane scrollPane = new JScrollPane();

		JLabel labelTitle = new JLabel("Usuarios cadastrados:");
		labelTitle.setFont(JstructureShow.FONT);
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(278, 61, 254, 16);
		this.add(labelTitle);

		JLabel labelTitle2 = new JLabel("Lista:");
		labelTitle2.setFont(JstructureShow.FONT);
		labelTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle2.setBounds(108, 84, 602, 16);
		this.add(labelTitle2);

		fieldUser = new JList<>();
		scrollPane.setViewportView(fieldUser);
		fieldUser.setModel(controller.updateList());
		fieldUser.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		fieldUser.setFont(JstructureShow.FONT);
		fieldUser.setForeground(Color.BLACK);
		fieldUser.setBackground(new Color(245, 245, 220));

		buttonNewUser = new JButton("Novo grupo");
		buttonNewUser.setFont(JstructureShow.FONT);
		buttonNewUser.setForeground(new Color(77, 112, 98));
		buttonNewUser.setBackground(Color.LIGHT_GRAY);
		buttonNewUser.setBounds(122, 420, 117, 21);
		buttonNewUser.setEnabled(true);
		buttonNewUser.addActionListener(this);
		this.add(buttonNewUser);

		this.setVisible(true);
	}

	public UserController getController() {
		return controller;
	}

	public JButton getButtonNewUser() {
		return buttonNewUser;
	}

	public JList<String> getFieldUser() {
		return fieldUser;
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