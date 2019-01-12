package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drop_down_with_Multipleselection {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
	     driver.get("https://semantic-ui.com/modules/dropdown.html");
	     
	     driver.findElement(By.className("ui fluid search dropdown selection multiple")).click();
	     
	     
	     driver.close();
		
		
		
		
	}

}
