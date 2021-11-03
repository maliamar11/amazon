package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SkipingOfTest {
  
	@Test  (enabled =false)
   public void A() {
	  System.out.println("It is test  A Skipp");
  }
	
	  @Test (priority = 1)
 public void B() {
		  System.out.println("It is test  B1");
		    }
	  
	@Test (priority = -1)
	public void C() {
		System.out.println("it is test C-1");
	}
	
	@Test(priority = 2)
	public void D() {
		System.out.println("It is test D2");
	}

  @Test (priority = 0)
  public void E() {
	  System.out.println("It is test E 0");
              }
  

  
  @BeforeMethod
  public void beforeMethod() {
 System.out.println("It is BeforeMethod");
	  
  }

  @AfterMethod
  public void afterMethod() {
  System.out.println("It is AfterMethod");
  }

  @Test(priority = 2 , enabled = false)
	public void G() {
		System.out.println("It is test G2");
	}
  
}
