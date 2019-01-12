package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

 public class Sample {
	
	public WebDriver driver;
	
	@BeforeSuite
	
public void openingbrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
@BeforeTest
	
	public void openingurl(){
		
		driver.get("https://jqueryui.com/");
		
		
}
	
		
		
	
	
		
	@AfterSuite
	
	public void closebrowser(){
		
		driver.close();
		
	}
	
	
	

}
