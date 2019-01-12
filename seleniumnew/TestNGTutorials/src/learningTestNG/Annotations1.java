package learningTestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {
	
	@BeforeClass 
	public void beforeclass(){
		
		System.out.println("I am in before class");
	}
	
	@BeforeGroups("security")
    public void setUpSecurity() {
        System.out.println("setUpSecurity()");
    }
  
    @AfterGroups("security")
    public void tearDownSecurity() {
        System.out.println("tearDownSecurity()\n");
    }
    
    @BeforeMethod
    public void beforemethod(){
    
    	System.out.println("I am in before method");
    
    }
    
    @AfterMethod
    
    public void aftermethod(){
    	
    System.out.println("I am in aftermethod");	
    }
    
    @Test
    
    public void testcase1(){
    	
    	System.out.println("I am in testcase1");
    }
    
    @Test(groups= "security")
    public void accessHomePage() {
        System.out.println("accessHomePage()");
    }
  
    @Test(groups= "security")
    public void accessAdminPage() {
        System.out.println("accessAdminPage()");
        throw new RuntimeException();
	
    

}
    
}
