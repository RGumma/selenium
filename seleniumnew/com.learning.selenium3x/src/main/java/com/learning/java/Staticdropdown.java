package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://spicejet.com/");
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		
		List<WebElement>list =s.getOptions();
		
		System.out.println(list);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
