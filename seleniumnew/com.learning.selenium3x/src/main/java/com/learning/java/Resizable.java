package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/");
		
		driver.findElement(By.xpath("//a[@href='http://demoqa.com/resizable/']")).click();
		
		Actions act = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		
		act.dragAndDropBy(drag, 244, 150).perform();
		
		Thread.sleep(3000);
		
		driver.close();
				

	}

}
