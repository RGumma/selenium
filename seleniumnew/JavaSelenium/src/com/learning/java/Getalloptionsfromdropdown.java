package com.learning.java;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getalloptionsfromdropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_n32_Newwi\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
	driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	
	WebElement element= driver.findElement(By.xpath("//select[@id='select-demo']"));
	
	     element.click();
		
	        Select dropdown =new Select(element);
	
	         List<WebElement>element1 = dropdown.getOptions();
	         
	          for(int i=0; i<element1.size();i++){
	        	  
	        	    String values= element1.get(i).getText();
	        	  
	        	System.out.println(" values in the list are" + values);  
	        	  
	        	  
	          }
	          
	         
	        String Actual = driver.getTitle();
	        
	        System.out.println("title of the page is"  +Actual);
	        
	        Assert.assertTrue("Page title is verified", driver.getTitle().equals("Selenium Easy Demo - Automate All Scenarios"));
	        
	        
	        
	      WebElement element2 =driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/h3"));
	        
	       element.getText();
	       
	       WebElement element3= driver.findElement(By.xpath("//a[contains(text(),'Demo Home')]"));
	       
	      String value1 = element3.getText();
	      
	      System.out.println(" text is "  +value1);
	      
	      
	      Assert.assertTrue("text of the page", element3.getText().equals("Demo Home"));
	      
	      
	       
	       
	       System.out.println("page contains text" +element.getText());
	        
	        //Assert.assertTrue("page contains text", element2.getText().equals(anObje));
	   
	       driver.close();
	        
	        
	        
	        
	          
	
	
	}

}
