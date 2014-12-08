import java.util.*;
public class fixThis
{
    public static void main(String[] args) 
    {
	//do 
	{
	    playOneGame();
	} //while (shouldPlayAgain());	
    }
    public static void playOneGame() //main game method
    {
	int guess=50;
	int l = guess+1;
	int h = guess-1;
	//int guess2;  
	char response;
	boolean lowflag = false;
	boolean highflag=false;
	
	System.out.println("Please choose a number between 1 and 100.");
	guess=getMidpoint(1, 100);  //initial condition
	int guess1=guess; 
	
	response=getUserResponseToGuess(guess);
	
	while (response != 'c')
	    {	
		if (response == 'h'){
		    if (lowflag){
			l=guess+1;
			guess = getMidpoint(guess1, 100);  //fix is here!!!!!
			guess1=guess;
		    }
		    else{
			l=guess+1;
			guess=getMidpoint(l, 100); 
			guess1=guess;
		    }
		    highflag=true;
		}else if (response == 'l')		    
		    {   
			if (highflag)
			    {
				guess = getMidpoint (l, guess1);
				guess1=guess;
			    }
			else
			    {
				h=guess-1;
				guess = getMidpoint(0, h);
				guess1=guess;
			    }
			lowflag = true;
		    }		
		response=getUserResponseToGuess(guess);
	    }
	if (response == 'c')
	    {
		System.out.println("Great! Play again?");
	    }
    }
    public static int getMidpoint(int low, int high) //header for midpoint fxn
    {
	int guess;

	guess = (high+(low-1))/2; //midpoint calculation
	
	return guess;
    }
    public static char getUserResponseToGuess(int guess) //header for user input
    {
	char response;
	Scanner input = new Scanner(System.in);
	System.out.println("Is your number "+guess+ "?");
	response = input.next().charAt(0);
	return response;
    }
}