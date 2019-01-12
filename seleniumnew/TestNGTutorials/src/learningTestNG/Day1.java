package learningTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	
	@BeforeClass
	
	public void ploanweb(){
		
		
		System.out.println("I am in ploanweb");
	}
	
	
	@BeforeMethod
	
	public void Refresh(){
		
		
		System.out.println("I am refreshing my details");
	}
	
	
	@Test
	public void demo(){
		
		
		System.out.println("hello");
		
	}
	
	@Test(groups={"Smoke"})
public void secondtest(){
		
		
		System.out.println("hello goo morning");
	}
	
	@BeforeTest
	
	public void ploan1(){
		
		
  System.out.println("I am in ploan1");		
		
	}
	
	
	@AfterSuite
	
	public void last(){
		
		System.out.println("I am last");
	}

}
