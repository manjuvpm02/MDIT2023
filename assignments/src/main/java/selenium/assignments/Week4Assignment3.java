package selenium.assignments;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Week4Assignment3 {
	
	public static void main(String [] args) throws Exception
	{
		
		String[] colorsToSelect = { "red","blue","purple" };
		
		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	options.addArguments("--start-maximized");
       
    	WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        js.executeScript("window.scrollBy(0,200)");  

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));
		//System.out.println("Number of Check boxes : "+ Integer.toString(checkboxes.size()));		
		for (WebElement element : checkboxes) {
			
			//System.out.println("Inside for each");
			
			//String actualValue=element.getAttribute("value");
			
			//System.out.println(actualValue);

			//if ((actualValue.contains("red"))||(actualValue.contains("blue"))||(actualValue.contains("purple")))
			//{
				//element.click();
			//}			
			
			if (Arrays.asList(colorsToSelect).contains(element.getAttribute("value").trim())) {
				element.click();
			}
		}
			
		
		Thread.sleep(2000);
		driver.quit(); 

		
		
	}

}
		
		
