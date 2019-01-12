package learningTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day5 {
	
	
	@BeforeTest 
	public void openingbrowser(){
		
		System.out.println("opening the browser");
	}
	
	@BeforeClass
	
	public void firstclass(){
		
		System.out.println("i am in firstclass");
	}

	@BeforeMethod
	
	public void logincredentails(){
		
		System.out.println("login credetails");
	}
	
	@Test
	
	public void test(){
		
		System.out.println(" i am in the test");
	}
	
	@Test
	
	public void test1(){
		
		
		System.out.println("i am in test1");
	}
	
}
