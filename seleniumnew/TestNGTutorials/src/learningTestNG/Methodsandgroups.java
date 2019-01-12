package learningTestNG;

import org.testng.annotations.Test;

public class Methodsandgroups {
	
	
	@Test(groups = "smoke")
	public void logintest(){
		
		System.out.println("i am in login test");
	}
	
	@Test(dependsOnMethods={"logintest"})
	public void checkmail(){
		
		System.out.println("I am in check mail test");
	}
	
	@Test(dependsOnMethods= {"logintest", " checkmail"})
	public void logoutmail(){
		
		System.out.println("I am in logout mail");
	}
	

}
