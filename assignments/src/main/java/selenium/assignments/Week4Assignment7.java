package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Week4Assignment7 {
	public static void main(String [] args) throws Exception
	{
				
		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	options.addArguments("--start-maximized");
       
    	WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://hms.techcanvass.co/");  
        
        WebElement loginTextBox= driver.findElement(By.xpath("//input[@id='txtUserName']"));   
        loginTextBox.sendKeys("Pradnya");
        
        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@id='txtPassword']"));   
        passwordTextBox.sendKeys("1994");
        
        WebElement staySignedIn = driver.findElement(By.xpath("//input[@id='chkstaysignedin']")); 
        staySignedIn.click();    
        
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='LoginButton']")); 
        loginButton.click();
        
        
        Thread.sleep(2000);
        driver.quit();

	}
}
