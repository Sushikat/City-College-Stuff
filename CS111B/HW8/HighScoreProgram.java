/**
   Name: Iris Buschelman
   Course: CS111B -- Programming Fundamentals : Java
   CRN: 52499 - 001
   Assignment: HighScoreProgram.java
   Date: 07/06/2014
*/
import java.util.Scanner;
public class HighScoreProgram {
    public static HighScores one;
    public static HighScores two;
    public static HighScores three;
    public static HighScores four;
    public static HighScores five;
    
    public static void main(String[] args) {
	HighScores[] scores = {one,two,three,four,five};
	initialize(scores);
	sort(scores);
	display(scores);
    }
    
    public static void initialize(HighScores[] scores) {
	Scanner keyboard = new Scanner(System.in);
	String name;
	int score;
	for(int i = 0; i < scores.length; i++) {
	    System.out.print("Name " + (i+1) + ": ");
	    name = keyboard.next();
	    System.out.print("Score " + (i+1) + ": ");
	    score = keyboard.nextInt();
	    scores[i] = new HighScores(name, score);
	}
    }
    
    public static void sort(HighScores[] scores) {
	int maxVal;
	int maxIndex;
	HighScores temp;
	for(int j = 0; j < scores.length; j++) {
	    maxVal = scores[j].getScore();
	    maxIndex = j;
	    for(int i = j+1; i < scores.length; i++) {
		if(maxVal < scores[i].getScore()) {
		    maxVal = scores[i].getScore();
		    maxIndex = i;
		}
	    }
	    temp = scores[j];
	    scores[j] = scores[maxIndex];
	    scores[maxIndex] = temp;
	}   
    }
    
    public static void display(HighScores[] scores) {
	System.out.println("        Top Scorers!");
	for(int i = 0; i < scores.length; i++) 
	    System.out.printf("%10s:%11d\n", scores[i].getName(), scores[i].getScore());
    }
}