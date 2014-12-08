import java.util.*;

/**
   @author Iris Buschelman
   CS111B: Programming Fundamentals - Java
   CRN: 52499 -- 001
   Assignment 3 -- Number Guesser
   DUE: 6/22/2014
*/

public class Assignment3 {
    public static void main(String[] args) {
	do {
	    playOneGame();
	} while(shouldPlayAgain());
    }
    /**
       Controls Gameplay, has no parameters or returns
     */
    public static void playOneGame() {
	int guess;        //Holds Computer Guess
	char input;       //Holds User Input
	int top = 100;    //Holds Top of Guessing Range
	int bottom = 0;   //Holds Bottom of Guessing Range
	System.out.println("Guess a number between 1 and 100");
	System.out.println("Type h if higher, l if lower, or c if correct");
	//use do-while to ensure loop runs at least once
	do {
	    guess = getMidpoint(top,bottom);
	    input = getUserResponseToGuess(guess);
	    top = getTop(input,top,bottom);
	    bottom = getBottom(input,top,bottom);
	} while(input != 'c');
    }
    /** 
	Tells user the computer's guess and retrieves user input
	@param guess recieves the computer's guess
	@return user input about whether guess is higher, lower, or correct
    */
    public static char getUserResponseToGuess(int guess) {
	//Required for Scanner to get keyboard input
	Scanner keyboard = new Scanner(System.in);
	System.out.printf("Is it %d? (h/l/c): ",guess);  
        char input = keyboard.next().toLowerCase().charAt(0);
	System.out.println();
	return input;
    }
    /**
    Decides top of guessing range based on user input
    @param input gets user input
    @param oldTop gets the top of previous guessing range
    @param oldBottom get the bottom of previous guessing range
    @return new top of range
    */
    public static int getTop(char input, int oldTop, int oldBottom) {
	int top = 100;  //holds new top of range, initialize to 100 for new game
	switch (input) {
	    //If user says higher, top remains the same
	    case 'h': top = oldTop;
	              break;
	    //If user says lower, top becomes midpoint of previous range
	    case 'l': top = getMidpoint(oldTop,oldBottom);
	              break;
	}
	return top;
    }
    /**
       Decides bottom of guessing range based on user input
       @param input gets user input
       @param oldTop gets top of previous range
       @param oldBottom gets bottom of previous range
       @return new bottom of range
    */
    public static int getBottom(char input, int oldTop, int oldBottom) {
	int bottom = 0;  //holds new bottom of range, initialize to 0 for new game
	switch (input) {
	    //If user says higher, bottom becomes midpoint of previous range
	    case 'h': bottom = getMidpoint(oldTop,oldBottom);
	              break;
	    //If user says lower, bottom remains the same
	    case 'l': bottom = oldBottom;
	              break;
	}
	return bottom;
    }
    /**
       Solves for midpoint of old guessing range
       @param top gets top of guessing range
       @param bottom gets bottom of guessing range
       @return midpoint of guessing range
    */
    public static int getMidpoint(int top, int bottom) {
	return (bottom + top) / 2;  //equation for midpoint
    }
    /**
       Asks user if they want to play again
       @return user response
     */
    public static boolean shouldPlayAgain() {
	//Required for Scanner to get keyboard input
	Scanner keyboard = new Scanner(System.in);
	char repeat;  //holds user response to play again prompt
	System.out.print("Do you want to play again? (y/n): ");
	repeat = keyboard.next().toLowerCase().charAt(0);
	System.out.println();
	if ( repeat == 'y' )
	    return true;   //true triggers play again
	else
	    return false;  //false triggers end game
    }
}
  