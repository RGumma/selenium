package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Webtable {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\DevCenter\\SeleniumWorkspace\\JavaSelenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.jqueryui.com");
		
		driver.getTitle();

		driver.findElement(By.linkText("Datepicker")).click();
		
		WebElement element1 = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(element1);

		driver.findElement(By.xpath(".//*[@id='datepicker']")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		List<WebElement> element = driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td"));

		int count = element.size();

		for (int i = 0; i < count; i++) {

			String data = element.get(i).getText();

			if("2".equals(data)){
			
				element.get(i).click();
				break;
			}
		}
		
		
		WebElement element2 = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(element2);
		
		WebElement element3= driver.findElement(By.id(".//*[@id='datepicker']"));
		
		           element3.click();
		           
		          String  value= element3.getText();
		           
		        Assert.assertEquals("04/02/2017", value);
		        
		        driver.switchTo().defaultContent();
		
		
		
		

		//driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
		//WebElement element2 = driver.findElement(By.xpath(".//*[@id='datepicker']"));
		
		//String value = element2.getText();
		//Assert.assertEquals("04/02/2017",value);
		//driver.switchTo().defaultContent();
		
		
		
		
	}

}
