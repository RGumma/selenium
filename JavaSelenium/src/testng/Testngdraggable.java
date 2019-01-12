package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdraggable {

	public WebDriver driver;

	@BeforeTest
	public void openingbrowser() {

		System.out.println("Executing BeforeSuite");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	

	@AfterTest
	public void shutDown() {

		System.out.println("Executing after suite");
		driver.close();
		System.exit(0);
	}

	@BeforeMethod
	public void openingurl() {

		System.out.println("Executing BeforeTest");
		driver.get("http://jqueryui.com/");
	}

	@Test
	public void datapicker() throws InterruptedException {
		
		System.out.println("In datePicker "+driver.getCurrentUrl());
		driver.findElement(By.linkText("Datepicker")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//driver.findElement(By.linkText("12")).click();
		WebElement element = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody"));
		List<WebElement> rows = element.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> coloumns = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < coloumns.size(); j++) {
				String table_values = coloumns.get(j).getText();
				System.out.println("The values are " + table_values);
			}
		}
	}
	
	@Test
	public void draggable() throws InterruptedException {

		System.out.println("Current page is ="+driver.getCurrentUrl());
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		action.dragAndDropBy(element, 150, 150).build().perform();
	
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}
}
