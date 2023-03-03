package Week2Assignments;

import java.util.Scanner;

public class Week2Assignment9 extends TemperatureConverter {
	
	public static void main(String[] args)
	{
		
		int option;

		
		Scanner input=new Scanner(System.in);
		TemperatureConverter convert = new TemperatureConverter();
		double value;
		
		System.out.println( "1. Celcius to Fahrenheit\n"
				+ "2. Celcius to Kelvin\n"
				+ "3. Fahrenheit to Celcius\n"
				+ "4. Fahrenheit to Kelvin\n"
				+ "5. Kelvin to Celcius\n"
				+ "6. Kelvin to Fahrenheit\n"
				+ "7. Exit\n");

		
		do {
			
		
			System.out.print("Enter Choice: ");
		
			option=input.nextInt();
		
			switch(option) {
		
				case 1:
					
					System.out.print("Enter Celsius value: ");		
					value=input.nextDouble();
					//convert.celsiumToFahreinheit(value);
					System.out.println("Fahrenheit value: "+convert.celsiumToFahreinheit(value));
					break;
				
			
				case 2:
				
					System.out.print("Enter Celsius value: ");		
					value=input.nextDouble();
					System.out.println("Kelvin value: "+convert.celsiumToKelvin(value));
					break;
		
				case 3:
				
					System.out.print("Enter Fahrenheit value: ");		
					value=input.nextDouble();
					System.out.println("Kelvin value: "+convert.fahreinheitToCelsius(value));
					break;
		
				case 4:
				
					System.out.print("Enter Fahrenheit value: ");		
					value=input.nextDouble();
					System.out.println("Kelvin value: "+convert.fahreinheitToKelvin(value));
					break;
				
				case 5:
				
					System.out.print("Enter Kelvin value: ");		
					value=input.nextDouble();
					System.out.println("Celsius value: "+convert.kelvinToCelsius(value));
					break;
				
				case 6:
				
					System.out.print("Enter Kelvin value: ");		
					value=input.nextDouble();
					System.out.println("Fahrenheit value: "+convert.kelvinToFahreinheit(value));
					break;
				
				case 7:
				
					System.out.println("Program Terminated\n");
					break;		
			}
		
		}while(option < 7);	
		
		input.close();
		
	}
	
	

}
