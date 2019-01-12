package learningTestNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTest4 {
	
	
	@Test(dependsOnMethods={"openbrowser1"},alwaysRun=true)
	
	public void openthebrowser(){
		
		System.out.println("open the browser");
		
	}
	
	@Test
	
	public void openbrowser1(){
	
		System.out.println("open the browser1");
	
	}
	
	@Test
	@Parameters("sampleParaName")
	public void parameterTest(String browser){
		
		System.out.println("chrome browser");
		}
	
	@Test(groups={"Regression"})
	public void smoketest(){
		
		System.out.println("smoketest");
		
	}
		
	
	
}
	


