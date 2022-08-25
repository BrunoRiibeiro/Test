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
	private final JButton buttonRegisterUser, buttonFriends, buttonProfile;
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

		buttonFriends = new JButton("Cadastrar Grupo");
		buttonFriends.setEnabled(true);
		buttonFriends.setBackground(Color.PINK);
		buttonFriends.setForeground(Color.BLACK);
		buttonFriends.setBounds(280, 254, 267, 31);
		buttonFriends.addActionListener(this);

		buttonProfile = new JButton("Profile");
		buttonProfile.setEnabled(true);
		buttonProfile.setBackground(Color.PINK);
		buttonProfile.setForeground(Color.BLACK);
		buttonProfile.setBounds(280, 295, 267, 31);
		buttonProfile.addActionListener(this);

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 20, 31));
		panel.setLayout(null);
		panel.add(buttonRegisterUser);
		panel.add(buttonFriends);
		panel.add(buttonProfile);

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

	public JButton getButtonFriends() {
		return buttonFriends;
	}

	public JButton getButtonProfile() {
		return buttonProfile;
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
