//Evan White
import javax.swing.*; 
import java.util.Calendar;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class LoginScreen {
	static private ArrayList <BankerClass> customers;
    private String name;
    private JPanel mainPanel;
    private JLabel passLabel, userLabel;
    private JTextField userTxt, passTxt;
    private JPasswordField passwordField, userField;
    private JButton login, exit;

  
	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(new File("login.txt"));
		customers = new ArrayList <BankerClass> ();
		JFrame frame = new CheckBoxComboShellEW();

		frame.pack();
		frame.setVisible(true);

		WindowListener w = new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		};

		frame.addWindowListener(w);
		
	}
	
	 public void actionPerformed(ActionEvent w) {
	
	  if(w.getSource() == exit) {
          System.exit(0);
       }
	  
	  if(w.getSource() == login) { 
		  for(int i = 0; i < customers.size(); i++) {
			  if(userField.getText().equals(customers.get(i).getName()) &&
					  passwordField.getText().equals(customers.get(i).getPassword()));
					  
		  }
	
	  }
	  
	  
	  
   }
 
}


