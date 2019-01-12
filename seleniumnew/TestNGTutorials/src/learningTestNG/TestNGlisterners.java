package learningTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGlisterners {
	
	@Test
	public void loginByEmail(){
		
		System.out.println("login by email");
		Assert.assertEquals("Rajani", "Rajani");
	}
	
	
	@Test
	public void loginbyfacebook(){
		
		System.out.println("Login");
		
		Assert.assertEquals("Rajani", "kumar");
	}
	
	

}
