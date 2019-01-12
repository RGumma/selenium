package com.practise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/sortable/");
		
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath(".//*[@id='sortable']"));

		Actions act = new Actions(driver);

		WebElement element = driver.findElement(By.xpath(".//*[@id='sortable']/li[1]"));

		WebElement element1 = driver.findElement(By.xpath(".//*[@id='sortable']/li[3]"));

		act.clickAndHold(element).moveToElement(element1).release(element).build().perform();
		Thread.sleep(3000);
		
		driver.close();

	

	}

}
