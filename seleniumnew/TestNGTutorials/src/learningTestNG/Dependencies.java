package learningTestNG;

import org.testng.annotations.Test;

public class Dependencies {
	
	
	
	@Test(groups= "smoke")
	public void login(){
		
	System.out.println("logindetails");	
		
	}

	@Test(dependsOnMethods="login")
	public void checkmail(){
		
		System.out.println("checkmail");
	}
	
 @Test(groups="smoke")
 
 public void logout(){
	
	 System.out.println("logoutdetails");
 }
 
	

}
