package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menuitem1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/menu/");

		driver.switchTo().frame(0);

		// WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu']/li[4]/ul/li[2]/div")));

		//List<WebElement> hidden = driver.findElements(By.xpath(".//*[@id='menu']/li[4]/ul/li/div"));

		//int count = hidden.size();

		//for (int i = 0; i < count; i++) {

			//int x = hidden.get(i).getLocation().getX();

			//System.out.println(x);
				
			
		//WebElement element =driver.findElement(By.xpath(".//*[@id='menu']/li[4]/div"));
		
		    //element.click();
		
		     //String value= element.getText();
		     
		     
		Actions act = new Actions(driver);
		  
		WebElement element=  driver.findElement(By.xpath(".//*[@id='menu']/li[4]/ul/li[2]/div"));
		   
		   act.moveToElement(element, 159, 89).perform();
		   
		  //WebDriverWait wait = new WebDriverWait(driver,10);
		   
		  // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu']/li[4]/ul/li[2]")));
		   
		   Thread.sleep(3000);
		   
		WebElement text=  driver.findElement(By.xpath(".//*[@id='menu']/li[4]/ul/li[2]"));
		
		    text.click();
		    
		    String value=text.getText();
		    
		    System.out.println(value);
		   
		  Thread.sleep(3000);
		  
        
		driver.close();

	}

}
