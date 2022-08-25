package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.HomeController;

public class Home implements ActionListener {

	private final JFrame frame;
	private final JButton buttonRegisterUser, buttonRegisterGroup, buttonGroup, buttonUser;
	private final JPanel panel;
	private final HomeController controller;

	public Home() {
		frame = new JFrame();

		buttonRegisterUser = new JButton("Cadastrar Usuário");
		buttonRegisterUser.setEnabled(true);
		buttonRegisterUser.setBackground(Color.PINK);
		buttonRegisterUser.setForeground(Color.BLACK);
		buttonRegisterUser.setBounds(280, 213, 267, 31);
		buttonRegisterUser.addActionListener(this);

		buttonRegisterGroup = new JButton("Cadastrar Grupo");
		buttonRegisterGroup.setEnabled(true);
		buttonRegisterGroup.setBackground(Color.PINK);
		buttonRegisterGroup.setForeground(Color.BLACK);
		buttonRegisterGroup.setBounds(280, 254, 267, 31);
		buttonRegisterGroup.addActionListener(this);

		buttonGroup = new JButton("Grupos");
		buttonGroup.setEnabled(true);
		buttonGroup.setBackground(Color.PINK);
		buttonGroup.setForeground(Color.BLACK);
		buttonGroup.setBounds(280, 295, 267, 31);
		buttonGroup.addActionListener(this);

		buttonUser = new JButton("Usuarios");
		buttonUser.setEnabled(true);
		buttonUser.setBackground(Color.PINK);
		buttonUser.setForeground(Color.BLACK);
		buttonUser.setBounds(280, 336, 267, 31);
		buttonUser.addActionListener(this);

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 20, 31));
		panel.setLayout(null);
		panel.add(buttonRegisterUser);
		panel.add(buttonRegisterGroup);
		panel.add(buttonGroup);
		panel.add(buttonUser);

		frame.setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 830, 522);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("goDu");
		frame.setVisible(true);

		controller = new HomeController(this);
	}

	public JFrame getFrame() {
		return frame;
	}

	public JButton getButtonRegisterUser() {
		return buttonRegisterUser;
	}

	public JButton getButtonRegisterGroup() {
		return buttonRegisterGroup;
	}

	public JButton getButtonGroup() {
		return buttonGroup;
	}

	public JButton getButtonUser() {
		return buttonUser;
	}

	public JPanel getPanel() {
		return panel;
	}

	public HomeController getController() {
		return controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}

}
