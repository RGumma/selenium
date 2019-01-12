package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.naukri.com/");
		
		Thread.sleep(6000);
		
		//int count=driver.findElements(By.xpath(".//*[@id='exp_dd']/div[2]/div[1]/div[1]/div[1]/ul")).size();
		
		//int count=driver.findElements(By.xpath(".//*[@id='exp_dd']/div[1]")).size();
		
		//System.out.println(driver.findElements(By.xpath(".//*[@id='exp_dd']/div[2]/div[1]/div[1]/div[1]/ul/li")).get(0).getTagName());
		//System.out.println(count);
		
		driver.findElement(By.xpath(".//*[@id='skill']/div[1]/div[2]/input")).sendKeys("testing");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='location']/div[1]/div[2]/input")).sendKeys("dallas");
		
		//".//*[@id='skill']/div[1]/div[2]/input";
		  //Strin".//*[@id='location']/div[1]/div[2]/input";
		
		driver.findElement(By.xpath(".//*[@id='exp_dd']/div[1]")).click();
		
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath(" .//*[@id='a2']")).click();
		
		//Actions action = new Actions(driver);
		//action.moveToElement("http://www.naukri.com/tesing-jobs")
		
		

		
		driver.close();
		
	}

}
