package selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Week4Assignment6 {
	
	public static void main(String [] args) throws Exception
	{
				
		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	options.addArguments("--start-maximized");
       
    	WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");  
        js.executeScript("window.scrollBy(0,300)");  

		//List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));
		
//		System.out.print("Checkboxes are ");
//		
//		WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='color'][1]"));
//		value = checkBox1.getText();
//    	System.out.print(value);

        
//        for(WebElement cb :checkboxes)
//        {
//        	
//        	System.out.print(cb);
//        	System.out.print(",");
//        }

        //WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		//radio.click();
		
		WebElement elements = driver.findElement(By.xpath("(//form)[1]"));
		System.out.println(elements.getText());
		elements = driver.findElement(By.xpath("(//form)[2]"));
		System.out.println(elements.getText());
 
		
		Thread.sleep(2000);
        driver.quit();
 
	
	}

}
