package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class List_of_Radiobuttons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		
		
	List<WebElement>li=driver.findElements(By.xpath("//input[@name='group1']"));
	
	    Assert.assertEquals(3, li.size());
	    
	   //for(WebElement each:)
	    
	    for(int i=0; i<li.size(); i++){
	    	
	    	String values=li.get(i).getAttribute("value");
	    	
	    	if( values.equals("Butter")){
	    		
	    		li.get(i).click();
	    		
	    		Assert.assertTrue(li.get(i).isSelected());
	    		
	    		break;
	    	}
	    	
	    }
	    
	    
	  driver.quit();
	    
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
