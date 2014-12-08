/**
   This program calculates the cost of internet service for 3 different
   service packages based on package used and hours used.

   Iris Buschelman
   CS11A, Section 5
   Lab 2
   March 25, 2014
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2
{
    public static void main(String[] args)
    {
	String input;   // Holds initial input for type
	char type;      // Holds char from input for Package Used
	int hours;      // Holds input for hours
	double charge;  // Holds price
	
	// Create a DecimalFormat object for proper output format
	DecimalFormat formatter = new DecimalFormat("$#,##0.00");

	// Create a Scanner object for keyboard input
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Internet Service Provider Monthly Bill\n");
        
	// Prompt user for package type
	System.out.print("Enter package type (A, B, or C): ");
	input = keyboard.nextLine();
	input = input.toUpperCase();
        type = input.charAt(0);

	// Check if package type is valid (A, B, or C)
	if( type != 'A' && type != 'B' && type != 'C')
	    System.out.println("Invalid Package Type.");
	else 
	{
	    // Prompt user for hours used
	    System.out.print("Enter number of hours: ");
	    hours = keyboard.nextInt();
	    // Check if input is valid (0 < input < 744)
	    if( hours < 0)
		System.out.println("Invalid Input. Hours cannot be negative.");
	    else if( hours > 744 )
		System.out.println("Invaild Input. Hours cannot exceed 744");
	    else
	    {
		// Execute code based on package type
		switch(type)
		    {
		    case 'A': 
			if( hours < 10) 
			    charge = 9.95;
			else
			    charge = 9.95 + (hours - 10) * 2.00;
			System.out.println("Total due: " + 
					   formatter.format(charge));
			break;
		    case 'B':
			if( hours < 20)
			    charge = 13.95;
			else
			    charge = 13.95 + (hours - 10);
			System.out.println("Total due: " +
					   formatter.format(charge));
			break;
		    case 'C':
		        System.out.println("Total due: $19.95");
			break;
		    default:
			System.out.println("Invalid Package Type");
		    }
	    }
	}
    }
}