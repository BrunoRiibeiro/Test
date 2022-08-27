package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public abstract class JstructureShow extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	protected static final Font FONT = new Font("Algerian", Font.PLAIN, 14);
	private final JButton buttonBack, buttonEdit, buttonDelete;

	public JstructureShow(String title) {

		this.setBackground(new Color(245, 245, 220));
		this.setBounds(100, 100, 830, 522);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(title);
		this.setLayout(null);
		this.setVisible(true);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(122, 110, 588, 289);
		this.add(scrollPane);

		buttonBack = new JButton("Voltar");
		buttonBack.setFont(JstructureShow.FONT);
		buttonBack.setForeground(new Color(110, 24, 196));
		buttonBack.setBackground(Color.LIGHT_GRAY);
		buttonBack.setBounds(122, 450, 117, 21);
		buttonBack.setEnabled(true);
		buttonBack.addActionListener(this);
		this.add(buttonBack);

		buttonEdit = new JButton("Editar");
		buttonEdit.setFont(JstructureShow.FONT);
		buttonEdit.setForeground(new Color(173, 140, 42));
		buttonEdit.setBackground(Color.LIGHT_GRAY);
		buttonEdit.setBounds(601, 420, 109, 21);
		buttonEdit.setEnabled(true);
		buttonEdit.addActionListener(this);
		this.add(buttonEdit);

		buttonDelete = new JButton("Delete");
		buttonDelete.setFont(JstructureShow.FONT);
		buttonDelete.setForeground(new Color(128, 0, 0));
		buttonDelete.setBackground(Color.LIGHT_GRAY);
		buttonDelete.setBounds(601, 450, 109, 21);
		buttonDelete.setEnabled(true);
		buttonDelete.addActionListener(this);
		this.add(buttonDelete);
	}

	public JButton getButtonBack() {
		return buttonBack;
	}

	public JButton getButtonEdit() {
		return buttonEdit;
	}

	public JButton getButtonDelete() {
		return buttonDelete;
	}

}
