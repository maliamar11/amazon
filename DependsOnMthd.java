package TestNG;

import org.testng.annotations.Test;

public class DependsOnMthd {
  @Test
  public void login() {
	  System.out.println("it is loging");
  }
  @Test(dependsOnMethods = "login")
  public void dashboard() {
	  System.out.println("it is dashboard");
  }
  @Test (dependsOnMethods = "dashboard")
  public void logout() {
	  System.out.println("it is logout");
  }
}
