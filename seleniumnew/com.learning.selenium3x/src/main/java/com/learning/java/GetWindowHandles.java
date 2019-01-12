package com.learning.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent window id is" +parent);
		
		//driver.findElement(By.xpath()
		
		
		driver.findElement(By.xpath(".//*[@id='post-body-6170641642826198246']/a[1]")).click();
		
		Set<String>allWindows= driver.getWindowHandles();
		
		int count = allWindows.size();
		
		System.out.println("Total Window" +count);
		
		for(String child: allWindows){
			
			
			if(!parent.equals(child)){
				
				
				driver.switchTo().window(child);
				
				driver.findElement(By.id("sb_ifc0")).sendKeys("selenium");
				
				Thread.sleep(3000);
				
				driver.close();
				
			}
		
		}
		
	driver.switchTo().window(parent);
	
	System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
