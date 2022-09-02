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
 * Classe herda de JFrame e implementa ActionListner , por meio das bibliotecas Java AWT e Java Swing.
 * Lista as informações do gurpo escolido.
 * 
 * @see java.awt
 * @see java.swing
 * @see JFrame
 * @see ActionListener
 * 
 * @author Bruno Ribeiro
 * @author Igor Penha
 */
public class ShowInformationGroup extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JComboBox<Object> fieldGroup;
	private JTextArea fieldReport;
	private JButton buttonBack, buttonNewGroup;
	private JScrollPane scrollPane;
	private static final Font FONT = new Font("Algerian", Font.PLAIN, 12);
	private ShowInformationGroupController controller = new ShowInformationGroupController(this);

	/**
	 * A classe constroi um título da pagina em questão, um botão para voltar a página anterior.
	 * Com este construtor criamos um JFrame, setando background, um tamanho padrão, e um método de fechar a página.
	 * 
	 * @param buttonBack
	 * @param scrollPane
	 * @param fieldReport
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
		
		buttonNewGroup = new JButton("Novo grupo");
		buttonNewGroup.addActionListener(this);
		buttonNewGroup.setForeground(new Color(33, 113, 204));
		buttonNewGroup.setBackground(Color.LIGHT_GRAY);
		buttonNewGroup.setFont(FONT);
		buttonNewGroup.setBounds(254, 450, 117, 21);
		this.add(buttonNewGroup);

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
	
	public JButton getButtonNewGroup() {
		return buttonNewGroup;
	}

	public void setButtonNewGroup(JButton buttonNewGroup) {
		this.buttonNewGroup = buttonNewGroup;
	}

	public ShowInformationGroupController getController() {
		return controller;
	}

	/**
	 * Método herdado de ActionListner, o qual sinconiza a view com sua respectiva controller.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		controller.sendAction(e.getSource());
	}
}
