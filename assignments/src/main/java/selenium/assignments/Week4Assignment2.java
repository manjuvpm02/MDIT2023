package selenium.assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Week4Assignment2 {
	
	public static void main(String [] args) throws Exception
	{
		

		ChromeOptions options=new ChromeOptions(); 
    	options.addArguments("--remote-allow-origins=*");//Temporary solution to resolve web socket issue that arrived with new chrome update
    	options.addArguments("--start-maximized"); //To have the max window size 
    	WebDriver driver = new ChromeDriver(options); //Initialize driver
        JavascriptExecutor js = (JavascriptExecutor) driver; //Initializing javascript executor

        driver.get("https://jqueryui.com/selectmenu/"); //Navigate to URL
        js.executeScript("window.scrollBy(0,150)");  //Scrolling down to the specific location

        
        Actions a = new Actions(driver); // Defining & invoking action class
        
        WebElement demoFrame= driver.findElement(By.xpath("//iframe[@class='demo-frame']")); //Defining demoFrame using xpath
        driver.switchTo().frame(demoFrame); //Switching to demoframe
        
        String xpathForSpeedDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[1]"; //Xpath for speed dropdown    
        WebElement speedDropDown = driver.findElement(By.xpath(xpathForSpeedDropDown)); // Finding speeddropdown using xpath
        
        speedDropDown.click(); // Clicking on dropdown arrow
        a.click(speedDropDown); // Clicking on dropdown
        a.sendKeys(Keys.ENTER).build().perform(); //Clicking on Enter button
        
        
        String xpathForFileDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[2]"; //xpath for file dropdown    
        WebElement fileDropDown = driver.findElement(By.xpath(xpathForFileDropDown)); //Finding file dropdown using the xpath
        
        fileDropDown.click(); //Clicking on dropdown arrow
        a.click(fileDropDown); //Clicking on the dropdown
        a.sendKeys(Keys.ARROW_DOWN).build().perform(); //Pressing down arrow key
        a.sendKeys(Keys.ENTER).build().perform();  //Pressing enter key
        
        
        String xpathForNumberDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[3]"; //xpath for Number dropdown 
        WebElement numberDropDown = driver.findElement(By.xpath(xpathForNumberDropDown)); //Finding Number dropdown using the xpath
        
        numberDropDown.click(); //Clicking on dropdown arrow
        a.click(numberDropDown); //Clicking on the dropdown
        a.sendKeys(Keys.ARROW_DOWN).build().perform(); //Pressing down arrow key
        a.sendKeys(Keys.ARROW_DOWN).build().perform(); //Pressing down arrow key
        a.sendKeys(Keys.ENTER).build().perform(); //Pressing enter key
        
        
        String xpathForTitleDropDown = "(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[4]"; //xpath for title dropdown      
        WebElement titleDropDown = driver.findElement(By.xpath(xpathForTitleDropDown)); //Finding title dropdown using the xpath
        
        titleDropDown.click(); //Clicking on dropdown arrow
        a.click(titleDropDown); //Clicking on the dropdown
        a.sendKeys(Keys.ARROW_DOWN).build().perform(); //Pressing down arrow key
        a.sendKeys(Keys.ARROW_DOWN).build().perform(); //Pressing down arrow key
        a.sendKeys(Keys.ENTER).build().perform(); //Pressing enter key
        
        
       
        
        driver.quit(); //Quitting the driver
             
		
		
	}

}
