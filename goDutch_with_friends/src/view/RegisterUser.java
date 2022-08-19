package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.RegisterUserController;

public class RegisterUser extends JFrame implements ActionListener {

	private final JTextField textFieldName;
	private final JTextField textFieldBrithday;
	private final JLabel labelName;
	private final JLabel labelBirthday;
	private final JButton buttonRegister;
	private final JFrame frame;
	private final JPanel panel;
	private final RegisterUserController controller;


	
	public RegisterUser() {
		frame = new JFrame();
		
		labelName = new JLabel("Nome:");
		labelName.setBounds(280, 185, 267, 31);
		frame.add(labelName);
		
		labelBirthday = new JLabel("Data de nascimento:");
		labelBirthday.setBounds(280, 254, 267, 31);
		frame.add(labelBirthday);
		
		
		
		textFieldName = new JTextField();
		textFieldName.setBounds(280, 213, 187, 31);
		labelName.setLabelFor(textFieldName);
		frame.add(textFieldName);
		
		textFieldBrithday = new JTextField();
		textFieldBrithday.setBounds(280, 282, 187, 31);
		labelBirthday.setLabelFor(textFieldBrithday);
		frame.add(textFieldBrithday);
		
		buttonRegister = new JButton("Cadastrar");
		buttonRegister.setEnabled(true);
		buttonRegister.setBackground(Color.PINK);
		buttonRegister.setForeground(Color.BLACK);
		buttonRegister.setBounds(280, 340, 125, 31);
		buttonRegister.addActionListener(this);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 20, 31));
		panel.setLayout(null);
		panel.add(buttonRegister);

		
		
		frame.setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 830, 522);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Cadastro de Usuário");
		frame.setVisible(true);
		
		
		controller = new RegisterUserController(this);
	}

	
	public JTextField getTextFieldName() {
		return textFieldName;
	}


	public JTextField getTextFieldBrithday() {
		return textFieldBrithday;
	}

	public JLabel getLabelName() {
		return labelName;
	}

	public JLabel getLabelBirthday() {
		return labelBirthday;
	}

	public JButton getButtonRegister() {
		return buttonRegister;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JPanel getPanel() {
		return panel;
	}

	public RegisterUserController getController() {
		return controller;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}
	
}
