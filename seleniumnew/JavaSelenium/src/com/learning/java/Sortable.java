package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/sortable/");
		
		
		driver.switchTo().frame(0);
		
		WebElement element= driver.findElement(By.id("sortable"));
		
		Actions act = new Actions(driver);
		
act.clickAndHold(driver.findElement(By.xpath(".//*[@id='sortable']/li[4]"))).moveToElement(driver.findElement(By.xpath(".//*[@id='sortable']/li[1]"))).
release(driver.findElement(By.xpath(".//*[@id='sortable']/li[4]"))).build().perform();
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
