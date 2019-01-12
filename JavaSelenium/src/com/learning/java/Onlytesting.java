package com.learning.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Onlytesting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/");
		
		driver.manage().window().maximize();
		
		/*driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath(".//*[@id='post-body-3107268830657760720']/div[1]/table/tbody/tr[1]/td[1]/input")).click();
		driver.findElement(By.xpath(".//*[@id='post-body-3107268830657760720']/div[1]/table/tbody/tr[2]/td[2]/input")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath(".//*[@id='check2']")).click();
		driver.switchTo().defaultContent();
		//Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id='post-body-3107268830657760720']/div[1]/table/tbody/tr[1]/td[1]/input")).click();*/
		driver.findElement(By.linkText("Drag and Drop")).click();
		
		Thread.sleep(3000);
		
		
		
		WebElement source1=driver.findElement(By.xpath(".//*[@id='dragdiv']"));
		WebElement target1=driver.findElement(By.xpath(".//*[@id='dropdiv']"));
		
		Actions action = new Actions(driver);
		
		
	action.dragAndDrop(source1, target1).build().perform();
	
	
		
		
		
	//driver.switchTo().alert();
		
		//driver.findElement(By.xpath(".//*[@id='post-body-2641311481947341581']/div[1]/input")).
		
		
		Thread.sleep(4000);
		
		driver.close();
		
		
		
	}

}
