package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.TransportationController;

/**
 * JPanel para cadastrar um Grupo.
 * 
 * Herda a classe Jstructure que contem um fundo, titulo e dois botoes.
 * 
 */
public class RegisterTransportation extends JstructureRegisters implements ActionListener {
	private static final long serialVersionUID = 1L;
	private final JTextField fieldTransportation, fieldCost;
	private final TransportationController controller = new TransportationController(this);

	/**
	 * Cria o panel com os campos para cadastro.
	 */
	public RegisterTransportation() {
		super("Cadastre um novo Transporte");

		JLabel labelTransportation = new JLabel("Modo de transporte:");
		labelTransportation.setFont(JstructureRegisters.FONT);
		labelTransportation.setHorizontalAlignment(SwingConstants.RIGHT);
		labelTransportation.setBounds(169, 195, 175, 13);
		this.add(labelTransportation);

		JLabel labelCost = new JLabel("Preço do transporte:");
		labelCost.setFont(JstructureRegisters.FONT);
		labelCost.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCost.setBounds(169, 243, 175, 13);
		this.add(labelCost);

		fieldTransportation = new JTextField();
		labelTransportation.setLabelFor(fieldTransportation);
		fieldTransportation.setBounds(405, 192, 147, 19);
		this.add(fieldTransportation);
		fieldTransportation.setColumns(10);

		fieldCost = new JTextField();
		labelCost.setLabelFor(fieldCost);
		fieldCost.setBounds(405, 240, 147, 19);
		add(fieldCost);
		fieldCost.setColumns(10);

	}

	public JTextField getTextFieldTransportation() {
		return fieldTransportation;
	}

	public JTextField getTextFieldCost() {
		return fieldCost;

	}

	public TransportationController getController() {
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
