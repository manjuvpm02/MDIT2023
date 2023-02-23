import java.util.Scanner;

public class Week1Assignment3 {

	public static void main (String args[])
	{
	
		System.out.print("What is your name?  "); 
		
		Scanner a = new Scanner(System.in);  //Taking the input name from the user
		String name = a.nextLine();
		
		
		System.out.print("How old are you?  ");
		
		int age = a.nextInt();
		
		age=age+1;
		
		System.out.print("Hello " + name + ". Next year, you'll be " + age);
		
		a.close();
		
	}
}
