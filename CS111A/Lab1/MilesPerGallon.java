import java.util.Scanner; // Needed for keyboard input

/**
   This program calculates miles per gallon for the inputs of
   miles driven and gallons used.

   Iris Buschelman
   CS111A, Section 5
   Lab 1
   February 25, 2014
*/
public class MilesPerGallon
{
	public static void main(String[] args) 
	{
		float milesDriven;	  // Holds Miles Driven by user
		float gallonsUsed;	  // Holds Gallons Used by user
		float milesPerGallon;	  // Holds final Miles Per Gallon 
		
		// Define new Scanner object for user input
		Scanner keyboard = new Scanner(System.in); 

		// Get the number of Miles user has Driven since last fill up
		System.out.println("How many miles have you driven" +
				   " since your last fill-up?");
		milesDriven = keyboard.nextFloat();

		// Get the number of Gallons used since last fill up
		System.out.println("How many gallons have you used up?");
		gallonsUsed = keyboard.nextFloat();

		// Calculate Miles Per Gallon
		milesPerGallon = milesDriven / gallonsUsed; 

		// Display the information back to user
		System.out.println("The car gets " + milesPerGallon +
				   " miles per gallon.");
	}
}
