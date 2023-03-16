package selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Week4Assignment2 {
	
	public static void main(String [] args) throws Exception
	{
		

		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	options.addArguments("--start-maximized");

       
    	WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        
        driver.get("https://jqueryui.com/selectmenu/"); 
        
        js.executeScript("window.scrollBy(0,150)");  
        
        WebElement dropDownFrame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(dropDownFrame);
        
        String xpathForSpeedDropDown = "//select[@id='speed'][@name='speed']";     
        WebElement speedDropDown = driver.findElement(By.xpath(xpathForSpeedDropDown));
        //WebElement speedDropDown = driver.findElement(By.id("speed"));

        
        Select speedOption = new Select(speedDropDown);
        speedOption.selectByVisibleText("Slow");
        
        //List<WebElement> lst = speedOption.getOptions();
        
        //System.out.println(lst);

        
        
        String xpathForFileDropDown = "//select[@id='files'][@name='files']";     
        WebElement fileDropDown = driver.findElement(By.xpath(xpathForFileDropDown));
        
        Select fileOption = new Select(fileDropDown);
        fileOption.selectByVisibleText("ui.jQuery.js");
        
        
        String xpathForNumberDropDown = "//select[@id='number'][@name='number']";     
        WebElement numberDropDown = driver.findElement(By.xpath(xpathForNumberDropDown));
        
        Select numberOption = new Select(numberDropDown);
        numberOption.selectByVisibleText("ui.jQuery.js");
        
        String xpathForTitleDropDown = "//select[@id='number'][@name='number']";     
        WebElement titleDropDown = driver.findElement(By.xpath(xpathForTitleDropDown));
        
        Select titleOption = new Select(titleDropDown);
        titleOption.selectByVisibleText("//select[@id='salutation'][@name='salutation']");
        
        
            
		
		
	}

}
