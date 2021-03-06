/**
   @author Iris Buschelman
   Name: Iris Buschelman
   Course: CS111B Programming Fundamentals -- Java
   CRN: 52499-001
   Assignment: NumberGuesser.java
   Date: 7/3/2014
*/
import java.util.Scanner;

public class NumberGuesser {
    // Will hold tops and bottoms of the guessing range
    private int top, bottom;
    // Holds initial range to be used in the reset method
    private int initialTop, initialBottom;
    /**
       NumberGuesser() assigns values to be used in the program
       @param lowerBound the bottom of the initial guessing range
       @param upperBound the top of the initial guessing range
     */
    NumberGuesser(int lowerBound, int upperBound) {
	top = upperBound;
	bottom = lowerBound;
	initialTop = upperBound;
	initialBottom = lowerBound;
    }
    /**
       Re-assigns bottom of guessing range to current guess + 1
       Need +1 to exclude the current guess from the new guessing range
     */
    void higher() {
	bottom = getCurrentGuess() + 1;
    }
    /**
       Re-assigns top of guessing range to current guess -1
       Need -1 to exclude the current guess from the new guessing range
     */
    void lower() {
	top = getCurrentGuess() - 1;
    }
    /**
       Displays the midpoint of the guessing range
    */
    int getCurrentGuess() {
	return (top + bottom) / 2;
    }
    /** 
	Resets the game to its inital guessing range for a play again option
    */
    void reset() {
	top = initialTop;
	bottom = initialBottom;
    }
}