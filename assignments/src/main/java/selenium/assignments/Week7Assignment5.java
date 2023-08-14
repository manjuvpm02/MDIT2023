package selenium.assignments;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Week7Assignment5 {
	

	@Test
	public void HomePageCheck() throws MalformedURLException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability("browserName", "chrome");
		chromeOptions.setCapability("se:name", "Sample program"); 
		chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value"); 
		chromeOptions.setCapability("acceptInsecureCerts", true);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("test automation");
		driver.close();
	}

}
