package Week3Assignments;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Week3Assignment7 {
	
	public static void main(String[] args)
	{
		Map treeMap = new TreeMap();
		
		treeMap.put(101, "Manju");
		treeMap.put(102, "Dhyan");
		treeMap.put(103, "Manu");
		treeMap.put(104, "Deepu");
		treeMap.put(105, "Jagada");
		treeMap.put(106, "Maheswaran");
		treeMap.put(107, "Vijayamma");
		treeMap.put(108, "Sasikumar");
		
		Set set=treeMap.entrySet();  
		Iterator iterator=set.iterator();  
 

		System.out.println("TreeMap elements using iterator:");
		while(iterator.hasNext()){
		   Map.Entry mapEntry=(Map.Entry)iterator.next();  
		   System.out.println("Key: " + mapEntry.getKey() + ", " + "Value: " + mapEntry.getValue());  
		} 

	}

}
