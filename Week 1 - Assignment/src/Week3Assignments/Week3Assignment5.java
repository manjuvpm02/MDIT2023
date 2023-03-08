package Week3Assignments;

import java.util.Map;
import java.util.HashMap;

public class Week3Assignment5 {
	
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
		
		System.out.println("Printing HashMap elements using for each:");

		
        for (Map.Entry<Integer,String> entry : studentData.entrySet()) 
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
		
		
}


