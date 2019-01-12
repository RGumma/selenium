package com.practise.Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver",
		//		"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\DevCenter\\geckodriver\\geckodriver.exe");
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\old\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		//FirefoxDriver _driver = 
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		
		driver.get("http://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//WebElement element = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		
		   Actions act = new Actions(driver);
		   
		   WebElement element = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		   
		   Thread.sleep(3000);
		   
		   act.dragAndDropBy(element, 100, 100).build().perform();
		   act.clickAndHold(element).moveByOffset(100,100).release().build().perform();
		   Thread.sleep(10000);
		   
		   driver.close();
	}

}
