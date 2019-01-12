package com.learning.java;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ControlGroup1 {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("Webdriver.chrome.driver",
//				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/controlgroup/");

		// driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("car-type-button")).click();
		
		List<WebElement> dropdownlist = driver.findElements(By.xpath(".//*[@id='car-type-menu']/li"));

		int acount = dropdownlist.size();

		// Assert.assertEquals(7, acount);

		WebElement element1 = driver.findElement(By.xpath(".//*[@id='ui-id-4']"));

		// Actions action = new Actions(driver);

		// action.moveToElement(element).click().build().perform();

		// JavascriptExecutor js = (JavascriptExecutor)driver;

		// js.executeScript("window.scrollTo(0, element1.getLocation().x+")");

		// System.out.println(name1);

		for (int i = 0; i < acount; i++) {

			String name = dropdownlist.get(i).getText();

			if (name.equals("SUV")) {
				Thread.sleep(5000);
				dropdownlist.get(i).click();

				break;

			}

		}

		driver.close();

	}

}
