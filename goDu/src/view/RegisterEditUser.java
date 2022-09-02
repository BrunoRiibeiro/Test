package view;

import java.awt.event.ActionEvent;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.RegisterEditUserController;
import model.User;

/**
 * JPanel para cadastrar um Grupo.
 * 
 * Herda a classe Jstructure que contem um fundo, titulo e dois botoes.
 * 
 */
public class RegisterEditUser extends JstructureRegisters {
	private static final long serialVersionUID = 1L;
	private final JTextField fieldName;
	private final JFormattedTextField expectedDate;
	private User pickedUserEdit;
	private final RegisterEditUserController controller = new RegisterEditUserController(this);

	/**
	 * Cria o panel com os campos para cadastro.
	 */
	public RegisterEditUser(User pickedUserEdit) {
		super("Editando Usuario");

		this.pickedUserEdit = pickedUserEdit;

		JLabel labelName = new JLabel("Nome:");
		labelName.setFont(JstructureRegisters.FONT);
		labelName.setHorizontalAlignment(SwingConstants.RIGHT);
		labelName.setBounds(169, 195, 175, 13);
		this.add(labelName);

		JLabel labelBirthday = new JLabel("Data de Nascimento:");
		labelBirthday.setFont(JstructureRegisters.FONT);
		labelBirthday.setHorizontalAlignment(SwingConstants.RIGHT);
		labelBirthday.setBounds(169, 243, 175, 13);
		this.add(labelBirthday);

		fieldName = new JTextField();
		labelName.setLabelFor(fieldName);
		fieldName.setBounds(405, 192, 147, 19);
		this.add(fieldName);
		fieldName.setColumns(10);

		expectedDate = new JFormattedTextField(this.maskingDate());
		labelBirthday.setLabelFor(expectedDate);
		expectedDate.setBounds(405, 240, 147, 19);
		this.add(expectedDate);
	}

	public JTextField getFieldName() {
		return fieldName;
	}

	public JFormattedTextField getFieldBirthday() {
		return expectedDate;
	}

	public RegisterEditUserController getController() {
		return controller;
	}

	public User getPickedUserEdit() {
		return pickedUserEdit;
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
