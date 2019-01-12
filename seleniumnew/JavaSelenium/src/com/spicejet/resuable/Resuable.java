package com.spicejet.resuable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resuable {

	public WebDriver driver;

	public void launchbrowser(String browser) {
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {

			driver = new FirefoxDriver();
		}
	}
	
	public void explicitwait(String Locator){
		
		WebDriverWait wt = new WebDriverWait(driver,5);
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("locator"))).click();;
		
	}

	public void maximizebrowser() {

		driver.manage().window().maximize();
	}

	public void invokeapplication(String url) {

		driver.get(url);
	}

	public void click(String Locator) {

		driver.findElement(By.xpath("Locator")).click();
	}

	public void sendtext(String Locator, String textdata) {

		driver.findElement(By.xpath("Locator")).sendKeys("textdata");
	}

	public void dropdown(String Locator, int indexnumber) {

		WebElement element = driver.findElement(By.xpath("Locator"));
		Select dropdown = new Select(element);
		dropdown.selectByIndex(indexnumber);
	}

	public void checkbox(String Locator) {

    driver.findElement(By.xpath("Locator")).isSelected();
   
	}

	public void sendtext(String locator, int number){
     
		driver.findElement(By.xpath("Locator")).sendKeys("number");
	
	}
}
