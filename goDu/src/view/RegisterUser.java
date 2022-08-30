package view;

import java.awt.event.ActionEvent;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.RegisterUserController;

/**
 * JPanel para cadastrar um Grupo.
 * 
 * Herda a classe Jstructure que contem um fundo, titulo e dois botoes.
 * 
 */
public class RegisterUser extends JstructureRegisters {
	private static final long serialVersionUID = 1L;
	private final JTextField fieldName;
	private final JFormattedTextField expectedDate;
	private final RegisterUserController controller = new RegisterUserController(this);

	/**
	 * Cria o panel com os campos para cadastro.
	 */
	public RegisterUser() {
		super("Cadastre um novo Usuário");

		JLabel labelNome = new JLabel("Nome:");
		labelNome.setFont(JstructureRegisters.FONT);
		labelNome.setHorizontalAlignment(SwingConstants.RIGHT);
		labelNome.setBounds(169, 195, 175, 13);
		this.add(labelNome);

		JLabel labelData = new JLabel("Data de Nascimento:");
		labelData.setFont(JstructureRegisters.FONT);
		labelData.setHorizontalAlignment(SwingConstants.RIGHT);
		labelData.setBounds(169, 243, 175, 13);
		this.add(labelData);

		fieldName = new JTextField();
		labelNome.setLabelFor(fieldName);
		fieldName.setBounds(405, 192, 147, 19);
		this.add(fieldName);
		fieldName.setColumns(10);

		expectedDate = new JFormattedTextField(this.maskingDate());
		labelData.setLabelFor(expectedDate);
		expectedDate.setBounds(405, 240, 147, 19);
		this.add(expectedDate);
	}

	public JTextField getTextFieldName() {
		return fieldName;
	}

	public JFormattedTextField getTextFieldBirthday() {
		return expectedDate;

	}

	public RegisterUserController getController() {
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
