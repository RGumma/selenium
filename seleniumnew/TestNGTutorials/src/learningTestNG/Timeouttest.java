package learningTestNG;

import org.testng.annotations.Test;

public class Timeouttest {
	
	@Test(timeOut=3000)
	public void firstTest() throws InterruptedException{
		
		Thread.sleep(2000);
	System.out.println("paused the excution for 2 sec");	
	}
	
	@Test(timeOut=3000)
	public void secondtest() throws InterruptedException{
		Thread.sleep(4000);
		
		System.out.println("paused the execution for 4 sec");
		
	}
	

}
