package selenium.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
    public static void main(String[] args) {
    	
    	ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.selenium.dev");

        driver.quit();
    }
}