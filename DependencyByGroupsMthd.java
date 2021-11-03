package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyByGroupsMthd {
	public class DependsOnMthd {
		  @Test (groups = {"Login"})
		  public void loginintoapp() {
			  System.out.println("it is loging");
		  }
		  @Test(groups= {"openBrowser"})
		  public void openBrowser() {
			  System.out.println("open browser");
		  }
		  @Test(groups= {"Dashboard"})
		  public void dashboardofapp() {
			  System.out.println("it is dashboard");
		  }
		  @Test (groups= {"Logout"})
		  public void logoutfromapp() {
			  String s1 = "abc";
			  String s2 ="Abc";
			  Assert.assertEquals(s1, s2);
			
			  System.out.println("it is logout");
			
		  }
		  @Test (groups = {"close"})
		  public void closeapp() {
			  System.out.println("close");
		  }

	
	}}
