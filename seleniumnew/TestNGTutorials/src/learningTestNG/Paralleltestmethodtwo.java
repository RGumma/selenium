package learningTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Paralleltestmethodtwo {
	
	
	@Test
	public void method3(){
		
		System.out.println("method3");
	}
	
	@Test
	public void method4(){
		
		System.out.println("method4");
	}

}
