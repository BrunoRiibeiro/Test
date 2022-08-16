package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home implements ActionListener {
	
	private JFrame frame;
	private JButton buttonGroups;
	private JPanel panel;
	
	public Home() {
		frame = new JFrame();
		
		buttonGroups = new JButton("Groups");
		buttonGroups.setEnabled(false);
		buttonGroups.setBackground(Color.PINK);
		buttonGroups.setForeground(Color.BLACK);
		buttonGroups.setBounds(100, 200, 200, 50);
		buttonGroups.addActionListener(this);
		
		
	
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(500, 500, 20, 31));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(buttonGroups);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("goDu");
		frame.setSize(500, 500);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
