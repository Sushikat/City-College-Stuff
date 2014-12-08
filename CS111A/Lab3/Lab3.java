/* 
   This program calculates distance based on rate of travel and hours 
   spent traveling.
   
   Iris Buschelman
   CS111A, Section 5
   Lab 3
   April 21, 2014
*/

import java.util.Scanner;      //Needed for Scanner Class

public class Lab3
{
    public static void main(String[] args)
    {
	int speed;             //Holds the user input of Speed
	int hours;             //Holds the user input of Distance
	int distance;          //Holds the value of Speed * Hours
	
	// Create a Scanner type object for input
	Scanner keyboard = new Scanner(System.in);
	
	//Prompt the user for vehicle Speed
	System.out.print("What is the speed of the vehicle in MPH? ");
	
	speed = keyboard.nextInt();
	
	//Use While loop to check for non-negative Speed
        while(speed < 0)
	    {
		System.out.println("Error: Speed cannot be negative.");
		System.out.print("What is the speed of the "
				 +"vehicle in MPH? ");
		speed = keyboard.nextInt();
	    }

	//Prompt user for Hours driven
	System.out.print("How many hours has it traveled? ");

	hours = keyboard.nextInt();

	//Use While loop to check for positive Hours
	while(hours < 1)
	    {
		System.out.println("Error: Time must be positive.");
		System.out.print("How many hours has it traveled? ");
		hours = keyboard.nextInt();
	    }
	
	//Display results to user
	System.out.println("Hours     Distance Traveled");
	//Use for loop to cycle through hours
	for(int i = 1; i <= hours; i++)
	    {
		//Calculate distance based on speed at given time interval
		distance = speed * i;
		//Use printf to format and allign output
		System.out.printf("%2d %16d\n",i,distance);
	    }
    }
}