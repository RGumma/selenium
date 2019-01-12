package com.gmail.reusable;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.gmail.businessscripts.TestCase;
import com.gmail.constants.ConstantsGmail;
import com.gmail.utilities.Property;

public class Reusable {

	static WebDriver driver;

	
	static Property prop = new Property(ConstantsGmail.gmObjectRepo);

	public static void launchBrowser() {
		
		driver = new FirefoxDriver();
		 
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
		
	}

	public static void launchUrl(String url) {
		driver.navigate().to(url);
		
	}

	public static void click(String locator, String locatorName)
			throws Throwable {

		try {
			// ImplicitWait();
			driver.findElement(By.xpath(prop.getProperty(locator))).click();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public static void sendText(String locator, String testdata,
			String locatorName) throws Throwable {

		try {
			// ImplicitWait();
			driver.findElement(By.xpath(prop.getProperty(locator))).clear();
			driver.findElement(By.xpath(prop.getProperty(locator))).sendKeys(
					testdata);

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}
	}

	public static void mouseover(String locator, String locatorName)
			throws Throwable {

		try {
			WebElement mo = driver.findElement(By.xpath(prop
					.getProperty(locator)));
			new Actions(driver).moveToElement(mo).build().perform();

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public static void isChecked(String locator, String locatorName)
			throws Throwable {

		try {
			if (driver.findElement(By.xpath(prop.getProperty(locator)))
					.isSelected()) {

			}

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public static void isEnabled(String locator, String locatorName)
			throws Throwable {

		try {
			if (driver.findElement(By.xpath(prop.getProperty(locator)))
					.isEnabled()) {

			}

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public static String getTitle() throws Throwable {

		String text = driver.getTitle();
		Reporter.log("Title of the page is:" + text);
		return text;
	}

	public static void verifyTitle(String title) throws Throwable {

		if (driver.getTitle().equals(title)) {

			System.out.println("Page title is verified with " + title);
		} else {

			System.out.println("Page title is not matched with " + title);
		}

	}

	public static void screenShot(String fileName) {
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
			// Now you can do whatever you need to do with it, for example copy
			// somewhere
			FileUtils.copyFile(scrFile, new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrameByIndex(int index) throws Throwable {
		try {
			driver.switchTo().frame(index);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void switchToFrameById(String idValue) throws Throwable {
		try {
			driver.switchTo().frame(idValue);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void draggable(String source, int x, int y)
			throws Throwable {
		
		try {

			WebElement dragitem = (driver.findElement(By.xpath(prop.getProperty(source))));

			new Actions(driver).dragAndDropBy(dragitem, x, y).build().perform();
			Thread.sleep(5000);
			
		} catch (NoSuchElementException e) {
			
		}
	}
	

	public static void draganddrop(String source, String target, String locatorName)
			throws Throwable {
		
		try {
			WebElement from = driver.findElement(By.xpath(prop.getProperty(source)));
			WebElement to = driver.findElement(By.xpath(prop.getProperty(target)));
			new Actions(driver).dragAndDrop(from, to).perform();
		} catch (Exception e) {
			
		}
	}
	
	
	

	public static void rightclick(String source, String locatorName) throws Throwable {
		
		try {
			WebElement elementToRightClick = driver.findElement(By.xpath(prop.getProperty(source)));
			Actions clicker = new Actions(driver);
			clicker.contextClick(elementToRightClick).perform();
			
		} catch (Exception e) {
			
		} 
	}
	
	
	
	
	public static void quitBrowser() {
		driver.quit();
	}
}
