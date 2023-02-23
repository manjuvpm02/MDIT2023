import java.util.Scanner;

public class Week1Assignment6 {
	
	public static void main(String[] args)
	{
		
		System.out.print("How much money do you need to retire? ");
		
		Scanner x = new Scanner(System.in);
		int FinalAmount = x.nextInt();
		
		
		System.out.print("How much money will you contribute every year? ");
		int investannum = x.nextInt();
		
		
		System.out.print("Interest rate in %: ");
		int rate = x.nextInt();
		
		int i=0,amt;
		
		amt=investannum;
		
		
		do{
			
			amt= investannum+amt+(amt*rate*1/100);
			
			i++;
			
		}while(amt<FinalAmount);
		
				//System.out.println("Amount is"+amt);
		
		System.out.println("You can retire in " + i + " years.");	
		
		
		x.close();	
		
	}

}
