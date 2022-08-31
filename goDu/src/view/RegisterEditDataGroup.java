package view;

import java.awt.event.ActionEvent;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.RegisterEditDataGroupController;

/**
 * JPanel para cadastrar um Grupo.
 * 
 * Herda a classe Jstructure que contem um fundo, titulo e dois botoes.
 * 
 */
public class RegisterEditDataGroup extends JstructureRegisters {
	private static final long serialVersionUID = 1L;
	private final JTextField fieldName, fieldMotivation;
	private JTextField fieldMembers;
	private final JFormattedTextField expectedDate;
	private final RegisterEditDataGroupController controller = new RegisterEditDataGroupController(this);

	/**
	 * Cria o panel com os campos para cadastro.
	 */
	public RegisterEditDataGroup() {
		super("Editando um novo Grupo");

		JLabel labelName = new JLabel("Novo nome do Grupo:");
		labelName.setFont(JstructureRegisters.FONT);
		labelName.setHorizontalAlignment(SwingConstants.RIGHT);
		labelName.setBounds(169, 195, 175, 13);
		this.add(labelName);

		JLabel labelMembers = new JLabel("Número de membros:");
		labelMembers.setFont(JstructureRegisters.FONT);
		labelMembers.setHorizontalAlignment(SwingConstants.RIGHT);
		labelMembers.setBounds(169, 243, 175, 13);
		this.add(labelMembers);

		JLabel labelData = new JLabel("Data do planejamento:");
		labelData.setFont(JstructureRegisters.FONT);
		labelData.setHorizontalAlignment(SwingConstants.RIGHT);
		labelData.setBounds(158, 297, 186, 13);
		this.add(labelData);

		JLabel labelMotivation = new JLabel("Motivação do Grupo:");
		labelMotivation.setFont(JstructureRegisters.FONT);
		labelMotivation.setHorizontalAlignment(SwingConstants.RIGHT);
		labelMotivation.setBounds(82, 343, 262, 13);
		this.add(labelMotivation);

		fieldName = new JTextField();
		labelName.setLabelFor(fieldName);
		fieldName.setBounds(405, 192, 147, 19);
		this.add(fieldName);
		fieldName.setColumns(10);

		fieldMembers = new JTextField();
		labelMembers.setLabelFor(fieldMembers);
		fieldMembers.setBounds(405, 240, 147, 21);
		this.add(fieldMembers);
		fieldMembers.setColumns(10);

		expectedDate = new JFormattedTextField(this.maskingDate());
		labelData.setLabelFor(expectedDate);
		expectedDate.setBounds(405, 294, 147, 19);
		this.add(expectedDate);

		fieldMotivation = new JTextField();
		labelMotivation.setLabelFor(fieldMotivation);
		fieldMotivation.setBounds(405, 343, 147, 19);
		this.add(fieldMotivation);
		fieldMotivation.setColumns(10);

		this.setVisible(true);

	}

	public JTextField getFieldName() {
		return fieldName;
	}

	public JTextField getFieldMembers() {
		return fieldMembers;
	}

	public JTextField getFieldMotivation() {
		return fieldMotivation;
	}

	public JFormattedTextField getFieldData() {
		return expectedDate;
	}

	public RegisterEditDataGroupController getController() {
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
