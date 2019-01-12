package learningTestNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {

	@Parameters({ "browser"})
	@Test
	public void chromebrower(String browsers){
		
		System.out.println("browser name is " +browsers);
		
	}

}
