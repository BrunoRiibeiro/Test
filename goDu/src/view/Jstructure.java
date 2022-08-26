package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;


/**
 * Classe molde para as telas de cadastro comuns, possui uma constante para
 * definir a fonte do texto no aplicativo.
 * 
 */
public abstract class Jstructure extends JFrame implements ActionListener {

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
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(title);
		this.setVisible(true);

		buttonConfirm = new JButton("Confirmar");
		buttonConfirm.addActionListener(this);
		buttonConfirm.setForeground(new Color(0, 128, 0));
		buttonConfirm.setBackground(Color.LIGHT_GRAY);
		buttonConfirm.setFont(FONT);
		buttonConfirm.setBounds(621, 457, 119, 21);
		this.add(buttonConfirm);

		buttonCancel = new JButton("Cancelar");
		buttonCancel.addActionListener(this);
		buttonCancel.setForeground(new Color(128, 0, 0));
		buttonCancel.setBackground(Color.LIGHT_GRAY);
		buttonCancel.setFont(FONT);
		buttonCancel.setBounds(492, 457, 119, 21);
		this.add(buttonCancel);

	}

	public JButton getButtonConfirm() {
		return buttonConfirm;
	}

	public JButton getButtonCancel() {
		return buttonCancel;
	}
	
	public MaskFormatter maskingDate() {
		MaskFormatter maskDate = null;
		try {
			maskDate = new MaskFormatter("##/##/####");
		} catch (ParseException ignore) {
			//
		}
		if (maskDate != null) {
			maskDate.setPlaceholderCharacter('_');
		}
		return maskDate;
		
	}
}
