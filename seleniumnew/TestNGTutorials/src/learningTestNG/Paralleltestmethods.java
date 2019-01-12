package learningTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Paralleltestmethods {
	
	
	@Test
	
	public void method1(){
		
		System.out.println(" method1");
	}
	
	@Test
	
	public void method2(){
		
		
		System.out.println("method2");
	}
	

}
