package selenium.assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Week4Assignment8Checking3rdResultTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeMethod
public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterMethod
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void checking3rdResult() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1280, 703));
    driver.findElement(By.name("q")).sendKeys("automation testing selenium");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".g:nth-child(10) .yuRUbf")).click();
    driver.findElement(By.cssSelector(".g:nth-child(10) .yuRUbf")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".g:nth-child(10) .iTPLzd"));
      assert(elements.size() > 0);
    }
  }
}
