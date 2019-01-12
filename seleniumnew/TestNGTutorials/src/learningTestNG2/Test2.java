package learningTestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups = { "A" })
	   public void login() 
	  {
	      System.out.println("PrintMessage()");
	  }
	
	@Test(groups= {"A"})
	
	public void checkmail(){
		
		System.out.println(" checkmail test code");
	}

	@Test(dependsOnGroups = { "A" }) 
	public void LogOut(){ 
	
		System.out.println("LogOut Test code.");

	}
}
