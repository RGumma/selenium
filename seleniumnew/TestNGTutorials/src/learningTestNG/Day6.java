package learningTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day6 {
	
	
	@BeforeClass
	
	public void class2(){
		
		System.out.println("I am in class2");

}

@Test

public void Test3(){
	
	System.out.println("I am in test3");
}

@ BeforeMethod
	public void TestMethod2(){
	System.out.println("I am method2");
}


@BeforeTest


public void regressiontest(){
	
System.out.println("I am in regressiontest");	
	
}

}



