import java.io.*;
import java.util.Scanner;
import java.util.Random;
class Numbergame
{
  public static void main (String[]args)
  {
    //instance for the class
    Numbergame ng = new Numbergame ();

    //function call
    ng.randomcompare ();
  }
  void randomcompare ()
  {
    //random number generation
    Random r = new Random ();
    int rand = r.nextInt (100);

    //start of game
    System.out.println ("\n\t\tNUMBER GAME\n\n YOU HAVE 5 ATTEMPTS TO TRY..BEST OF LUCK!!");
    int i = 1;

    //loop start
    while (i <= 5)
      {
	//print the number of attempts
	System.out.println ("\n  ATTEMPT : " + (i));
	Scanner sc = new Scanner (System.in);

	//getting user input
	System.out.print ("\tGuess the generated number:");
	int uinp = sc.nextInt ();

	//comparison of generated and user values
	if (uinp == rand)
	{
	    System.out.println ("\n\t<--GREAT JOB! YOU WON!!-->");
	    break;
	}
	else if (uinp < rand)
	{
	    System.out.println ("\n\t<--YOUR GUESS IS SMALL-->");
	}
	else
	{
	    System.out.println ("\n\t<--YOUR GUESS IS LARGE-->");
	}
	i++;

	//attempts exceed
	if (i == 6)
	{
	    System.out.println ("\n\t\tOUT OF ATTEMPTS");
	}

    }				//loop end

    //print score board
    if (i == 1)
    {
	    System.out.println ("\n\tYOUR SCORE = 100");
    }
    else if (i == 2)
    {
	    System.out.println ("\n\tYOUR SCORE = 80");
    }
    else if (i == 3)
    {
	    System.out.println ("\n\tYOUR SCORE = 60");
    }
    else if (i == 4)
    {
	    System.out.println ("\n\tYOUR SCORE = 40");
    }
    else if (i == 5)
    {
	    System.out.println ("\n\tYOUR SCORE = 20");
    }
    else
    {
	    System.out.println ("\n\tYOUR SCORE = 0");
    }
        System.out.println ("\n\n\t\t***GOOD TRY***");
  }
}