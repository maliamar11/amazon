package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotation {
	  @Test
	  public void C() {
		  System.out.println("     it is Secound Test  C  ");
	  }
	
	  @Test
	  public void B() {
		  System.out.println("     it is Secound Test  B  ");
	  }
@Test
  public void A() {
System.out.println("      it is First Test A   ");
  }
  @BeforeMethod
  public void beforeMethod() {
System.out.println("it is BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("it is AfterMethod");
  }

  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("it is BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("it is AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("it is BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("it is AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
  System.out.println("it is BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
  System.out.println("it is AfterSuite");
  }

}
