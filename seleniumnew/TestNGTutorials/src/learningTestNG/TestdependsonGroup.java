package learningTestNG;

import org.testng.annotations.Test;

public class TestdependsonGroup {
	
	@Test(dependsOnGroups="firstgroup")
	public void testone(){
		
		
		System.out.println("This is the actual test case to be executed");
	}
	
  @Test(groups="firstgroup")
  public void testtwo(){
	  
	  System.out.println("This test belongs to first-group");
  }
	@Test(groups="secondgroup")
public void testthree(){
	
	System.out.println("This test belongs to second-group");
}
	

}
