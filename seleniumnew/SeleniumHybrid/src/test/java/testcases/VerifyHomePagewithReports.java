package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import factory.BrowserFactory;
import factory.DataproviderFactory;
import pages.Homepage;

public class VerifyHomePagewithReports {
	
	
	WebDriver driver;
	
	ExtentReports report;
	ExtentTest logger;

	@BeforeMethod
	public void setup() {
		
		
		report= new ExtentReports("./Reports/HomePageReport.html",true);
	
		BrowserFactory.getbrowser("chrome");

		driver.get(DataproviderFactory.getcongig().geturl());

	}
           //cloning creating a repository
	       // commit means the changes from  loccal machine to local repository
	        // push the code from local repository to master 
	@Test
	public void testhomepage() {

		Homepage home = PageFactory.initElements(driver, Homepage.class);

		String title = home.gettitle();

		System.out.println("my application title is " + title);

	}

	@AfterMethod

	public void teardown() {

		BrowserFactory.closebrowser();

	}


}
