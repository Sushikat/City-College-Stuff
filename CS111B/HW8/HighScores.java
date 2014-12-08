/**
   Name: Iris Buschelman
   Course: CS111B -- Programming Fundamentals : Java
   CRN: 52499 - 001
   Assignment: HighScores.java
   Date: 07/06/2014
*/
public class HighScores {
    String name;
    int score;

    HighScores(String n, int s) {
	name = n;
	score = s;
    }
    void setName(String n) {
	name = n;
    }
    String getName() {
	return name;
    }
    void setScore(int s) {
	score = s;
    }
    int getScore() {
	return score;
    }
}