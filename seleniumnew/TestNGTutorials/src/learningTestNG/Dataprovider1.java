package learningTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	
	
	
	@Test(dataProvider= "Authication")
	public void test(String username, String password){
		
		System.out.println("username is " +username);
		
		System.out.println("password is " +password);
		
	}
	
	@DataProvider(name="Authentication")
	public Object[][] credentails(){
		
		
		return new Object[][] 
		
				{
		        {"rajani", "123"},
				
				{"rajitha", "456"}
			     };

	    }
	
}


