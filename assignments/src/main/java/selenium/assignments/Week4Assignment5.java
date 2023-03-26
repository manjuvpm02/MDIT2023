package selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Week4Assignment5 {
	
	public static void main(String [] args) throws Exception
	{
				
		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	options.addArguments("--start-maximized");
       
    	WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        js.executeScript("window.scrollBy(0,1300)");  
        
		WebElement radioButtons = driver.findElement(By.xpath("//form[contains(text(),'Your current web browser is:')]//input[@name='browser'][2]"));
		radioButtons.click();

        Thread.sleep(2000);
        driver.quit();
 
	
	}
	
}