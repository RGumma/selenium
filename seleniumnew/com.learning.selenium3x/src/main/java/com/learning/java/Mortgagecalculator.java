package com.learning.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mortgagecalculator {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
         
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.mlcalc.com/");
		
		
		driver.findElement(By.name("ma")).clear();
		driver.findElement(By.name("ma")).sendKeys(new String []{"4000000"});
		driver.findElement(By.name("dp")).clear();
		driver.findElement(By.name("dp")).sendKeys(new String []{"50000"});
		driver.findElement(By.name("mt")).clear();
		driver.findElement(By.name("mt")).sendKeys(new String[] {"15"});
		driver.findElement(By.name("ir")).clear();
		driver.findElement(By.name("ir")).sendKeys(new String[] {"3.5"});
		driver.findElement(By.name("pt")).clear();
		driver.findElement(By.name("pt")).sendKeys(new String[] {"2000"});
		driver.findElement(By.name("pi")).clear();
		driver.findElement(By.name("pi")).sendKeys(new String[] {"1400"});
		driver.findElement(By.name("zipCode")).clear();
		driver.findElement(By.name("zipCode")).sendKeys(new String[] {"75070"});
		Select dropdown = new Select( driver.findElement(By.name("sm")));
	    dropdown.selectByIndex(4);
	    Select dropdown1 = new Select(driver.findElement(By.name("sy")));
	    dropdown1.selectByValue("2016");
	    driver.findElement(By.xpath("//*[@id='mortgageForm']/table/tbody/tr[2]/td[2]/table/tbody/tr[12]/td/input")).click();
	    Thread.sleep(3000);
		driver.close();
		
	
	
	}
	

}
