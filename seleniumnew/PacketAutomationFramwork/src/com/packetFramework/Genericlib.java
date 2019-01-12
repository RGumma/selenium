package com.packetFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Genericlib {

	public static Property property ;
	public static WebDriver driver;
	
	public static void openurl(String url){
	
		
		driver.get(url);
	}
	
	public static void windowmaximize(){

		driver.manage().window().maximize();
	}
		
	
		
	public static void inputfield(String name, String locator){
		
		String value = property.getvalue(locator);
		
		driver.findElement(By.id("locator")).sendKeys("name");
		
	}
		

		
	
	
	public static void radiobutton(String locator){
		
		String value= property.getvalue(locator);
		
	 driver.findElement(By.id("locator")).click();
	}
	
	
	public static void dropdown(String locator, int number ){
		
		String value = property.getvalue(locator);
		
		WebElement element= driver.findElement(By.id(locator));
		
		Select dropdown= new Select(element);
		
		dropdown.selectByIndex(number);
		
		
	}
		
	}

