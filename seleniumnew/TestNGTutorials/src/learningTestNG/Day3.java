package learningTestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Parameters({"Url"})
	@Test
	public void openbrowser(String urlname)
	
	{
		
		System.out.println(urlname);
	}
	@BeforeSuite
	
	public void login(){
		
		
		System.out.println("I am number one");
	}
	
	
	@Test(groups={"Smoke"})
	
	public void carloan(){
		
	System.out.println("I am in car loan");	
		
	}
	
	
	@BeforeTest
	
	public void carmobilelogin(){
	
	System.out.println(" I am in carmobile login");
	

}
	
	
	
	
	
	
	
	
	
}
