package com.gmail.scriptsexecution;

import org.testng.annotations.Test;

import com.gmail.businessscripts.TestCase;
//import com.relevantcodes.extentreports.ExtentReports;



public class TestExecution extends TestCase{

	@Test
	public  void execution() throws Throwable {
		
		gmailLogin();
		
	}
	
}
