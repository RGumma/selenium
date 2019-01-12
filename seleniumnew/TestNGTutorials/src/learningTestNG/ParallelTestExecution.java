package learningTestNG;

import org.testng.annotations.Test;

public class ParallelTestExecution {

	
		
		@Test
		
		public void test1(){
			
			System.out.println("testcase1");
		}
		
		@Test
		
		public void test2(){
			
			System.out.println("testcase2");
		}
		
		
    @Test
    
    public void test3(){
    	
    	
    	System.out.println("testcase3");
    }
	

}
