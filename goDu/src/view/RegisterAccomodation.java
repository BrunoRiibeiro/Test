package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.RegisterAccomodationController;

/**
 * JPanel para cadastrar um Grupo.
 * 
 * Herda a classe Jstructure que contem um fundo, titulo e dois botoes.
 * 
 */
public class RegisterAccomodation extends JstructureRegisters implements ActionListener {
	private static final long serialVersionUID = 1L;
	private final JTextField fieldAccomodation, fieldCost;
	private final RegisterAccomodationController controller = new RegisterAccomodationController(this);

	/**
	 * Cria o panel com os campos para cadastro.
	 */
	public RegisterAccomodation() {
		super("Cadastre uma nova Acomodação");

		JLabel labelAccomodation = new JLabel("Lugar de acomodação:");
		labelAccomodation.setFont(JstructureRegisters.FONT);
		labelAccomodation.setHorizontalAlignment(SwingConstants.RIGHT);
		labelAccomodation.setBounds(169, 195, 175, 13);
		this.add(labelAccomodation);

		JLabel labelCost = new JLabel("Preço da acomodação:");
		labelCost.setFont(JstructureRegisters.FONT);
		labelCost.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCost.setBounds(169, 243, 175, 13);
		this.add(labelCost);

		fieldAccomodation = new JTextField();
		labelAccomodation.setLabelFor(fieldAccomodation);
		fieldAccomodation.setBounds(405, 192, 147, 19);
		this.add(fieldAccomodation);
		fieldAccomodation.setColumns(10);

		fieldCost = new JTextField();
		labelCost.setLabelFor(fieldCost);
		fieldCost.setBounds(405, 240, 147, 19);
		add(fieldCost);
		fieldCost.setColumns(10);

	}

	public JTextField getTextFieldAccomodation() {
		return fieldAccomodation;
	}

	public JTextField getTextFieldCost() {
		return fieldCost;

	}

	public RegisterAccomodationController getController() {
		return controller;
	}

	/**
	 * Executa o comando para o botao selecionado.
	 * 
	 * implementacao da interface ActionListener, porem ainda nao implementado
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}
}
