package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataproviderFactory;
import pages.Homepage;

public class VerifyHomepage {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		BrowserFactory.getbrowser("chrome");

		driver.get(DataproviderFactory.getcongig().geturl());

	}

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
