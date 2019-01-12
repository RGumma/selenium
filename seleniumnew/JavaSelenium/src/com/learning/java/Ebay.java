package com.learning.java;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ebay {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.ebay.com/");

		int count = driver.findElements(By.tagName("a")).size();

		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));

		int count1 = footer.findElements(By.tagName("a")).size();

		WebElement ebay = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[3]/ul"));

		List<WebElement> links = ebay.findElements(By.tagName("a"));

		for (int i = 0; i < links.size(); i++) {

			if (links.get(i).getText().contains("eBay Classifieds")) {

				System.out.println(driver.getTitle());
				links.get(i).click();
				WebDriverWait wt = new WebDriverWait(driver, 5);
				wt.until(ExpectedConditions.titleContains("Home | eBay Classifieds Group"));
				System.out.println(driver.getTitle());
				Assert.assertEquals("Home | eBay Classifieds Group", driver.getTitle());
				
			}

			boolean abc = driver.findElement(By.xpath(".//*[@id='logo-ebayClassifiedsGroup']/a/img")).isDisplayed();

			Thread.sleep(3000);

			if (abc == true) {

				System.out.println("pass");

			} else {

				System.out.println("fail");
			}

		}

	}
}
