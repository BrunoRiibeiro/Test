package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import controller.RegisterGroupController;

/**
 * JPanel para cadastrar um Grupo.
 * 
 * Herda a classe Jstructure que contem um fundo, titulo e dois botoes.
 * 
 */
public class RegisterGroup extends Jstructure implements ActionListener {
	private static final long serialVersionUID = -7318790884045444829L;
	private JTextField fieldName;
	private JTextField fieldCreator;
	private JTextField fieldMotivation;
	private JFormattedTextField ftfieldData;
	private RegisterGroupController controller;

	/**
	 * Cria o panel com os campos para cadastro.
	 */
	public RegisterGroup() {
		super("Cadastre um novo estudio");

		// controller = new RegisterGroupController(this);

		JLabel labelNome = new JLabel("Name Group:");
		labelNome.setFont(Jstructure.FONT);
		labelNome.setHorizontalAlignment(SwingConstants.RIGHT);
		labelNome.setBounds(169, 195, 175, 13);
		add(labelNome);

		JLabel labelCreator = new JLabel("Creator User:");
		labelCreator.setFont(Jstructure.FONT);
		labelCreator.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCreator.setBounds(169, 243, 175, 13);
		add(labelCreator);

		JLabel labelData = new JLabel("Expected date:");
		labelData.setFont(Jstructure.FONT);
		labelData.setHorizontalAlignment(SwingConstants.RIGHT);
		labelData.setBounds(158, 297, 186, 13);
		add(labelData);

		JLabel labelMotivation = new JLabel("Motivation:");
		labelMotivation.setFont(Jstructure.FONT);
		labelMotivation.setHorizontalAlignment(SwingConstants.RIGHT);
		labelMotivation.setBounds(82, 343, 262, 13);
		add(labelMotivation);

		fieldName = new JTextField();
		fieldName.setLayout(null);
		labelNome.setLabelFor(fieldName);
		fieldName.setBounds(405, 192, 147, 19);
		add(fieldName);
		fieldName.setColumns(10);

		fieldCreator = new JTextField();
		fieldCreator.setLayout(null);
		labelCreator.setLabelFor(fieldCreator);
		fieldCreator.setBounds(405, 240, 147, 19);
		add(fieldCreator);
		fieldCreator.setColumns(10);

		MaskFormatter mascaraData = null;
		try {
			mascaraData = new MaskFormatter("##/##/####");
		} catch (ParseException ignore) {
			//
		}
		if (mascaraData != null) {
			mascaraData.setPlaceholderCharacter('_');
		}
		ftfieldData = new JFormattedTextField(mascaraData);
		labelData.setLabelFor(ftfieldData);
		ftfieldData.setBounds(405, 294, 147, 19);
		add(ftfieldData);

		fieldMotivation = new JTextField();
		labelMotivation.setLabelFor(fieldMotivation);
		fieldMotivation.setBounds(405, 340, 147, 19);
		add(fieldMotivation);
		fieldMotivation.setColumns(10);
	}

	public JTextField getFieldName() {
		return fieldName;
	}

	public JTextField getFieldCreator() {
		return fieldCreator;
	}

	public JTextField getFieldMotivation() {
		return fieldMotivation;
	}

	public JFormattedTextField getFieldData() {
		return ftfieldData;

	}

	public RegisterGroupController getController() {
		return controller;
	}

	/**
	 * Executa o comando para o bot�o selecionado.
	 * 
	 * implementacao da interface ActionListener, porem ainda nao implementado
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// controller.executarBotao(e.getSource());
	}
}
