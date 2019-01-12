package learningTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1Annotations {
  
	
	@BeforeClass
	
	public void initializethedriver(){
		
		
		System.out.println(" initialize the browser");
	}
	
	
	@BeforeMethod
	
	public void openthebrowser(){
		
	System.out.println(" opening the browser");	
		
	}
	
	@Test
	
	public void test1(){
		
		System.out.println("Inside Test 1");
		
		
	}
		
		
		

	}


