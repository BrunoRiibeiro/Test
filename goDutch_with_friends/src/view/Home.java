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
	private JButton buttonCreateUser, buttonFriends, buttonProfile;
	private JPanel panel;
	
	public Home() {
		frame = new JFrame();
		
		buttonCreateUser = new JButton("Cadastrar Usuário");
		buttonCreateUser.setEnabled(false);
		buttonCreateUser.setBackground(Color.PINK);
		buttonCreateUser.setForeground(Color.BLACK);
		buttonCreateUser.setBounds(280, 213, 267, 31);
		buttonCreateUser.addActionListener(this);
		
		buttonFriends = new JButton("Friends");
		buttonFriends.setEnabled(false);
		buttonFriends.setBackground(Color.PINK);
		buttonFriends.setForeground(Color.BLACK);
		buttonFriends.setBounds(280, 254, 267, 31);
		buttonFriends.addActionListener(this);
		
		buttonProfile = new JButton("Profile");
		buttonProfile.setEnabled(false);
		buttonProfile.setBackground(Color.PINK);
		buttonProfile.setForeground(Color.BLACK);
		buttonProfile.setBounds(280, 295, 267, 31);
		buttonProfile.addActionListener(this);
		
		
	
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 20, 31));
		panel.setLayout(null);
		panel.add(buttonCreateUser);
		panel.add(buttonFriends);
		panel.add(buttonProfile);
		
		
		frame.setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 830, 522);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("goDu");
		frame.setVisible(true);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
