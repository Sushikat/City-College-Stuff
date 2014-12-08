public class OldMacDonaldsFarm
{
    
    
    public static void main(String[] args)
    {
	Farmer oldMacDonald = new Farmer();
	
	// add the first field to the farm
	Field newField = new Field();
	newField.setFieldName("North");
	oldMacDonald.addFarmObject(newField);

	// add the second third and fourth fields
	// to the farm
	newField = new Field();
	newField.setFieldName("South");
	oldMacDonald.addFarmObject(newField);
	
	newField = new Field();
	newField.setFieldName("East");
	oldMacDonald.addFarmObject(newField);
	
	newField = new Field();
	newField.setFieldName("West");
	oldMacDonald.addFarmObject(newField);

	oldMacDonald.farmReport();
	System.out.println("Hello from the Farm");
    }
}

