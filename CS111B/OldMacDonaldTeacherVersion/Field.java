import java.util.ArrayList;

public class Field extends Mineral
{
    // create an instance variable that will let us
    // distinguish between different fields
    String fieldName;
    ArrayList<FarmObject> inThisField;
    
    public String getName(){
	return "Field Object: "+fieldName;
    }

    public void setFieldName(String newName)
    {
	fieldName = newName;
    }
    
    public String getFieldName()
    {
	return fieldName;
    }
}