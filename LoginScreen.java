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
    //private String name;
    private JPanel mainPanel;
    private JLabel passLabel, userLabel;
    private JTextField userTxt;
    private JPasswordField passwordField;
    private JButton login, exit;
    
  
	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(new File("login.txt"));
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
		
		
	
	input.nextLine();
	input.nextLine();
	
	 while(input.hasNext())
	 {
	 	String name = input.nextLine();
	 	String pass = input.nextLine();
	 	double amount = Double.parseDouble(input.nextLine());
	 }
    }



	LoginScreen(){
		
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,2));
        mainPanel.setPreferredSize(new Dimension(700,400));
		mainPanel.setBorder(BorderFactory.createMatteBorder(20,20,20,20, Color.gray));
		
        setContentPane(mainPanel);
        
        
		
		
		mainPanel.add(userLabel = new JLabel("Username"));
		
		mainPanel.add(userTxt = new JTextField());
		
		mainPanel.add(passLabel = new JLabel("Password"));
		

		
		

		mainPanel.add(passwordField = new JPasswordField());
		

		mainPanel.add(login = new JButton("Login"));
		
		
        mainPanel.add(exit = new JButton("Exit"));
		exit.addActionListener(this);

		
    }

	 public void actionPerformed(ActionEvent w) {
		 int counter = 0;
	  if(w.getSource() == exit) {
          System.exit(0);
       }
	  
	  if(w.getSource() == login) { 
		  
		  boolean found = false;
		  
		  for(int i = 0; i < customers.size(); i++) {
			  if(userTxt.getText().equals(customers.get(i).getName()) &&
					  passwordField.getText().equals(customers.get(i).getPassword()));
			  
			  userTxt.setText(String.format("s%.2f", customers.get(i).getBalance()));
					  found = true;
					  
			if(found == false) {
						  counter++;
						  userTxt.setText("");
						  passwordField.setText("");
					  }
		  }
	
	  }
	  
	  
	  
   }
 
}
