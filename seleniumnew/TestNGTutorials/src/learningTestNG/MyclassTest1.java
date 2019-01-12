package learningTestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyclassTest1 extends Day7{
	
	@BeforeSuite
	
	public void openbroser(){
		
		
		System.out.println("Open the browser");
	}
	
	
	@Test(groups="bonding")
	
	public void test1(){
		
		
		System.out.println("Test1");
	}

	
	@Test(groups="bonding")
	
	public void test2(){
		
		System.out.println("Test2");
	}
	
	
	
	@Test
		
	public void test5(){
		
		System.out.println("I am in test5");
	}
		
		
	}
	
	
	

