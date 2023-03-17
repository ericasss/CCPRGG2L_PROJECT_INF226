
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends JFrame {

    public Game() {

        initUI();
    }

    private void initUI() {
    	Board board = new Board();
    	board.setSize(100,100);
    	JPanel panel = new SideBar();
    	add(panel,BorderLayout.EAST);
        add(board,BorderLayout.CENTER);
        
        setTitle("Space Invaders");
        setSize(470, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
     
    }

 
}
