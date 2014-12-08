import java.util.*; //Imports all of java.util including Scanner and Random
/*
  Iris Buschelman
  CS111B: Programming Fundamentals -- Java
  CRN: 52499 - 001
  Assignment 2 -- Blackjack
  DUE: 6/20/2014
 */
public class Assignment2 {
    
    public static void main(String[] args) {
	//Needed for Scanner Class
	Scanner keyboard = new Scanner(System.in);
	//Needed for Random Class
	Random pickRand = new Random();
	    //card1 & card2 are values of first cards dealt at start of game 
	int card1, card2,
	    //total keeps running total of cards
	    total, 
	    //newCard is value for new card when player asks for new card
	    newCard;
	     //repeat is user input for when play again at end of game
	char repeat,
	     //hit is user input to request new card
	     hit;
	//Use do-while to ensure program runs at least once
	do{
	    //Due to nature of nextInt, + 1 is required for 
	    //range to be 1-10 instead of 0-9
	    card1 = 1 + pickRand.nextInt(10);
	    card2 = 1 + pickRand.nextInt(10);
	    total = card1 + card2;
	    
	    //Show user cards, total and prompt for new card
	    System.out.printf("First cards: %d, %d\n", card1, card2);
	    System.out.printf("Total: %d\n", total);
	    
	    System.out.print("Do you want another card? (y/n): ");
	    hit = keyboard.next().toLowerCase().charAt(0);

	    //Use while for repeated new cards
	    while(hit == 'y') {
		newCard = 1 + pickRand.nextInt(10);
		total += newCard;

		System.out.printf("Card: %d\nTotal: %d\n", newCard, total);
		
		//Check to make sure bust does not occur
		if( total <= 21) {
		    System.out.print("Do you want another card? (y/n): ");
		    hit = keyboard.next().toLowerCase().charAt(0);
		} else {
		    System.out.println("Bust");
		    //if bust occurs, change conditional var to escape loop
		    hit = 'n';
		}
		
	    }
	    
	    //Prompt for play again
	    System.out.print("\nDo you want to play again? (y/n): ");
	    repeat = keyboard.next().toLowerCase().charAt(0);
	} while( repeat == 'y');
    }
}