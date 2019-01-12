package learningTestNG2;

import org.testng.annotations.Test;

public class Test3 {
	
	public class Test1 {
		  @Test(groups = { "functest", "checkintest" })
		  public void testMethod1() {
		  }
		 
		  @Test(groups = {"functest", "checkintest"} )
		  public void testMethod2() {
		  }
		 
		  @Test(groups = { "functest" })
		  public void testMethod3() {
		  }
		}

}
