package learningTestNG2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	
	@Parameters({"suite-param"})
	@Test
	public void paramterTestone(String param){
		
	System.out.println("Test is suite param" +param);	

	}
	
	@Parameters({"test-two-param"})
	@Test
	public void parameterTesttwo(String param){
		
		System.out.println("Test two " +param);
		
	}
	
		@Parameters({"test-two-param"})
	   @Test
	   public void parametertesttwo(String param){
			
		System.out.println("Test two param " +param);	
			
		}
		
	     @Parameters({"suite-param" , "test-three-param"})
		@Test
		public void prameterTestThree(String param, String paramTwo) {
	        System.out.println("Test three suite param is: " + param);
	        System.out.println("Test three param is: " + paramTwo);
	    }
		
		
	}


