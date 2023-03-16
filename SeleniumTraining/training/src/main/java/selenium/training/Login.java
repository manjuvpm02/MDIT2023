package selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args)
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://hms.techcanvass.co/");
		 
		 WebElement loginTextBox = driver.findElement(By.xpath("//input[@id='txtUserName']"));
		 
		 loginTextBox.sendKeys("Pradhya");
		 
		 WebElement passwordTextBox = driver.findElement(By.cssSelector("input[name='txtPassword']"));
		 passwordTextBox.sendKeys("1234");
		 
		 

		 
	}

}
