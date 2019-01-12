package com.learning.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SamplePageFactory {

	public static void main(String...args){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		PageFactory.initElements(driver, pageClassToProxy)
	}
}
