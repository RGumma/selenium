package com.learning.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handle {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://accounts.google.com/signup");
		driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		while(it.hasNext()){
		
			String parentid =it.next();
			String childid= it.next();
			//driver.switchTo().window(parentid);
			//driver.switchTo().window(childid);
		}
		
		
		
		
		

	}

}
