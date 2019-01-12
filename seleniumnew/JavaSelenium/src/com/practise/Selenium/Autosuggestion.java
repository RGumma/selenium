package com.practise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demos.telerik.com/kendo-ui/autocomplete/index");

		driver.findElement(By.xpath(".//*[@id='countries']")).click();

		driver.findElement(By.xpath(".//*[@id='countries']")).sendKeys("u");

		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='countries_listbox']/li[1]")).click();

	}

}
