package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com");
		
		//Thread.sleep(3000);
		
		//WebElement element =driver.findElement(By.xpath(".//*[@id='package-rooms']"));
		
		//Select dropdown= new Select(element);
		
		//dropdown.selectByValue("2");
		
		
		List <WebElement> count = driver.findElements(By.xpath(".//*[@id='package-1-adults']"));
		System.out.println(count.size());
		    //String number= count.get(0).getText();
		    //count.get(index)
		       
		    
		    
		//System.out.println("size of array is " + number);
		    
		    
		       
		      // for(int i=0; i< number; i++)
		      // {
		    	   
		    //	  String values= driver.findElements(By.xpath(".//*[@id='package-1-adults']")).get(3).getText();
		       
		       
		       
		   //System.out.println("values are" + values );
		
		      // }
				
	}
		



}
