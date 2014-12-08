/**

 * Name: Andrew Ma

 * Course: CS111B 

 * CRN: 52499 - 001

 * Assignment: NumberGuesser.java

 * Due Date: 7/3/14

 */

import java.util.*;

public class NumberGuesser

{

    // Private Instance Variables :variables that cannot be changed by public methods

    private int high;

    private int low;

     
    //change parameters. those are for input. assign parameter variables to the private instance vars --I
    NumberGuesser(int low, int high)

    {

	high=100;

	low=1;
    }

    //main method to test operation

    public static void main(String args[]) 	

    {

	Scanner Input = new Scanner(System.in); //instance of Scanner

	// low and high do not exist within main
	//change them to numbers like 1 and 100
	NumberGuesser gameOne = new NumberGuesser (low, high);

	while (check!='c')

	    {   

		System.out.println("is your number "+getCurrentGuess() + "?");
		//should add toUpperCase or toLowerCase to this statement to check for caps or lower case (cuz theyre different)
		char check=Input.next().charAt(0);
		//no... just no
		NumberGuesser (low, high);

	    }

	

	System.out.println ("your number was "+ getCurrentGuess()+ "? Good pick. Play again?");

	char replay=Input.next().charAt(0);

	if (replay == 'y')

	    reset();

    }

    

    //Public Methods and Constructors

    

    public int NumberGuesser(int lowerBound, int upperBound)

    {

	high=upperBound;

	low=lowerBound;

	guess=getCurrentGuess();

	//need double equal sign for comparison
	if (check='h')

	    higher();

	else if (check='l')

	    lower();

	else if (check='c')

	    reset();

    }

    

    public void higher()

    {

	low = low+guess;

    }

    

    public void lower()

    {

	high = high-guess;

    }

    

    public int getCurrentGuess()

    {

	return (high-low)/2;

    }

    public void reset()

    {
	//set to initial high in case want to change guessing range
	high=100;
	// same with this one, set to inital low instead of 1
	low=1;

    }

} 



