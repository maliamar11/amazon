package TestNG;

import org.testng.annotations.Test;

public class PriorityDemo {
	
  @Test(priority = 1)
  public void A() {
	  System.out.println("it is method A");
  }
  @Test(priority = 0)
  public void B() {

	  System.out.println("it is method B");
  }
  @Test(priority = 3)
  public void C() {

	  System.out.println("it is method C");
  }
  @Test(priority = -1)
  public void D() {

	  System.out.println("it is method D");
  }
}
