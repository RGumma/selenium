package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Noofrowsinatable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
		
		WebElement table =driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody"));
		
		       List<WebElement> rows= table.findElements(By.tagName("tr"));
		       
		          Assert.assertEquals(5, rows.size());
		          
		         for(int i=0 ; i<rows.size(); i++){
		        	 
		        	List<WebElement>col= rows.get(i).findElements(By.tagName("td"));
		        	 
		        	for(int j=0; j<col.size();j++){
		        		
		        		String values = col.get(j).getText();
		        	
		        		System.out.println(values);
		        	
		        	}
		        	
		         }
		          
		          driver.close();
		

	}

}
