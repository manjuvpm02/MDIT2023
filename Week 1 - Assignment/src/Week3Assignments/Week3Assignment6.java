package Week3Assignments;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Week3Assignment6 {
	
	public static void main(String [] args)
	{
		Map<Integer, String> studentData = new HashMap<Integer, String>();
		
		studentData.put(101, "Manju");
		studentData.put(102, "Dhyan");
		studentData.put(103, "Manu");
		studentData.put(104, "Deepu");
		studentData.put(105, "Jagada");
		studentData.put(106, "Maheswaran");
		studentData.put(107, "Vijayamma");
		studentData.put(108, "Sasikumar");
		
		Set set=studentData.entrySet();
		Iterator iterator=set.iterator();

		
		System.out.println("HashMap elements using iterator:");

		
		while(iterator.hasNext()){
			   Map.Entry mapEntry=(Map.Entry)iterator.next();  
			   System.out.println("Key: " + mapEntry.getKey() + ", " +"Value: " + mapEntry.getValue());  
			}
    }
		
		
}


