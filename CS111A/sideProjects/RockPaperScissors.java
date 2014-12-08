import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
	Random pickRand = new Random();
	Scanner keyboard = new Scanner(System.in);
	String[] choices = {"ROCK", "PAPER", "SCISSORS"};
	int compChoice = pickRand.nextInt(2);
	String userChoice;
	char winner;
	int userIndex;

	System.out.println("Pick: Rock, Paper or Scissors.");
	userChoice = keyboard.nextLine();
	
        userIndex = searchList(choices, userChoice);
	
	winner = decideWinner(userIndex, compChoice);
	
	System.out.println("Computer chose " + choices[compChoice] + ".");
	if( winner == 'H')
	    {
		System.out.println(choices[userIndex] + " beats "
			           + choices[compChoice] + ". You Win!");
	    } else if( winner == 'T')
	    {
		System.out.println("You tied! Run me again to try again!");
	    } else 
	    {
		System.out.println(choices[compChoice] + " beats "
				   + choices[userIndex] + ". Better Luck "
				   + "Next Time!");
	    }
    }
    
    public static int searchList(String[] a, String b)
    {
	int ans = 0;
	b = b.toUpperCase();
	for( int i = 0; i < a.length; i++)
	    {
		if ( b.equals(a[i]))
		    {
		        ans = i;
		    }
	    }
	return ans;
    }
    
    public static char decideWinner(int h, int c)
    {
	char win = 'Q';
	
	if(h == 0 && c == 1)
	    win = 'C';
	else if(h == 1 && c == 0)
	    win = 'H';
	else if(h == 1 && c == 2)
	    win = 'C';
	else if(h == 2 && c == 1)
	    win = 'H';
	else if(h == 0 && c == 2)
	    win = 'C';
	else if(h == c)
	    win = 'T';
	
	return win;
    }
}