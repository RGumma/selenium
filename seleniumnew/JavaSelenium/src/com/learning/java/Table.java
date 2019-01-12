package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/");
		
	WebElement table=	driver.findElement(By.xpath(".//*[@id='post-body-3107268830657760720']/div[1]/table/tbody"));
		              
	           List <WebElement> rows = table.findElements(By.tagName("tr"));
	             
	             
	            for(int i=1; i< rows.size() ;i++) {
	            	
	            	
	            List <WebElement> coloumns = rows.get(i).findElements(By.tagName("td"));
	            	
	           
	           for(int j=0; j < coloumns.size(); j++){
	            	
	            	
	            	  String values = coloumns.get(0).getText();
	            	
	            	  System.out.println("the values  are"  + values);
	            	  
	           // }
	           
	            
	           // }  
		
		
		driver.close();
		

	}

}
