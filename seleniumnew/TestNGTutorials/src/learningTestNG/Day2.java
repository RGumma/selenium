package learningTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	
	@BeforeMethod
	
	public void ploanrefresh(){
		
	System.out.println("I am in ploanrefresh");	
		
	}
	
	
	
	@BeforeClass
	
	public void Iamfirstinclass(){
		
		
		System.out.println(" I am in firstin class");
	}
	
	
	@Test(groups={"Smoke"})
	public void ploan(){
		
		System.out.println("I am in personal loan");
		
	}
	
	
	
	
	
	

}
