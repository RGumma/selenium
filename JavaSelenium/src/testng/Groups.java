package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups {

	public  WebDriver driver;

	public WebElement element;

	@BeforeSuite
	public void openingbrowser() {

		System.out.println("Before suite");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void closebrowser() {

		System.out.println("After suite");
		driver.close();
	}

	@BeforeTest

	public void openingurl() {

		System.out.println("Before Test");
		driver.get("http://www.telugumatrimony.com/");
	}

	
	public void  testCheckBoxes(String locator, int value) throws InterruptedException {

		System.out.println("in testCheckBoxes for "+locator);
		element = driver.findElement(By.id(locator));
		
		Select dropdown = new Select(element);
		Thread.sleep(4000);
		dropdown.selectByIndex(value);
		Thread.sleep(1000);
	}
 
	public void selectinputbox(String locator, String name) throws InterruptedException {

		System.out.println("in selectinputbox for "+locator);
		driver.findElement(By.id(locator)).sendKeys(name);
		Thread.sleep(1000);
	}

	//@Test(groups = "radiobutton")
	public synchronized void radiobutton(String locator) throws InterruptedException {

		System.out.println("in radiobutton for "+locator);
		driver.findElement(By.id(locator)).click();
		Thread.sleep(1000);
	}

	// @Test

	// public void buttonclick( String button){

	// driver.findElement(By.className(button)).click();
	// }
}
