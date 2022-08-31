package view;

import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.RegisterAccommodationController;

/**
 * JPanel para cadastrar um Grupo.
 * 
 * Herda a classe Jstructure que contem um fundo, titulo e dois botoes.
 * 
 */
public class RegisterAccommodation extends JstructureRegisters {
	private static final long serialVersionUID = 1L;
	private final JTextField fieldAccommodation, fieldCost;
	private final RegisterAccommodationController controller = new RegisterAccommodationController(this);

	/**
	 * Cria o panel com os campos para cadastro.
	 */
	public RegisterAccommodation() {
		super("Cadastre uma nova Acomodação");

		JLabel labelAccommodation = new JLabel("Lugar de acomodação:");
		labelAccommodation.setFont(JstructureRegisters.FONT);
		labelAccommodation.setHorizontalAlignment(SwingConstants.RIGHT);
		labelAccommodation.setBounds(169, 195, 175, 13);
		this.add(labelAccommodation);

		JLabel labelCost = new JLabel("Preço da acomodação:");
		labelCost.setFont(JstructureRegisters.FONT);
		labelCost.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCost.setBounds(169, 243, 175, 13);
		this.add(labelCost);

		fieldAccommodation = new JTextField();
		labelAccommodation.setLabelFor(fieldAccommodation);
		fieldAccommodation.setBounds(405, 192, 147, 19);
		this.add(fieldAccommodation);
		fieldAccommodation.setColumns(10);

		fieldCost = new JTextField();
		labelCost.setLabelFor(fieldCost);
		fieldCost.setBounds(405, 240, 147, 19);
		add(fieldCost);
		fieldCost.setColumns(10);

	}

	public JTextField getTextFieldAccommodation() {
		return fieldAccommodation;
	}

	public JTextField getTextFieldCost() {
		return fieldCost;

	}

	public RegisterAccommodationController getController() {
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
