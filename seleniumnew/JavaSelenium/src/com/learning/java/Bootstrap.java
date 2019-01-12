package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bootstrap {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
       driver.findElement(By.xpath(".//*[@id='menu1']")).click();
       
     List<WebElement> list=  driver.findElements(By.xpath(".//*[@id='post-body-4615304122771162527']/div[1]/div/ul/li"));
       
       int count = list.size();
       
         System.out.println(count);
       
       driver.close();
       
       
       
       
       
       
       
       
       
       
       
		
		
		
	}

}
