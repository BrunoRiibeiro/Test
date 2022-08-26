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

import controller.UserController;

/**
 * JPanel para selecionar grupo para a edicao.
 * 
 */
public class UserView extends JstructureShow implements ActionListener {
	private static final long serialVersionUID = 3378863774624440091L;
	private final UserController controller = new UserController(this);

	/**
	 * Cria o panel com uma lista com bot�o, um bot�o para cadastrar um novo grupo e
	 * um bot�o para finalizar o cadastro.
	 */
	public UserView() {
		super("Usuários");

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

		this.setVisible(true);
	}
	

	public UserController getController() {
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