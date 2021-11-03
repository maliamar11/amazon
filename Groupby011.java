package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Groupby011 {
	public class Groupby01 {
		WebDriver driver;
		String title = "Facebook – log in or sign up";

		@Test(groups= {"sanity"})
		public void A_Starting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Amar\\Desktop\\Selenium\\Selenium_Java_Project\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		}

		@Test (groups = {"sanity","regression"})
		public void Tile() {
			String ActualTiltle ="Facebook – log in or sign up";
			Assert.assertEquals(title, ActualTiltle);
			}

		@Test (groups= {"sanity"})
		public void B_login() {
			driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("9503185");
			driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("533512");
			driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]")).click();
			}
	@Test(groups = {"regression"})
	public void Createaccount() {
		driver.findElement(By.xpath("//div[@id=\"login_link\"]//a[text()='Forgotten password?']")).click();
		
	}
		
		
	}
 
}
