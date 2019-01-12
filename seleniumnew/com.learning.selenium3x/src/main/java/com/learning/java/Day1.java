package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day1 {

	public static void main(String[] args) {
		
		try{
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			WebDriverWait wd = new WebDriverWait(driver,5);
			driver.get("http://www.expedia.com");
			
			driver.findElement(By.xpath(".//*[@id='package-origin']")).sendKeys("df");
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='typeahead-list']/div")));
			driver.findElement(By.xpath(".//*[@id='aria-option-0']/div")).click();
			driver.findElement(By.xpath(".//*[@id='package-destination']")).sendKeys("chi");
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='typeahead-list']/div")));
			driver.findElement(By.xpath(".//*[@id='aria-option-5']/div")).click();
			driver.findElement(By.xpath(".//*[@id='package-departing']")).click();
			driver.findElement(By.xpath(".//*[@id='package-departing-wrapper']/div/div/div[2]/table/tbody/tr[4]/td[4]/button")).click();
			driver.findElement(By.xpath(".//*[@id='package-returning']")).click();
			driver.findElement(By.xpath(".//*[@id='package-returning-wrapper']/div/div/div[3]/table/tbody/tr[2]/td[4]/button")).click();
			driver.findElement(By.xpath(".//*[@id='search-button']")).click();
			System.out.println(driver.getCurrentUrl());
		}catch(Exception e){
			e.printStackTrace();

		}finally{
			
			System.exit(0);
		}
		
		//WebElement element =driver.findElement(By.xpath(".//*[@id='package-origin']"));
		//element.click();
		//driver.findElement(By.xpath(".//*[@id='package-origin']")).sendKeys("df");
		//element.sendKeys("df");
		
			
		
		//element.click();
		//element.sendKeys("chi");
		
		
		
		 /* WebDriverWait wd1 = new WebDriverWait(driver,5);
		  
		  driver.findElement(By.xpath(".//*[@id='package-destination']")).sendKeys("chi");
		  
		  wd1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='typeahead-list']/div")));
		  
		  driver.findElement(By.xpath(".//*[@id='aria-option-5']/div")).click();
		  
		 
		  
		  //driver.findElement(By.xpath(".//*[@id='package-departing']")).click();
		  
		 // driver.findElement(By.xpath(".//*[@id='package-departing-wrapper']/div/div/div[2]/table/tbody"));
		  
		 /*List<WebElement>rows= driver.findElements(By.tagName("tr"));
		 
		  int count = rows.size();
		  
		  for(int i =0; i<count; i++)
		  {
			  List <WebElement> coloumn= rows.get(i).findElements(By.tagName("td"));
			  
			  int count1 = coloumn.size();
			  
			  for(int j=0; j<count1;j++)
			  {
				  
				 String values = coloumn.get(j).getText();
				 
				 
				 System.out.println("values are " + values);
				  
			  }
		  
		 } 
		  
		  
		  WebElement element1=driver.findElement(By.id("package-rooms")); 
		  Select dropdown = new Select(element1);
		  dropdown.selectByValue("1");
		  driver.findElement(By.xpath(".//*[@id='package-departing-wrapper']/div/div/div[2]/table/tbody/tr[4]/td[4]/button")).click();*/
	}
}
