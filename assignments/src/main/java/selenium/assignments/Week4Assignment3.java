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
		
		String[] colorsToSelect = { "Red","Blue","Purple" };
		
		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	options.addArguments("--start-maximized");
       
    	WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        js.executeScript("window.scrollBy(0,200)");  

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));
		//System.out.println("Number of Check boxes : "+ Integer.toString(checkboxes.size()));
		//List<String> colorsToSelectList = Arrays.asList(colorsToSelect);
		
		for (WebElement element : checkboxes) {
			
			
			if((element.getAttribute("value"))== "Red")
			{
				element.click();
			}
			
			//for(int i=0;i<3;i++) {
				
			
	
			//if(Arrays.asList(colorsToSelect[i]).contains(element.getAttribute("value")))
					//{
			
						//element.click();
					//}
			//}
		}
        
	}

}
		
		
