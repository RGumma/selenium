package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoView {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		
		//Thread.sleep(5000);

		JavascriptExecutor je = (JavascriptExecutor) driver;

	  WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		
		//Thread.sleep(3000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;


		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
	System.out.println(element.getText());
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
