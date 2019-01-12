package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsvalidations {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com/");
		boolean Boolean = driver.findElement(By.xpath(".//*[@id='sbox']/div[1]")).isDisplayed();

		if (Boolean==true) {

			System.out.println("test case is passed");

		} else {
			System.out.println("test case is failed");

		}

	}

}
