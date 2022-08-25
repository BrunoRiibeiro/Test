package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import controller.RegisterUserController;

/**
 * JPanel para cadastrar um Grupo.
 * 
 * Herda a classe Jstructure que contem um fundo, titulo e dois botoes.
 * 
 */
public class RegisterUser extends Jstructure implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextField fieldName;
	private JFormattedTextField expectedDate;
	private RegisterUserController controller;

	/**
	 * Cria o panel com os campos para cadastro.
	 */
	public RegisterUser() {
		super("Cadastre um novo Grupo");

		JFrame frame = new JFrame();

		controller = new RegisterUserController(this);

		frame.setBackground(new Color(255, 255, 255));
		frame.setLayout(null);
		frame.setBounds(100, 100, 830, 522);

		JLabel labelNome = new JLabel("Nome:");
		labelNome.setFont(Jstructure.FONT);
		labelNome.setHorizontalAlignment(SwingConstants.RIGHT);
		labelNome.setBounds(169, 195, 175, 13);
		frame.add(labelNome);

		JLabel labelData = new JLabel("Data de Nascimento:");
		labelData.setFont(Jstructure.FONT);
		labelData.setHorizontalAlignment(SwingConstants.RIGHT);
		labelData.setBounds(169, 243, 175, 13);
		frame.add(labelData);

		fieldName = new JTextField();
		labelNome.setLabelFor(fieldName);
		fieldName.setBounds(405, 192, 147, 19);
		frame.add(fieldName);
		fieldName.setColumns(10);

		MaskFormatter mascaraData = null;
		try {
			mascaraData = new MaskFormatter("##/##/####");
		} catch (ParseException ignore) {
			//
		}
		if (mascaraData != null) {
			mascaraData.setPlaceholderCharacter('_');
		}
		expectedDate = new JFormattedTextField(mascaraData);
		labelData.setLabelFor(expectedDate);
		expectedDate.setBounds(405, 240, 147, 19);
		frame.add(expectedDate);

		frame.add(getButtonConfirmar());
		frame.add(getButtonCancelar());

		frame.setVisible(true);
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
