

/**

 * Name: Iris Buschelman

 * Course: CS111B -- Programming Fundamentals: Java

 * CRN: 52499 - 001

 * Assignment: Assignment5.java

 * Due Date: 6/29/2014

 * @author Iris

 */



import java.util.*;

public class Assignment5 {

    

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

	//ArrayList to hold names

	ArrayList<String> names = new ArrayList<>();

	//ArrayList to hold scores

	ArrayList<Integer> scores = new ArrayList<>();

	        

	initialize(names, scores);

	sort(scores, names);

	display(names, scores);

    }

    /**

     * Initializes ArrayLists with values given by the user

     * @param names

     * @param scores 

     */

    public static void initialize(ArrayList<String> names, ArrayList<Integer> scores){

	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter 5 names, each followed by a score");

	for( int i = 1; i <= 5; i++){

	    System.out.printf("\nEnter the name for score #%d: ", i);

	    names.add(keyboard.next());

	    System.out.printf("\nEnter the score for score #%d: ", i);

	    scores.add(keyboard.nextInt());

	}

    }

    /**

     * Sorts ArrayLists so that the scores are in 

     * order and the names stay with their scores. 

     * @param scores

     * @param names 

     */

    public static void sort(ArrayList<Integer> scores, ArrayList<String> names) {

	int maxVal;

	int maxIndex;

	int temp;

	String strTemp;

	for(int j = 0; j < scores.size(); j++){

	    maxVal = scores.get(j);

	    maxIndex = j;

	    for(int i = j + 1; i < scores.size(); i++) {

		if(maxVal < scores.get(i)){

		    maxVal  = scores.get(i);

		    maxIndex = i;

		}

	    }

	    temp = scores.get(j);

	    strTemp = names.get(j);

	    scores.set(j, scores.get(maxIndex));

	    names.set(j,names.get(maxIndex));

	    scores.set(maxIndex, temp);

	    names.set(maxIndex, strTemp);

	}

    }

    /**

     * Displays the values in the ArrayLists in two rows

     * @param names holds the names as input by user

     * @param scores holds the scores as input by user

     */

    public static void display(ArrayList<String> names, ArrayList<Integer> scores){

	System.out.println("        Top Scorers!");

	for(int i = 0; i < names.size(); i++)

	    System.out.printf("%10s:%11d\n", names.get(i), scores.get(i));

    }

}

