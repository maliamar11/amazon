package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LaunchChrome {
	WebDriver driver;
	
	@Test (priority =0)
	public void Title() {
		
	String s1=	driver.getTitle();
	String s2 = "ToolsQA";	
	assertEquals(s1, s2);
	
	}
  @Test(priority = 1)
  public void clickoperation() {
	  WebElement newbtn =driver.findElement(By.xpath("//button[@id=\"tabButton\"]"));
	  WebElement newwindow = driver.findElement(By.xpath("//button[@id=\"windowButton\"]"));
	  WebElement massage = driver.findElement(By.xpath("//button[@id=\"messageWindowButton\"]"));
	  newbtn.click();
	  newwindow.click();
	  massage.click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Amar\\Desktop\\Selenium\\Selenium_Java_Project\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://demoqa.com/browser-windows");
	 
  }

  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }
  

}
