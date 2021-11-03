package TestNG;

import org.testng.annotations.Test;

public class DataProvider {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
      new Object[] { 4, "d" },
      new Object[] { 5, "f" },

    };
  }
}
