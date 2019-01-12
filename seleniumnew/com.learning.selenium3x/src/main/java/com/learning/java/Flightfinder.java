package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Flightfinder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("rajinieee2006@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Krishna_12");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		Select dropdown = new Select(driver.findElement(By.name("passCount")));
		 dropdown.selectByValue("2");
		 Select dropdown1 = new Select (driver.findElement(By.name("fromPort")));
		 dropdown1.selectByIndex(1);
		 Select dropdown2 = new Select(driver.findElement(By.name("fromMonth")));
			dropdown2.selectByValue("5");
			Select dropdown3 = new Select(driver.findElement(By.name("fromDay")));
			dropdown3.selectByIndex(4);
			Select dropdown4 = new Select(driver.findElement(By.name("toPort")));
			dropdown4.selectByValue("Frankfurt");
			Select dropdown5 = new Select(driver.findElement(By.name("toMonth")));
			dropdown5.selectByIndex(8);
			Select dropdown6 = new Select(driver.findElement(By.name("toDay")));
		       dropdown6.selectByValue("5");
		       
		       driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		       
		       Select dropdown7 = new Select(driver.findElement(By.name("airline")));
		       dropdown7.selectByIndex(1);
		       Thread.sleep(3000);
		       
		       driver.findElement(By.name("findFlights")).click();
		       
		       
		 driver.close();
		 
		
		
		
		//System.out.println(driver.getCurrentUrl());
		
		
		
		
		
	}

}
