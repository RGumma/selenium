package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		
		Select drop = new Select(driver.findElement(By.name("cars")));
		
		Assert.assertTrue(drop.isMultiple());
		
        Assert.assertEquals(4, drop.getOptions().size());
        
        drop.selectByVisibleText("Volvo");
        
        drop.selectByVisibleText("Saab");
        
        drop.selectByVisibleText("Opel");
        
        drop.deselectByVisibleText("Audi");
      
        drop.deselectByVisibleText("Audi");
        
        Thread.sleep(3000);
        
        driver.quit();
        
	}

}
