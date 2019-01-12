package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {

	public WebDriver driver;

	@BeforeTest
	public void openingurl() {

		System.out.println("Executing BeforeTest");
		driver.get("http://jqueryui.com/");

	}

	@AfterTest

	public void closingbrowser() {

		System.out.println("Executing AfterTest");
		driver.close();

	}

	@Test

	public void datapicker() throws InterruptedException {

		driver.findElement(By.linkText("Datepicker")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		// driver.findElement(By.linkText("12")).click();
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
}
