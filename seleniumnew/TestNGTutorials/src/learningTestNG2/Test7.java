package learningTestNG2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test7 {
	
	@BeforeTest
	
	public void openingbrowser2(){
		
		System.out.println("open the browser");
	}
	
	@Test
	
	public void test4(){
		
		System.out.println(" testcase4");
	}

}
