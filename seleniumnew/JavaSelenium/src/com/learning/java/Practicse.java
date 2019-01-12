package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practicse {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com/");
		
		/*List<WebElement>list = driver.findElements(By.id("ctl00_mainContent_ddl_Adult"));
		
		                 int count = list.size();
		
		  for(int i=0; i<count; i++)
		  {
			 
			 String values= list.get(i).getText();
			 
			 System.out.println(values);
			  
		} */
		
		
		driver.findElement(By.id("ctl00_mainContent_txt_Todate")).click();
		
		driver.findElement(By.xpath(".//*[@id='Div1']/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody"));
		
		
		
		
		
		
		
		
		 
	}

}
