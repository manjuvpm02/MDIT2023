package selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week4Assignment7 {
	public static void main(String [] args) throws Exception
	{
				
		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*"); //Temporary solution to resolve web socket issue that arrived with new chrome update
    	options.addArguments("--start-maximized"); //To have the max window size
       
    	WebDriver driver = new ChromeDriver(options); //Initialize driver
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit wait implementation
        
        driver.get("https://hms.techcanvass.co/");   //Navigate to URL
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//Ending implicit wait

        
        WebElement loginTextBox= driver.findElement(By.xpath("//input[@id='txtUserName']")); //Finding login text box using xpath  
        loginTextBox.sendKeys("Pradnya"); //Sending input through keyboard
        
        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@id='txtPassword']")); //Finding password box using xpath
        passwordTextBox.sendKeys("1994"); //Sending input through keyboard
        
        WebElement staySignedIn = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='chkstaysignedin']"))); //Explicit wait till the visibility of stagsigned in checkbox
       
        staySignedIn.click(); //Clicking on stay signed in   
        
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='LoginButton']")); //Finding login button using xpath
        loginButton.click(); //Click login button
        
        //Fluent Wait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
        
        
        Thread.sleep(2000); //For testers to see the final screen
        driver.quit(); //Quitting the driver

	}
}
