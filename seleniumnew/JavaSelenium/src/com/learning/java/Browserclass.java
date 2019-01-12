package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Browserclass {

private WebDriver driver = null;
	
	private String url = "http://newtours.demoaut.com/";
	
	private WebElement register = null;

	/**
	 * Method that setups the browser 
	 * @param browser
	 */
	public void setup(String browser) {

		if (browser.equals("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(url);
		register = driver.findElement(By.linkText("REGISTER"));
		register.click();
	}

	/**
	 * Generic method that selects webelement using a locator
	 * @param locator
	 * @param value
	 */
	public void selectTextBox(String locator, String value){

		driver.findElement(By.name(locator)).sendKeys(value);
	}
	
	public void selectDropDown(String locator, int index){

		Select dropDown = new Select( driver.findElement(By.name(locator)));
		dropDown.selectByIndex(index);
	}
	
	public void selectDropDown(String locator, String value){

		Select dropDown = new Select( driver.findElement(By.name(locator)));
		dropDown.selectByValue(value);
	}
	
	public void selectButton(String locator){

		driver.findElement(By.name(locator)).click();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void close() {

		driver.close();
	}
}
