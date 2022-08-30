package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.EditGroupController;

public class EditGroup implements ActionListener {

	private final JFrame frame;
	private final JButton buttonAccommodation, buttonRestaurant, buttonTransportation, buttonEditProfile,
			buttonBackGroup;
	private final JPanel panel;
	private final EditGroupController controller = new EditGroupController(this);

	public EditGroup() {
		frame = new JFrame();

		buttonAccommodation = new JButton("Acomodação");
		buttonAccommodation.setEnabled(true);
		buttonAccommodation.setBackground(Color.PINK);
		buttonAccommodation.setForeground(Color.BLACK);
		buttonAccommodation.setBounds(280, 213, 267, 31);
		buttonAccommodation.addActionListener(this);

		buttonRestaurant = new JButton("Restaurante");
		buttonRestaurant.setEnabled(true);
		buttonRestaurant.setBackground(Color.PINK);
		buttonRestaurant.setForeground(Color.BLACK);
		buttonRestaurant.setBounds(280, 254, 267, 31);
		buttonRestaurant.addActionListener(this);

		buttonTransportation = new JButton("Transporte");
		buttonTransportation.setEnabled(true);
		buttonTransportation.setBackground(Color.PINK);
		buttonTransportation.setForeground(Color.BLACK);
		buttonTransportation.setBounds(280, 295, 267, 31);
		buttonTransportation.addActionListener(this);

		buttonEditProfile = new JButton("Editar Dados do Grupo");
		buttonEditProfile.setEnabled(true);
		buttonEditProfile.setBackground(Color.PINK);
		buttonEditProfile.setForeground(Color.BLACK);
		buttonEditProfile.setBounds(280, 336, 267, 31);
		buttonEditProfile.addActionListener(this);

		buttonBackGroup = new JButton("Voltar");
		buttonBackGroup.setFont(JstructureShow.FONT);
		buttonBackGroup.setForeground(new Color(110, 24, 196));
		buttonBackGroup.setBackground(Color.LIGHT_GRAY);
		buttonBackGroup.setBounds(122, 450, 117, 21);
		buttonBackGroup.setEnabled(true);
		buttonBackGroup.addActionListener(this);

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 20, 31));
		panel.setLayout(null);
		panel.add(buttonAccommodation);
		panel.add(buttonRestaurant);
		panel.add(buttonTransportation);
		panel.add(buttonEditProfile);
		panel.add(buttonBackGroup);

		frame.setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 830, 522);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("goDu");
		frame.setVisible(true);

	}

	public JFrame getFrame() {
		return frame;
	}

	public JButton getButtonAccommodation() {
		return buttonAccommodation;
	}

	public JButton getButtonRestaurant() {
		return buttonRestaurant;
	}

	public JButton getButtonTransportation() {
		return buttonTransportation;
	}

	public JButton getButtonEditProfile() {
		return buttonEditProfile;
	}

	public JButton getButtonBackGroup() {
		return buttonBackGroup;
	}

	public JPanel getPanel() {
		return panel;
	}

	public EditGroupController getController() {
		return controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}

}
