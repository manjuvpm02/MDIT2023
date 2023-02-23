import java.util.Scanner;

public class Week1Assignment7 {
	
	public static void main(String[] args)
	{
	
		String choice;
		
		System.out.print("How much money will you contribute every year? ");
		
		Scanner in1 = new Scanner(System.in);
		double investAnnum = in1.nextInt();
		
		
		System.out.print("Interest rate in %: ");
		double rate = in1.nextInt();
		
		Scanner in2 = new Scanner(System.in); //Used new scanner to resolve a bug, input was showing in console while using the same scanner
		
		double amt=investAnnum;
		int year=0;
		
		do {
			
			amt= amt+(amt*rate*1/100);
			
			year++;
			
			System.out.println("After year " + year + ", your balance is " +amt+ "" );
				
			System.out.print("Ready to retire? (Y/N)");
				 
			choice = in2.nextLine();
			
			choice=choice.toUpperCase();
			
			
			}while(choice.equals("N"));
		
		if(choice.equals("Y"))
		
		{
			System.out.println("Happy Retirement!!");
		}
		
		in1.close();
		in2.close();
	}

}
