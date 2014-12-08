public abstract class FarmObject
{
    String name = "Generic Farm Object";
    
    public void setName(String newName)
    {
	name = new String(newName);
    }
    
    public String getName()
    {
	return name;
    }
    
}