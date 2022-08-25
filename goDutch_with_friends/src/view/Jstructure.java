package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Classe molde para as telas de cadastro comuns, possui uma constante para
 * definir a fonte do texto no aplicativo.
 * 
 */
public abstract class Jstructure extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	protected static final Font FONT = new Font("Algerian", Font.PLAIN, 14);
	
	private final JButton buttonConfirm;
	private final JButton buttonCancel;

	/**
	 * Gera um panel com um fundo branco, um titulo e dois botoes, confirma e
	 * cancela.
	 * 
	 * O titulo da tela para ser mostrado no topo
	 */

	public Jstructure(String title) {

		this.setBackground(new Color(255, 255, 255));
		this.setLayout(null);
		this.setBounds(100, 100, 830, 522);

		JLabel labelTitulo = new JLabel(title);
		labelTitulo.setFont(FONT);
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(299, 102, 233, 13);
		add(labelTitulo);

		buttonConfirm = new JButton("Confirmar");
		buttonConfirm.addActionListener(this);
		buttonConfirm.setForeground(new Color(0, 128, 0));
		buttonConfirm.setBackground(Color.LIGHT_GRAY);
		buttonConfirm.setFont(FONT);
		buttonConfirm.setBounds(492, 457, 119, 21);
		this.add(buttonConfirm);

		buttonCancel = new JButton("Cancelar");
		buttonCancel.addActionListener(this);
		buttonCancel.setForeground(new Color(128, 0, 0));
		buttonCancel.setBackground(Color.LIGHT_GRAY);
		buttonCancel.setFont(FONT);
		buttonCancel.setBounds(621, 457, 113, 21);
		this.add(buttonCancel);

	}

	public JButton getButtonConfirmar() {
		return buttonConfirm;
	}

	public JButton getButtonCancelar() {
		return buttonCancel;
	}
}
