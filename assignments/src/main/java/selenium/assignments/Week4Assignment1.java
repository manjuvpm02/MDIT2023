package selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Week4Assignment1 {
	
    public static void main(String[] args) throws Exception {
    	
    	String dateInput="9-Mar-2023";//Date input, this an be changed as per the need
    	
    	String dateNo=dateInput.split("-")[0];  //splitting the dateinput to take out date number separately  	
    	//String month=dateInput.split("-")[1];
    	//String year=dateInput.split("-")[2];


    	ChromeOptions options=new ChromeOptions(); 
    	options.addArguments("--remote-allow-origins=*");//Temporary solution to resolve web socket issue that arrived with new chrome update
       
    	WebDriver driver = new ChromeDriver(options); //Initialize driver
        
        driver.get("https://jqueryui.com/datepicker/#buttonbar"); //Navigate to URL        
        
               
        WebElement calendarFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']")); //Using xpath to find the calendar frame       
        driver.switchTo().frame(calendarFrame); //switching to the calendar frame
        
        driver.findElement(By.id("datepicker")).click(); //Clicking on the datepicker using the id
        
        
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td")); //Storing all the dates in the table in 'dates'
        
        for(WebElement date : dates) //Going through each date in the table
        {
        	if(date.getText().equals(dateNo)) // if the date matches the input we have given then clicking on it
        	{
        		date.click();
        	}
        }
            
        
       Thread.sleep(2000); //Sleep given so that the testers can see the result
        
       driver.quit();

    	
    }


}
