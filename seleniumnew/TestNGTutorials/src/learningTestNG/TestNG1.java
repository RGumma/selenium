package learningTestNG;

import org.testng.annotations.Test;

public class TestNG1 {

	@Test(groups={"test-group"})
	public void testMethod(){
		
		System.out.println("Test method one belonging to group");
		
	}
	
	@Test
	public void testmethodTwo(){
	
	
	System.out.println("Test method two not belonging to groups");
		
	}
	
	@Test(groups={"test-group"})
	
	public void testmethodthree(){
	
		System.out.println("Test method three belonging to group");
	
	}
	
}

