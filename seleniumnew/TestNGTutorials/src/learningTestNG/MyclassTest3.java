package learningTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyclassTest3 {

	@BeforeTest
	
	public void openurl(){
		
		System.out.println(" OPen the url");
	
	}
	
	
	@BeforeClass
	
	public void openthepage(){

	System.out.println("open the page");
	
	}

	
	@Test
	public void openthewindow(){
	
		System.out.println("I am in test32");
		
	}
	
	@Test
	public void depethewindow(){
		
		System.out.println("I am in test12");
		
	}
	
	
	@Test
	@Parameters("browser")
	
		public void parameterized(String browser){
		
		if(browser.equals("firefox")){
			
			System.out.println("open ");
		}
	 	
		
			
		}
	}
	






