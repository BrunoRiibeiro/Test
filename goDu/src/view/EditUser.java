package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.EditUserController;

/**
 * JPanel para cadastrar um Grupo.
 * 
 * Herda a classe Jstructure que contem um fundo, titulo e dois botoes.
 * 
 */
public class EditUser extends JstructureRegisters implements ActionListener {
	private static final long serialVersionUID = 1L;
	private final JTextField fieldName;
	private final JFormattedTextField expectedDate;
	private final EditUserController controller = new EditUserController(this);

	/**
	 * Cria o panel com os campos para cadastro.
	 */
	public EditUser() {
		super("Editando Usuario");

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

	public EditUserController getController() {
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
