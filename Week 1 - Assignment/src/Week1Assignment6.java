import java.util.Scanner;

public class Week1Assignment6 {
	
	public static void main(String[] args)
	{
		
		System.out.print("How much money do you need to retire? ");
		
		Scanner in = new Scanner(System.in);
		int finalAmount = in.nextInt();
		
		
		System.out.print("How much money will you contribute every year? ");
		int investAnnum = in.nextInt();
		
		
		System.out.print("Interest rate in %: ");
		int rate = in.nextInt();
		
		int year=0,amt;
		
		amt=investAnnum;
		
		
		do{
			
			amt= investAnnum+amt+(amt*rate*1/100);
			
			year++;
			
		}while(amt<finalAmount);
		
				//System.out.println("Amount is"+amt);
		
		System.out.println("You can retire in " + year + " years.");	
		
		
		in.close();	
		
	}

}
