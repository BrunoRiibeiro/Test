package view;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import controller.HomeController;

public class Home extends Jstructure {

	private static final long serialVersionUID = 9127820873016844085L;
	private final HomeController controller = new HomeController(this);
	private JButton button5;

	public Home() {
		super("goDu", "Cadastrar Usuário", "Cadastrar Grupo", "Grupos", "Usuarios");

		button5 = new JButton("Informações do grupo");
		button5.setEnabled(true);
		button5.setForeground(new Color(0, 0, 0));
		button5.setBackground(Color.LIGHT_GRAY);
		button5.setBounds(280, 377, 267, 31);
		button5.addActionListener(this);
		this.add(button5);

		this.setVisible(true);
	}

	public JButton getButton5() {
		return button5;
	}

	public HomeController getController() {
		return controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}

}
