package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controller.ShowInformationGroupController;

/**
 * JPanel para mostrar um relatorio de filmes.
 * 
 * Herda a classe JRelatorios que cont�m um fundo, t�tulo e um bot�o.
 * 
 * @author Eduardo Rodrigues
 */
public class ShowInformationGroup extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JComboBox<Object> fieldGroup;
	private JTextArea fieldReport;
	private JButton buttonBack;
	private JScrollPane scrollPane;
	private static final Font FONT = new Font("Algerian", Font.PLAIN, 14);
	private ShowInformationGroupController controller = new ShowInformationGroupController(this);

	/**
	 * Cria o panel com os campos para o relatorio.
	 */
	public ShowInformationGroup() {
		this.setBackground(new Color(255, 255, 255));
		this.setLayout(null);
		this.setBounds(100, 100, 830, 522);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Relatorio do grupo");
		this.setVisible(true);

		JLabel labelTitle = new JLabel("Informações do grupo");
		labelTitle.setFont(FONT);
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(51, 59, 725, 13);
		this.add(labelTitle);

		JLabel labelChooseGroup = new JLabel("Escolha um grupo");
		labelChooseGroup.setHorizontalAlignment(SwingConstants.CENTER);
		labelChooseGroup.setFont(FONT);
		labelChooseGroup.setBounds(49, 135, 162, 21);
		this.add(labelChooseGroup);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(221, 109, 512, 295);
		this.add(scrollPane);

		fieldGroup = new JComboBox<>();
		fieldGroup.addActionListener(this);
		fieldGroup.setBounds(71, 168, 113, 21);
		fieldGroup.setModel(controller.updateModel());
		this.add(fieldGroup);

		fieldReport = new JTextArea();
		fieldReport.setFont(new Font("Algerian", Font.PLAIN, 12));
		scrollPane.setViewportView(fieldReport);
		fieldReport.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		fieldReport.setBackground(new Color(245, 245, 220));
		fieldReport.setEditable(false);

		buttonBack = new JButton("Voltar");
		buttonBack.setFont(JstructureShow.FONT);
		buttonBack.setForeground(new Color(110, 24, 196));
		buttonBack.setBackground(Color.LIGHT_GRAY);
		buttonBack.setBounds(122, 450, 117, 21);
		buttonBack.setEnabled(true);
		buttonBack.addActionListener(this);
		this.add(buttonBack);

		this.setVisible(true);
	}

	public JComboBox<Object> getFieldGroup() {
		return fieldGroup;
	}

	public JTextArea getFieldReport() {
		return fieldReport;
	}

	public JButton getButtonBack() {
		return buttonBack;
	}
	
	public ShowInformationGroupController getController() {
		return controller;
	}

	/**
	 * Executa o comando para o bot�o selecionado.
	 * 
	 * implementa��o da interface ActionListener
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}
}
