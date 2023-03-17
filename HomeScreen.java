
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeScreen extends JFrame {

	HomeScreen() {
		initUI();

	}

	private void initUI() {
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		JPanel panel1 = new JPanel();
		JLabel titleLabel = new JLabel("Space Invaders");
		titleLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		titleLabel.setForeground(Color.white);
		panel1.add(titleLabel);

		JPanel panel2 = new JPanel();
		JLabel memberLabel = new JLabel("By: Angelica Elamparo, Erica Sanchez, Mikaella Mendoza");
		memberLabel.setForeground(Color.white);
		panel2.add(memberLabel);

		JPanel panel3 = new JPanel();
		JButton button = new JButton("Start Game");
		button.setFocusPainted(false);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Game();
			}
		});
		panel3.add(button);

		panel1.setBackground(Color.black);
		panel2.setBackground(Color.black);
		panel3.setBackground(Color.black);
		add(panel1);
		add(panel2);
		add(panel3);

		setBackground(Color.black);
		setTitle("Space Invaders");
		setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new HomeScreen();
	}
}