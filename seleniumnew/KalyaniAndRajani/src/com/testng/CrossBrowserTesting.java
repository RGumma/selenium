package com.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTesting {
	
	
	WebDriver driver ;
	
	//String browser="chrome";
	@Parameters("browser")
	
	@BeforeTest
	
	public void openBrowser(String browser)
	{
	if(browser.equals("firefox"))
	{
		driver =new FirefoxDriver();
	}else if(browser.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	}else if(browser.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\Lenovo\\Downloads\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	else{
		throw new IllegalArgumentException("the browser name invalid");
	}	
	
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test
	
	public void multibrowser() throws InterruptedException	{
		driver.get("https://www.bing.com");
		Thread.sleep(10000);
	}

}
