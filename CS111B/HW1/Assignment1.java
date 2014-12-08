/*

 * Iris Buschelman

 * CS111B : Programming Fundamentals -- Java

 * CRN 52499- 001

 * Assignment 1

 * 6/19/2014

 */

import java.util.Scanner;

public class Assignment1 {
    
    public static void main(String[] args) {
	
	// Required for keyboard input
        Scanner keyboard = new Scanner(System.in);
	
        int stars;          // Number of asterisks the user wants

        String input;       // Initial String input from the user
	
        char repeat;        // Required char pulled from input
	
	// Used do-while loop to ensure that program runs at least once
        do{

	    // Prompt user for input
	    System.out.print("How many asterisks should I print? ");

	    stars = keyboard.nextInt();

	    System.out.print("\n");

	    for( int i = 0; i < stars; i++) {

		System.out.print("* ");

	    }
	    
	    System.out.println();

	    // Prompt user for input
	    System.out.print("Do you want to go again? (y or n) ");

	    input = keyboard.next().toLowerCase();

	    repeat = input.charAt(0);

	    System.out.println();

	}while(repeat == 'y');

    }    

}
