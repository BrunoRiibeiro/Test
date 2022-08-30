package view;

import java.awt.event.ActionEvent;

import controller.HomeController;

public class Home extends Jstructure {

	private static final long serialVersionUID = 9127820873016844085L;
	private final HomeController controller = new HomeController(this);

	public Home() {
		super("goDu", "Cadastrar Usuário", "Cadastrar Grupo", "Grupos", "Usuarios");

		this.setVisible(true);
	}

	public HomeController getController() {
		return controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}

}
