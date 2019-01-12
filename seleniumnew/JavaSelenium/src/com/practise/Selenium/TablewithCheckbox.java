package com.practise.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablewithCheckbox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("http://only-testing-blog.blogspot.com/");
			
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,450)");
			
			driver.manage().window().maximize();
			
			//JavascriptExecutor js =(JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,50)");
			driver.switchTo().frame(driver.findElement(By.name("frame1")));
			
			List<WebElement> table = driver.findElements(By.xpath(".//*[@id='post-body-3107268830657760720']/div[1]/table/tbody/tr/td/input"));
			
			 int count= table.size();
			 
			 for(int i=0; i<count; i++){
				 
				 if(table.get(i).getAttribute("type").equals("checkbox")){
					 
					 table.get(i).click();
					 
					 break;
				 }
			 } 
			 
	}
}


