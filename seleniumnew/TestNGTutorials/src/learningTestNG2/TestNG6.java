package learningTestNG2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG6 {

	@BeforeClass
	public void settingthedriver(){
	
		System.out.println("setting the browser");
		
	}
		
	
	@Test
		public void test3(){
			
			
			System.out.println(" testcase3");
		}
		
		
		
		

	}


