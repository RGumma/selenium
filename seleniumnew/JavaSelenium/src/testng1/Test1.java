package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	 @BeforeClass
	 public void openingthedriver(){
		 
		 System.out.println("opening the driver");
	 }
	 
	 @BeforeMethod
	 
	 public void openingthebrowser(){
		 
		 System.out.println("Opening the browser ");
	 }
	 
	 @BeforeGroups("regression")
	 
	 public void regressiontest(){
		 
		 System.out.println("regression testing");
	 }
		
		
		
		@Test
		
		public void Test1(){
		
		System.out.println("testcase1");	
			
		}
		
		
		@Test(groups = "regression")
		
		public void testinggroups(){
			
			
			System.out.println("testcase2");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	

}


