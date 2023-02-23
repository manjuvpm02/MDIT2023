import java.util.Random;
import java.util.Scanner;

public class Week1Assignment4 {
	
	public static void main(String[] args)
	{
	
		System.out.println("How many numbers you want to choose? ");	
		
		Scanner in = new Scanner(System.in);
		int noOfNums = in.nextInt();
		
		
		System.out.println("Enter the max limit of the number: ");
		int maxNo = in.nextInt();
		
		int i,randomNumber;
		
		Random ranGenerator = new Random();
    	
		System.out.println("Bet the following combination. It'll make you rich!");
		
		for(i=0;i<noOfNums;i++)
		{
			
			randomNumber = ranGenerator.nextInt(maxNo);
			
			System.out.println(randomNumber);
		}
		
		in.close();
		
		
	}

}
