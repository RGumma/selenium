package learningTestNG;

import org.testng.annotations.Test;

public class MyclassTest2 extends Day7 {
	
	@Test(priority=0)
	
	public void test3(){
		
		
	System.out.println("test3");
		
	}

	@Test(priority=1)
	public void test4(){
		
		System.out.println("test4");
	}
	
}
