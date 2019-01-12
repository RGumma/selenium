package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Linktext {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.tagName(""))
		
		//driver.findElement(By.name("firstname")).clear();
		
	//String value=driver.findElement(By.tagName("select")).getText();
		
	
	//System.out.println(value);
		
	//WebElement element=	driver.findElement(By.xpath(".//*[@id='post-body-2641311481947341581']/div[1]/select"));
	
	  // Point p=element.getLocation();
	    
	// int x=  p.getX();
	 
	 //System.out.println(x);
	   
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,6700)");
		
		//WebElement element=	driver.findElement(By.xpath(".//*[@id='post-body-2641311481947341581']/div[1]/select"));
		
	// Select dropdown = new Select(element);
	 
	//dropdown.selectByValue("USA");
	 
	// Thread.sleep(3000);
	 
	 driver.close();
	
	
	}

}
