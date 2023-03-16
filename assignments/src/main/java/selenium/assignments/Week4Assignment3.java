package selenium.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Week4Assignment3 {
	
	public static void main(String [] args) throws Exception
	{
		
		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
       
    	WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        
        
	}

}
	
