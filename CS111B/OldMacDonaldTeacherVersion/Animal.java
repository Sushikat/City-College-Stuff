public class Animal extends FarmObject
{
    public void move()
    {
	System.out.println("Animal move(): Locomotion");
    }
    public String getName(){
	return "Generic Animal Object";
    }
}