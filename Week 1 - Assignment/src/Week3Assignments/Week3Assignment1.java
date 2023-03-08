package Week3Assignments;

import java.io.File;
import java.io.IOException;

class Week3Assignment1 {
	
	public static void main(String [] args)
	{
		
		try
		{
	
			File myFirstFile = new File("Week3Assignment1.txt");
									
			
			if(myFirstFile.createNewFile())
			{
				
				
				System.out.println("The new file is created");
				
			}
			else
			{
				System.out.println("The file already exists");
			}
					
			
		}catch(IOException e)
		{
			System.out.println("An error occurred!");
		}
		
		
	}
	
	

}
