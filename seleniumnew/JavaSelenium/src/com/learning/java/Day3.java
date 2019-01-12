package com.learning.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.expedia.com");
		
		String parenttitle =driver.getTitle();
		
		WebElement element= driver.findElement(By.xpath(".//*[@id='header-history']"));
		
		String parentid =	driver.getWindowHandle();
		
		System.out.println(parentid);
		
		element.click();
		 Set <String> id= driver.getWindowHandles();
		 Iterator it = id.iterator();
		while(it.hasNext()){
			String Childid = it.next().toString();
			System.out.println(Childid);
			
			if(!Childid.contains(parentid)){
				
				driver.switchTo().window(Childid);
				
				String Childtitle = driver.getTitle();
				
				System.out.println(driver.getTitle());
				
				driver.switchTo().window(parentid);
				
				
			}
		}
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


