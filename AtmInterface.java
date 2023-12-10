import java.io.*;
import java.util.Scanner;
public class AtmInterface
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int bal = 5000;
    System.out.println ("\n\tATM INTERFACE");
    System.out.println("\n CHOOSE ANY SERVICE");
    System.out.println ("\n 1.Withdraw\t\t2.Deposit\n 3.Check Balance\t4.Exit");
      
    while (true)
      {
	System.out.print ("\n Enter your choice : ");
	int choice = sc.nextInt ();
	
	switch (choice)
	  {
	      
	  //withdrawal of amount
	  case 1:
	    System.out.print ("\n Enter amount to withdraw : ");
	    int wd = sc.nextInt ();
	    if (bal > wd)
	      {
		    bal = bal - wd;
		    System.out.print ("\n\t** Balance : " + bal + " **\n");
	      }
	    else
	      {
		    System.out. println ("\n\t** You don't have sufficient balance **");
	      }
	    break;
	    
	  //deposit of amount  
	  case 2:
	    System.out.print ("\n Enter deposit amount : ");
	    int dep = sc.nextInt ();
	    bal = bal + dep;
	    System.out.print ("\n\t** Balance : " + bal + " **\n");
	    break;
	    
	  //checking account balance
	  case 3:
	    System.out.print ("\n\t** Balance : " + bal + " **\n");
	    break;
	    
	  //exiting transaction
	  case 4:
	    System.out.print ("\n\t** THANK YOU!! SEE YOU AGAIN **");
	    System.exit (0);
	  }
      }
  }
}
