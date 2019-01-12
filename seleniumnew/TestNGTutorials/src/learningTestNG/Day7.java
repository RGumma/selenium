package learningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Day7 {
	
	@BeforeSuite
	public void beforesuite(){
		
		System.out.println("BeforeSuite");
		
	}
	
	
     @BeforeTest
     public void Beforetest(){
    	 
    	 System.out.println("BeforeTest");
     }
 
 
     @BeforeClass
     
     public void beforeclass(){
    	 
    	 System.out.println("Beforeclass");
     }
     
    
     @BeforeMethod
     
     public void beforemethod(){
    	 
    	 System.out.println("Before Method");
     }
     
     
     @AfterMethod
     
     public void aftermethod(){
    	 
    	 System.out.println("after method");
     }
     
    @AfterClass
    
    public void afterclass(){
    	
    	System.out.println("after class ");
    	
    }
     
    @AfterTest
    
    public void aftertest(){
    	
    	System.out.println("After test");
    	
    }
    
    public void Aftersuite(){
    	
    	System.out.println("After Suite");
    }
    
    
    
    
     
}
