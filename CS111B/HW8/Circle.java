/**
 * Name: Iris Buschelman
 * Course: CS111B -- Programming Fundamentals: Java
 * CRN: 52499 - 001
 * Assignment: ImprovedCircleClass.java
 * Due Date: 7/6/2014
 * @author Iris
 */
public class Circle {
    final double PI = 3.14159265;
    private double radius;
    private Point origin;
    /**
       Assigns origin to Point o
       Assigns radius to r
       @param o Point at the center of the circle
       @param r radius of the circle
     */
    public Circle(Point o, double r) {
	origin = o;
	radius = r;
    }
    /**
       Creates a Point with provided x and y coordinates
       Assigns r to radius
       @param xValue the x value given to the Point object to create a Point
       @param yValue the y value given to the Point object to create a Point
       @param r the radius of the circle
     */
    public Circle(double xValue, double yValue, double r) {
	origin = new Point(xValue, yValue);
	radius = r;
    }
    /**
       Initializes all of the data to standard points when no input is given
     */
    public Circle() {
	origin = new Point(0,0);
	radius = 1;
    }
    /**
       Copies the data from one circle into another
       @param c the circle from which info is to be copied
     */
    public Circle(Circle c) {
	this.origin = c.origin;
	this.radius = c.radius;
    }

    public static void main(String[] args) {
	Point uno = new Point(5,7);
	Circle one = new Circle(uno,2);
	Circle two = new Circle(3,4,1);
	Circle three = new Circle();
	Circle four = new Circle(one);
	System.out.print("one: " + one.toString());
	System.out.print(" " + one.getArea());
	System.out.println(" " + one.equals(two));
	System.out.print("two: " + two.toString());
	System.out.print(" " + two.getArea());
	System.out.println(" " + two.equals(three));
	System.out.print("three: " + three.toString());
	System.out.print(" " + three.getArea());
	System.out.println(" " + three.equals(four));
	System.out.print("four: " + four.toString());
	System.out.print(" " + four.getArea());
	System.out.println(" " + four.equals(one));
    }
    /**
       Retrives the Point of the center of the circle
       @return the origin of the circle
     */
    Point getOrigin() {
	return origin;
    }
    /**
       Assigns the Point of the center of the circle
       @param p the Point of the center of the circle
     */
    void setOrigin(Point p) {
	origin = p;
    }
    /**
       Assigns the value of the radius of the circle
       @param value the value to be assigned to the radius of the circle
     */
    void setX(double value) {
	origin.setX(value);
    }
    /**
       Retrives the value of the x coordinate of the center of the circle
       @return the x coordinate of the center of the circle
     */
    double getX() {
	return origin.getX();
    }
    /**
       Assigns a value to the y coordinate of the center of the circle
       @param value the value to be assigned to the y coordinate
     */
    void setY(double value) {
	origin.setY(value);
    }
    /**
       Retrives the value of the y coordinate
       @return the y coordinate of the center of the circle
     */
    double getY() {
	return origin.getY();
    }
    /**
       Assigns a value to the radius
       @param value the value to be assigned to the radius
     */
    void setRadius(double value) {
	radius = value;
    }
    /**
       Retrives the value of the radius
       @return the radius of the circle
     */
    double getRadius() {
	return radius;
    }
    /**
       Retrives the Area calculated by PI*Radius^2
       @return PI*radius^2 the area formula using the circle's radius
     */
    double getArea() {
	return PI * radius*radius;
    }
    /**
       Displays the origin and radius of a circle
       @return string displaying the origin and radius of the circle
     */
    public String toString() {
	return "(" + origin.toString() + ", "  + radius + ")";
    }
    /**
       Method that checks to see if the contents of comparing objects match
       @param c the circle to compare to
       @return boolean evaluation of the comparisons between the objects' attributes
     */
    boolean equals(Circle c) {
	return (this.origin.getX() == c.origin.getX()) && 
	    (this.origin.getY() == c.origin.getY()) && 
	    (this.radius == c.radius); 
	    }
    /**
       Use distance squared compared to max distance squared to solve check for Overlap
       Can use squares because if oneNum > otherNum, than oneNum^2 > otherNum^2  
       @param otherCircle is the circle to be checked against the current circle
       @return boolean to see if overlap occured
    */
    boolean doesOverlap(Circle otherCircle) {
	double realDist = (otherCircle.origin.getX() - this.origin.getX()) *
	                  (otherCircle.origin.getX() - this.origin.getX()) + 
	                  (otherCircle.origin.getY() - this.origin.getY()) *
	                  (otherCircle.origin.getY() - this.origin.getY());
	double maxDist = (this.radius + otherCircle.getRadius()) *
	                 (this.radius + otherCircle.getRadius());
	return maxDist > realDist;
    }
}
