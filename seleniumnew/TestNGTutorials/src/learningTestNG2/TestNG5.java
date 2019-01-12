package learningTestNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG5 {
	
	@BeforeSuite
	public void intiresources(){
	
		System.out.println("open the resources ");
		
	}
	
	
	@BeforeTest
	
	public void openbrowser(){
		
		
		System.out.println("open browser");

	}

	@BeforeGroups("regression")
	
	public void regressiontest(){
		
		
		System.out.println("regression test");
		
	}
	
	@BeforeClass
	public void intializethedriver(){
		
		System.out.println("initialize the driver");
	}
	
	
	@BeforeMethod
	
	public void setupbrowser(){
		
		System.out.println("setupthebrowser");
		
	}
	
	@Test
	public void testcase1(){
		
		
		System.out.println("test1");
	}
	
	
	@Test(groups="regression")
	
	public void testcase2(){
		
		System.out.println("testcase2");
	}
	
	@AfterMethod
	
	public void closethebrowser(){
		
		System.out.println("close the browser");
	}
	
	@AfterClass
	
	public void closethedriver(){
		
		System.out.println("close the driver");
	}
	
	@AfterGroups("regression")
	
	public void testname(){
		
		System.out.println("testname");
	}

}
