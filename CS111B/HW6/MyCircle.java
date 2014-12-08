B/**
 * MyCircleTester is in the Main method
 * 
 * Name: Iris Buschelman
 * Course: CS111B -- Programming Fundamentals: Java
 * CRN: 52499 - 001
 * Assignment: MyCircle.java
 * Due Date: 7/2/2014
 * @author Iris
 */
public class MyCircle {
    final double PI = 3.14159265;
    double radius,x,y;
    /**
       Assigns a value to x
       @param value the value to be assigned to the x coordinate
     */
    public void setX(double value) {
	x = value;
    }    
    /**
       Retrieves the value for the x coordinate of the circle's center
       @return x the x coordinate of the circle's center
     */
    public double getX() {
	return x;
    }
    /**
       Assigns a value to y
       @param value the value to be assigned to the y coordinate
     */
    public void setY(double value) {
	y = value;
    }
    /**
       Retreives the value for the y coordinate of the circle's center
       @retrun y the y coordinate of the circle's center
     */
    public double getY() {
	return y;
    }
    /**
       Assigns the value of the radius of the circle
       @param value the value to be assigned to the radius of the circle
     */
    public void setRadius(double value) {
	radius = value;
    }
    /**
       Retrives the value of the radius
       @return radius the radius of the circle
     */
    public double getRadius() {
	return radius;
    }
    /**
       Retrives the Area calculated by PI*Radius^2
       @return PI*radius^2 the area formula using the circle's radius
     */
    public double getArea() {
	return PI * radius*radius;
    }
    /**
       Use distance squared compared to max distance squared to solve check for Overlap
       Can use squares because if oneNum > otherNum, than oneNum^2 > otherNum^2  
       @param otherCircle is the circle to be checked against the current circle
       @return boolean to see if overlap occured
     */
    public boolean doesOverlap(MyCircle otherCircle) {
	double realDist = (otherCircle.x - x)*(otherCircle.x - x) + (otherCircle.y - y)*(otherCircle.y - y);
	double maxDist = (radius + otherCircle.getRadius())*(radius + otherCircle.getRadius());
	if(maxDist > realDist)
	    return true;
	else 
	    return false;
    }
}

