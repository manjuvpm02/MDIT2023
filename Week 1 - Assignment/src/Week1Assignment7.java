import java.util.Scanner;

public class Week1Assignment7 {
	
	public static void main(String[] args)
	{
	
		String choice;
		
		System.out.print("How much money will you contribute every year? ");
		
		Scanner x = new Scanner(System.in);
		double investannum = x.nextInt();
		
		
		System.out.print("Interest rate in %: ");
		double rate = x.nextInt();
		
		Scanner a = new Scanner(System.in); //Used new scanner to resolve a bug, input was showing in console while using the same scanner
		
		double amt=investannum;
		int year=0;
		
		do {
			
			amt= amt+(amt*rate*1/100);
			
			year++;
			
			System.out.println("After year " + year + ", your balance is " +amt+ "" );
				
			System.out.print("Ready to retire? (Y/N)");
				 
			choice = a.nextLine();
			
			choice=choice.toUpperCase();
			
			
			}while(choice.equals("N"));
		
		if(choice.equals("Y"))
		
		{
			System.out.println("Happy Retirement!!");
		}
		
		x.close();
		a.close();
	}

}
