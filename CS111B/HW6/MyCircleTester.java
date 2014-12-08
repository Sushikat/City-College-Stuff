/**
   Name: Iris Buschelman
   Course: CS111B Programming Fundamentals -- Java
   CRN: 52499-001
   Assignment: MyCircleTester.java
   Date: 07/02/2014
 */
public class MyCircleTester{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	MyCircle ramen = new MyCircle();
	MyCircle soba = new MyCircle();
	MyCircle udon = new MyCircle();
	ramen.setX(2.0);
	ramen.setY(-5.0);
	ramen.setRadius(3.6);
	System.out.println(ramen.getX() +" " + ramen.getY() + " " + ramen.getRadius() + " " + ramen.getArea());
	soba.setX(3.5);
	soba.setY(5.6);
	soba.setRadius(30.0);
	System.out.println(soba.getX() + " " + soba.getY() + " " + soba.getRadius() + " " + soba.getArea());
	System.out.println(ramen.doesOverlap(soba));
	udon.setX(50.6);
	udon.setY(-25.8);
	udon.setRadius(0.8);
	System.out.println(udon.getX() + " " + udon.getY() + " " + udon.getRadius() + " " + udon.getArea());
	System.out.println(udon.doesOverlap(ramen));
    } 
}