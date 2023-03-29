package selenium.assignments;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;


public class Week4Assignment4{
	public static void takeScreenShot(WebDriver webdriver, String fileWithPath) throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
		
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

		for (WebElement element : checkboxes) {


			if (Arrays.asList(colorsToSelect).contains(element.getAttribute("value").trim())) 
			{
				element.click();
			}			
			
			
		}
		takeScreenShot(driver,generateDateTime());
		Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save("screenshots");
		
		driver.quit();

	}
	    
	private static String generateDateTime() {
		String pattern = "MMddyyyy_HHmmss";

		DateFormat df = new SimpleDateFormat(pattern);
		Date today = Calendar.getInstance().getTime();        
		String todayAsString = df.format(today);

		String screenShotFileName = "SS_" + todayAsString + ".PNG";
		return screenShotFileName;
	}
	


}
