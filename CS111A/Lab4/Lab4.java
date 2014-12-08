/*
   This program calculates and displays distance based on time spent
   falling.

   Iris Buchelman
   CS111A, Section 5
   Lab 4
   May 5, 2014
*/
import java.util.Scanner;      // Needed for Scanner Class

public class Lab4
{
    public static void main(String[] args)
    {
	// Create a Scanner type object for input
	Scanner keyboard = new Scanner(System.in);
	
	// User Instructions
	System.out.print("How long has object been falling? ");
	int fallingTime = keyboard.nextInt();    // Holds User Input time

        while( fallingTime < 0)
	    {
		System.out.println("Time cannot be negative.");
		System.out.print("How long has object been falling? ");
		fallingTime = keyboard.nextInt();
	    }
	
	System.out.println("Falling Distance");
	System.out.println("\nTime      Distance");
	System.out.println("(seconds) (meters)\n");

	// Cycle through values to get values of distance at specific times
	for(int i = 1; i <= fallingTime; i++)
	    {
		double distance = fallingDistance(i);
		System.out.printf("%2d %16.2f\n",i,distance);
	    }
    }
    /*
      The method fallingDistance() uses time to calculate distance.
      
      @param time Time spent faling
      @return Distance calculated from the formula .5Gt^2
    */
    public static double fallingDistance(int time)
    {
	final double G = 9.80665;
	return 0.5 * G * time * time;
    }
}