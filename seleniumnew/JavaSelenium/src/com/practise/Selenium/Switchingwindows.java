package com.practise.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingwindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");
   
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://demo.automationtesting.in/Windows.html");
		 
		 String parentwindow =driver.getWindowHandle();
		 
		 driver.findElement(By.xpath(".//*[@id='Tabbed']/a/button")).click();
		 
		
		  Set<String>windowhandles = driver.getWindowHandles();
		  
		  for(String child : windowhandles){
			  
			  if(!child.contains(parentwindow)){
				  
				  driver.switchTo().window(child);
				  
				 }
			  
			  
	
			  
			  
			  
			  
		  }
		  
		  
		  
		  
		  
		  
		 
		
		 
		 
		 
		
		

	}

}
