//Evan White
import javax.swing.*; 
import java.util.Calendar;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class LoginScreen extends JFrame implements ActionListener{
	static private ArrayList <BankerClass> customers;
    private String name;
    private JPanel mainPanel;
    private JLabel passLabel, userLabel;
    private JTextField userTxt;
    private JPasswordField passwordField;
    private JButton login, exit;

  
	public static void main(String[] args) throws IOException{
		
		//Scanner input = new Scanner(new File("login.txt"));
		customers = new ArrayList <BankerClass> ();
		JFrame frame = new LoginScreen();

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
		
	/*input.nextLine();
	input.nextLine();

	while(input.hasNext())
	{
		name = input.nextLine();
	}*/
    }
	


	LoginScreen(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2,3));
        mainPanel.setPreferredSize(new Dimension(500,600));
		mainPanel.setBorder(BorderFactory.createMatteBorder(25,25,25,25, Color.gray));
		
        passLabel = new JLabel();
		passLabel.setBorder(BorderFactory.createMatteBorder(25,25,25,25, Color.gray));
		
		userLabel = new JLabel();
		userlabel.setBorder(BorderFactory.createMatteBorder(25,25,25,25, Color.gray));

		userTxt = new JTextField();
		userTxt.setBorder(BorderFactory.createMatteBorder(25,25,25,25, Color.gray));

		passwordField = new JPasswordField();
		passwordField.setBorder(BorderFactory.createMatteBorder(25,25,25,25, Color.gray));

		login = new JButton();
		login.setBorder(BorderFactory.createMatteBorder(25,25,25,25, Color.gray));
		
        exit = new JButton();
		exit.setBorder(BorderFactory.createMatteBorder(25,25,25,25, Color.gray));






    }

	 public void actionPerformed(ActionEvent w) {
	
	  if(w.getSource() == exit) {
          System.exit(0);
       }
	  
	  /*if(w.getSource() == login) { 
		  for(int i = 0; i < customers.size(); i++) {
			  if(userField.getText().equals(customers.get(i).getName()) &&
					  passwordField.getText().equals(customers.get(i).getPassword()));
					  
		  }
	
	  }*/
	  
	  
	  
   }
 
}
