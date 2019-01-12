package com.gmail.businessscripts;

import com.gmail.constants.ConstantsGmail;
import com.gmail.reusable.Reusable;
import com.gmail.utilities.ExcelReader;
import com.gmail.utilities.Property;



public class TestCase extends Reusable{

	static Property prop;
	static ExcelReader read;
	
	//static ExtentReports extent = ExtentReports.get(TestCase.class);
	
	public static  void gmailLogin() throws Throwable {
		prop=new Property(ConstantsGmail.gmObjectRepo);
		 read= new ExcelReader(ConstantsGmail.gmTestData);
		// extent.init("C:\\hello\\myreport.html", true);
		// extent.startTest("gmail login test");
		launchBrowser();
		// extent.log(LogStatus.INFO, "Browser started");
		windowMaximize();
		// extent.log(LogStatus.INFO, "window is maximising");
		launchUrl("http://www.gmail.com");
		// extent.log(LogStatus.INFO, "url is launched");
		sendText("username", read.getCellData("Sheet1", 0, 0), "usernametext");
		//extent.log(LogStatus.INFO, "text enterd in username field");
		click("next", "click on next button");
		//extent.log(LogStatus.INFO, "clicked on next button");
		Thread.sleep(3000);
		sendText("password", read.getCellData("Sheet1", 0, 1), "password text");
		//extent.log(LogStatus.INFO, "text enterd in password field");
		click("signin", "click on sign in button");
		//extent.log(LogStatus.INFO, "clicked on signin button");
		Thread.sleep(5000);
		
		
		quitBrowser();
		 


	}
}
