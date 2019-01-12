package com.packetFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DriverEngineInitiator {

	
	public WebDriver driver;
		
	@BeforeSuite
	public void driverIntitator(){
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}	
}


