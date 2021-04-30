//Evan White
import javax.swing.*; 
import java.util.Calendar;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class BankerClass extends JFrame{
	private String name;
    private String password;
    private double balance;
    
      BankerClass()			            
			{
				name = "";
				password = "";
				balance = 0.0;
			}
	
      BankerClass(String Name, String Pass, double Bal)
		{
			name = Name;
			password = Pass;
			balance = Bal;
		}
		
      public String getUsername()   
		{
			return name;
		}

		public String getPassword()
		{
			return password;
		}

		public double getBalance()
		{
			return balance;
		}
		
      }

