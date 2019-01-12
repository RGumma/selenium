package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabledynamicelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/datepicker/");
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	driver.switchTo().frame(0);
  WebElement webtable=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody"));
   
  List<WebElement> rows = webtable.findElements(By.tagName("tr"));
    
     int count = rows.size();
     
     for(int i=0; i<count; i++){
    	 
    	List<WebElement>coloumn= rows.get(i).findElements(By.tagName("td"));
    	 
    	System.out.println(coloumn.size());
    	
    	int count1 = coloumn.size();
    	
    	for(int j=0; j<count; j++){
    		
    		System.out.println(coloumn.get(i).getText());
    	}
    	 
     }
     
    
    
  
  

		
		
		
		
		
		
		

	}

}
