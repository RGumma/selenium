package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");

		List<WebElement> element = driver.findElements(By.xpath("//input[@name='group1']"));

		int count = element.size();

		for (int i = 0; i < count; i++) {

			String name=element.get(i).getAttribute("value");
	
		    if(name.equals("Cheese")){
		    	
		    	element.get(i).click();
		    	
		    	Thread.sleep(3000);
		    	
		    	driver.close();
		    	
		    }

			}

		}

	}

