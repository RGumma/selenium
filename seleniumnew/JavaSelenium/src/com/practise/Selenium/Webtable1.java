package com.practise.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.learning.java.WebElements;

public class Webtable1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		
		WebElement table =driver.findElement(By.xpath(".//*[@id='1538225106420-grid-container'/div[2]"));
		
		List<WebElement>element = table.findElements(By.xpath(".//.//*[@id='1538225106420-grid-container']/div[2]/div/div"));
		
	   int count=  element.size();
	   
	   System.out.println(count);
		 
		
		//System.out.println(row);
		
		//WebElement element= driver.findElement(By.xpath(".//*[@id='1538225106420-grid-container']/div[2]/div/div[1]/div/div[@id='1538225106420-0-uiGrid-0005-cell']"));
		
		//String text =element.getText();
		
		//System.out.println(text);
		
		
		
		
		
	}

}
