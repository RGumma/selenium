package com.learning.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

		// driver.manage().window().maximize();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("scroll(0,350)");

		WebElement element = driver.findElement(By.xpath("//input[@value='Confirmation Alert']"));

		element.click();

		driver.switchTo().alert();

		Alert al = driver.switchTo().alert();

		Assert.assertEquals(al.getText(), "Are you sure you want to give us the deed to your house?",
				"correct message");

		al.accept();

		Thread.sleep(3000);

		// System.out.println(al.getText());

		// Assert.assertTrue(al.getText().contains("Are you sure you want to
		// give us the deed to your house?"), "test is passed");

		driver.close();

	}

}
