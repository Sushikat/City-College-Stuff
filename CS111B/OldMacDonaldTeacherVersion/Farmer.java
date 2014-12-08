import java.util.ArrayList;

public class Farmer extends Human 
{
    // Aggregation create the has-a relationship between Farmer and Farm
    private ArrayList<FarmObject> farm;
    
    Farmer()
    {
	farm = new ArrayList<FarmObject>();
    }
    
    public void addFarmObject(FarmObject newObj)
    {
	farm.add(newObj);
    }
    
    public void farmReport()
    {
	for (FarmObject fo : farm) {
	    if (true == (fo instanceof Animal))
		{
		    System.out.println(fo.getName()+"Is an Animal");
		}
	    else if (fo instanceof Vegetable) 
		{
		    System.out.println(fo.getName()+"Is a Vegetable");
		}
	    else if (fo instanceof Mineral)
		{
		    System.out.println(fo.getName()+"Is a Mineral");
		}
	    
	}
	
    }
}