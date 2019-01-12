	package com.learning.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Windowhandle {

	private static String DISCLAIMER = "http://www.bankrate.com/funnel/disclaimer";
	public static void main(String[] args) {
   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.mortgagecalculator.org/");
		
		driver.switchTo().frame("br1");
		
	    WebElement element=	driver.findElement(By.xpath(".//*[@id='BRmoreInfo']/a"));
		String parentid= driver.getWindowHandle();
		
		System.out.println(parentid);
		 element.click();
		Set<String>id= driver.getWindowHandles();
		
		Iterator it  =id.iterator();
		while(it.hasNext()){
			
			String childid = it.next().toString();
			if(!childid.contains(parentid)){
			
				System.out.println(childid);
				driver.switchTo().window(childid);
				
				//Assert.assertTrue(DISCLAIMER.equals(driver.getCurrentUrl()));
				//Assert.assertEquals(DISCLAIMER, driver.getCurrentUrl());
				
				Assert.assertTrue(condition, message);
				
				Assert.assertEquals(driver.getCurrentUrl(),DISCLAIMER);
				System.out.println(driver.getCurrentUrl());
				break;
			}
		}
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getCurrentUrl());
		System.out.println("switched to parent");
		//driver.switchTo().defaultContent();
		//driver.close();
}

}
