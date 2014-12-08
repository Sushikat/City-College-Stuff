/*
  This program calculates and displays several employees' hourly wages

  Iris Buschelman
  CS111A, Section 5
  Lab 5
  May 20, 2014
*/

import java.util.Scanner;      // Needed for Scanner Class

public class Lab5
{
    public static void main(String[] args)
    {
	// Create a Scanner type object for input
	Scanner keyboard = new Scanner(System.in);

	int[] employeeID = {5658843,4520125,7895122,8777541,
			    8451277,1302850,7580489};

	System.out.println("Employee ID: "employeeID[0]);
	System.out.print("Enter the number of hours worked: ");
	double hours = keyboard.nextDouble();
	while(hours < 0)
	    {
		System.out.println("Hours cannot be negative.");
		System.out.print("Please reenter hours.");
	    }
	
    }
}