
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SideBar extends JPanel{

   SideBar(){
	   setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel myName = new JLabel(Settings.name);
		myName.setForeground(Settings.text); 
		myName.setFont(new Font("Calibri", Font.BOLD,15));
         
    	JButton difficultyButton = new JButton("Difficulty");
    	JButton playerButton = new JButton("Player");
    	JButton backgroundButton = new JButton("Background");
    	JButton nameButton = new JButton("Name");
    	JButton textColorButton = new JButton("TextColor");
    	
    	
    	
    	
        difficultyButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 String[] options = {"Easy", "Medium", "Hard"};
		         int choice = JOptionPane.showOptionDialog(null, "Choose Difficulty", "Set Difficulty",
		        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		         if (choice == JOptionPane.YES_OPTION) {
		                Settings.difficulty = 1;       
		                Settings.numToKill = 24;
		            	closeFrame();
		                new Game();
		            } else if (choice == JOptionPane.NO_OPTION) {
		                Settings.difficulty = 2;
		                Settings.numToKill = 30;
		                closeFrame();
		                new Game();
		            } else if (choice == JOptionPane.CANCEL_OPTION) {
		            	Settings.difficulty = 3;
		            	  Settings.numToKill = 40;
		            	closeFrame();
		                new Game();
		            } else {
		            	closeFrame();
			            new Game();
		            }		         
			}
        	
        });
        
        playerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String[] options = {"Yellow", "Pink", "Green", "brown"};
		         int choice = JOptionPane.showOptionDialog(null, "Choose Player", "Set Player",
		        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		         if (choice == JOptionPane.YES_OPTION) {
		                Settings.player = "src/images/yellowPlayer.png";
		                closeFrame();
		                new Game();
		            } else if (choice == JOptionPane.NO_OPTION) {
		            	Settings.player = "src/images/pinkPlayer.png";
		            	closeFrame();
		                new Game();
		            } else if (choice == JOptionPane.CANCEL_OPTION) {
		            	Settings.player = "src/images/greenPlayer.png";
		            	closeFrame();
		                new Game();
		            } else if (choice == 3) {
		            	 Settings.player = "src/images/brownPlayer.png";
		            	closeFrame();
			            new Game();
		            }
		            else {
		            	closeFrame();
			            new Game();
		            }
			}
        	
        });
        

        
        backgroundButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String[] options = {"Black", "Red", "Gray", "Blue"};
				 int choice = JOptionPane.showOptionDialog(null, "Choose Difficulty", "Set Difficulty",
					        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
					         if (choice == JOptionPane.YES_OPTION) {
					                Settings.bg = Color.black;
					                closeFrame();
					                new Game();
					            } else if (choice == JOptionPane.NO_OPTION) {
					            	Settings.bg = Color.red;
					            	closeFrame();
					                new Game();
					            } else if (choice == JOptionPane.CANCEL_OPTION) {
					            	Settings.bg = Color.gray;
					            	closeFrame();
					                new Game();
					            } else if (choice == 3) {
					            	 Settings.bg = Color.blue;
					            	closeFrame();
						            new Game();
					            }
					            else {
					            	closeFrame();
						            new Game();
					            }
			}
			
        	
        });
        
        nameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			 promptName(0);
			}
        	
        });
        
        textColorButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String[] options = {"White", "Pink", "Green", "Yellow"};
		         int choice = JOptionPane.showOptionDialog(null, "Choose Player", "Set Player",
		        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		         if (choice == JOptionPane.YES_OPTION) {
		                Settings.text = Color.white;
		                closeFrame();
		                new Game();
		            } else if (choice == JOptionPane.NO_OPTION) {
		            	Settings.text = Color.pink;
		            	closeFrame();
		                new Game();
		            } else if (choice == JOptionPane.CANCEL_OPTION) {
		            	Settings.text = Color.green;
		            	closeFrame();
		                new Game();
		            } else if (choice == 3) {
		            	 Settings.text = Color.yellow;
		            	closeFrame();
			            new Game();
		            }
		            else {
		            	closeFrame();
			            new Game();
		            }
				
			}
        	
        });
    
    	add(myName);
    	add(difficultyButton);
    	add(playerButton);
    	add(backgroundButton);
    	add(nameButton);
    	add(textColorButton);
    	setBorder(BorderFactory.createLineBorder(Color.green, 4));
    	setBackground(Color.black);
    	setSize(300,350);
    
   }
   
   void closeFrame() {
	   JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
	   frame.dispose();
   }
   
   @SuppressWarnings("unused")
void promptName(int tries) {
	if(tries == 0) {
	   String input = JOptionPane.showInputDialog(null, "enter your name");
	   if(input == null) {
		   closeFrame();
		   new Game();
	   }
	   else if(input.length() < 8) {
		   Settings.name = input;
		   closeFrame();
		   new Game();
	   }
	   else {
		   promptName(1);
	   }
	   }
	else {
		  String input = JOptionPane.showInputDialog(null, "name must not be greater than 8 characthers");
		   if(input == null) {
			   closeFrame();
			   new Game();
		   }
		   else if(input.length() < 8) {
			   Settings.name = input;
			   closeFrame();
			   new Game();
		   }
		   else {
			   promptName(1);
		   }
	}
	   
	   
	  
	  
	  
   }

}
