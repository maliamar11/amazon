package com.mycompany.app;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Amar\\Desktop\\Selenium\\Browser Edge\\msedgedriver.exe");
		EdgeOptions option = new EdgeOptions();
	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	driver.get("https://zerodha.com/products/kite");
	TakesScreenshot ts = (TakesScreenshot)driver;
File fs=	ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyToDirectory(fs, new File("C:\\my-app\\ScreenShot\\"+ss()+".jpg"));
	}
	public static  String ss() {
		
		return new SimpleDateFormat("YYYY-mm-dd HH-MM-SS").format(new Date());
		
	}

}
