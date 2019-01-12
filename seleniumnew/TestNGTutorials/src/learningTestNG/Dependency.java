package learningTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	//Dependency test in testng will discuss how the test can depend on other tests 
	
	//Test depends on single method
	//Test dependes on multiple method 
	//Test depends on its parent class methods
	
	@Test
	 public void Login() 
	{ 
	  System.out.println("LogIn Test code.");
	  Assert.assertTrue(5>6, "Condition Is False.");
	}

	@Test( dependsOnMethods={"Login"},alwaysRun=true) 
	public void checkMail() 
	{ 
	  System.out.println("checkMail Test code.");
	}

	@Test(dependsOnMethods={"Login","checkMail"},alwaysRun=true) 
	public void LogOut() 
	{ 
	  System.out.println("LogOut Test code.");
	}
	

}