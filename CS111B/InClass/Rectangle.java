/**
 * Name: Iris Buschelman
 * Course: CS111B -- Programming Fundamentals: Java
 * CRN: 52499 - 001
 * Assignment: Rectangle.java
 * Due Date: 
 * @author Iris
 */
public class Rectangle {
    double length, width;
    Rectangle(double len, double wid){
	length = len;
	width = wid;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Rectangle bob = new Rectangle(6,5);
	bob.printLength();
	bob.printWidth();
	double noodle = bob.findArea();
	double ramen = bob.findPerimeter();
	System.out.println(noodle + " " + ramen);
    }
    public double findArea() {
	return length*width;
    }
    public double findPerimeter() {
	return 2*length + 2*width;
    }
}