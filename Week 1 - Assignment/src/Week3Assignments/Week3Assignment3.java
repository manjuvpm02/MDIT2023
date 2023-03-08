package Week3Assignments;

import java.util.ArrayList;
import java.util.Scanner;


public class Week3Assignment3 {

	public static void main(String [] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Hyundai i10");
		cars.add("Maruti Swift");
		cars.add("Maruti Wagon R");
		cars.add("Hyundai Creta");
		cars.add("Honda City");
		cars.add("Toyota Fortuner");
		
		System.out.println("List of cars:"+cars);
		
		System.out.print("Specify the index from where the string has to be removed: ");	
		
		Scanner in = new Scanner(System.in);
		int indexNo = in.nextInt();
		
		String removedCar=cars.remove(indexNo);
		
		System.out.println("String removed from array list: " +removedCar);
	
		
		
		in.close();

	}
}
