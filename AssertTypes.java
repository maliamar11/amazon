package Methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class AssertTypes {
WebDriver driver;
	@Test
	 public void CheckTitleUsingHardAssert() {
String s1=driver.getTitle();
String s2 ="google";
Assert.assertEquals(s1, s2);
System.out.println("Test is failed");
		
	}
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Amar\\Desktop\\Selenium\\Browser Crome\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get("https://www.google.com"); 
  }

  @AfterMethod
  public void afterMethod() {
driver.close();
}


    }

