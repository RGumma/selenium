package learningTestNG;

import org.testng.annotations.Test;

public class Test5 {
	
	@Test(groups= {"smoke"})
	
	public void tc_1(){
		
		System.out.println("smoke First test case");
		
	}
	
	@Test(groups= {"smoke"})
	public void tc_2(){
	
		System.out.println("smoke first test case");
	
	}
	
	public void tc_3(){
		
		System.out.println("Smoke first test case");
	}
	
}

