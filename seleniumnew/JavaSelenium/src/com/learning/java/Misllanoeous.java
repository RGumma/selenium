package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Misllanoeous {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/");
		//WebElement element= driver.findElement(By.linkText("Draggable"));
		//element.click();
		/*driver.switchTo().frame(".//*[@id='content']/iframe");
		
		WebElement ele= driver.findElement(By.id("draggable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(ele, 150, 150);
		
		driver.switchTo().defaultContent();*/
		
		driver.findElement(By.linkText("Datepicker")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath())
	
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody"));
		List<WebElement>rows=driver.findElements(By.tagName("tr"));
		     
		 
		
		 for(int i=0; i< rows.size();i++){
			 
			 
			List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
			   
			 
			for(int j=0; j<column.size();j++){
			
			         
			 String values = column.get(j).getText();
			 
			 driver.switchTo().defaultContent();
			 
			 System.out.println(values);
			 
			 
			
		 }
		
		
		 }	
		
		
		driver.close();
		
	}
	
	
}
		
		
		
		
		

