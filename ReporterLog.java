package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog {
	@Test
public void Open() {
		System.out.println("open the browser");
		Reporter.log("Browser Launch Successfully",true);
		}
 @Test(enabled = false)
 public void login() {
	 System.out.println("Login Sucessfully");
 }
 @Test(groups = {"sanity"})
 public void A() {
	 System.out.println("It is method A");
 }
 @Test(groups = {"sanity"})
 public void B(){
	 System.out.println("it is method B");
 }
	
 @Test(groups = {"regression"})
 public void C() {
	 System.out.println("It is method C");
 }

}
