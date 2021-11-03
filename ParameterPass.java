package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPass {

	@Test
	@Parameters({"val1","val2"})
	public void summ(int val1, int val2) {
		
		int c = val1+val2;
		
		System.out.println();
	System.out.println("Summ ="+c);
	
	}
}
