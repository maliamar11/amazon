package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver driver;
  @Test(groups= {"sanity"},priority=1)
  public void login() {
	  System.out.println("Login");
	  driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("JR4008");
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Am@431517");
	  driver.findElement(By.xpath("//button[text()='Login ']")).click();
  }
@Test (priority =0,groups = {"sanity"})
public void lauchBrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amar\\Desktop\\Selenium\\Browser Crome\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("Lauch browser");
	driver.get("https://kite.zerodha.com/");
	}

@Test(priority=3)
public void pin() {
	driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys("431517");
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
}
@Test(priority=4)
public void logout() {
	System.out.println("Logout");
}
@Test(priority=5)
public void Close() {
	System.out.println("close");
	
}
}

