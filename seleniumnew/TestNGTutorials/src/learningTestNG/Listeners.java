package learningTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

//ITlisteners is a interface which implementsTestng Listners
public class Listeners extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("test cases are started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		
		System.out.println("Test cases are passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test cases are failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test cases are skipped");
	}

	

	
}
