package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Spicejetpractise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[1]/a[@value='IXA']")).click();

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

		driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[3]/li[1]/a[@value='HYD']")).click();
		//driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
		WebElement element = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		Point p1 = element.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		if(element.isSelected()){ 
			element.click();
		}
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='flightSearchContainer']/div[3]/button"));
		if(element1.isSelected()){
			
			element1.click();
		}
		Point p2 = element.getLocation();
		int x1 = p2.getX();
		int y1 = p2.getY();
		//driver.findElement(By.xpath(".//*[@id='flightSearchContainer']/div[3]/button")).click();

		//stem.out.println("element location is "+element.getLocation().getX()+":"+element.getLocation().getY());
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//Object obj = js.executeScript("window.scrollTo("+x+","+y+")");

		//WebElement newElement = (WebElement)obj;
		//newElement.click();
		// Thread.sleep(3000);
		System.out.println("after leep");
		//ement.click();

		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[2]/a")).click();

		// driver.findElement(By.xpath("//div[@id='flightSearchContainer']/div[3]/input[@id='ctl00_mainContent_txt_Fromdate']")).click();

		// Actions act = new Actions(driver);

		// act.moveToElement(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txt_Fromdate']"))).click().build().perform();

		// driver.findElement(By.xpath(".//*[@id='flightSearchContainer']/div[3]/button")).click();

		// driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[2]")).click();

		Thread.sleep(4000);

		driver.close();

	}

}
