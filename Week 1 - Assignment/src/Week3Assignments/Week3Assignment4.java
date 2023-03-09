package Week3Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Week3Assignment4 {
	
	public static void main(String [] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Hyundai i10");
		cars.add("Maruti Swift");
		cars.add("Maruti Wagon R");
		cars.add("Hyundai Creta");
		cars.add("Honda City");
		cars.add("Toyota Fortuner");
		
		System.out.println("Arraylist Before reversing: ");
		System.out.println(cars);
		
		Collections.reverse(cars);
		
		System.out.println("Arraylist After reversing: ");
		System.out.println(cars);
		
	}

}