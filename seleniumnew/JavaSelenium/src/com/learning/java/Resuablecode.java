package com.learning.java;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Resuablecode {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	static{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void window_maximize() {

		driver.manage().window().maximize();
	}

	public static void openingurl(String url) {
		
		driver.get(url);
	}

	public static void click(String locator, String locatorname) {
		
		try {
		
			driver.findElement(By.xpath(prop.getProperty(locator))).click();
		} catch (NoSuchElementException e){
			
		}	
	}

	public static void sendText(String locator, String data, String locatorname) throws Throwable {

		try {
			
			driver.findElement(By.xpath(prop.getProperty(locator))).clear();
			driver.findElement(By.xpath(prop.getProperty(locator))).sendKeys(data);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void mouseover(String locator) {

		try {

			WebElement mo = driver.findElement(By.xpath(prop.getProperty(locator)));
			new Actions(driver).moveToElement(mo).build().perform();
		} catch (NoSuchElementException e) {
			
			e.printStackTrace();
		}
	}

	public static void tocheckthecheckbox(String locator) {

		try {

			if (driver.findElement(By.xpath(prop.getProperty(locator))).isSelected()) {
				
				System.out.println(locator+" is selected");
			}else{
				
				System.out.println(locator+" is not selected");
			}
		} catch (NoSuchElementException e) {

			e.printStackTrace();
		}
	}

	public static void alert(String locator) {

		try {

			driver.findElement(By.xpath(prop.getProperty(locator))).click();
			driver.switchTo().alert().accept();
		} catch (NoSuchElementException e) {
			
			e.printStackTrace();
		} catch (Exception e){
			
			e.printStackTrace();
		}
	}

	public static void switchtoframebyindex(int index) {

		try {

			driver.switchTo().frame(index);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void switchtoframebyname(String idvalue) {

		try {

			driver.switchTo().frame(idvalue);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void draganddrop(String source, String target) {

		try {

			WebElement from = driver.findElement(By.xpath(prop.getProperty(source)));
			WebElement to = driver.findElement(By.xpath(prop.getProperty(target)));
			new Actions(driver).dragAndDrop(from, to).build().perform();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
    public static void draggable(String source, int x, int y){
    	
    	try{
    		
    		WebElement drag = driver.findElement(By.xpath(prop.getProperty(source)));
    		 new Actions (driver).dragAndDropBy(drag, x, y).build().perform();
    	
    	}catch(Exception e){

    		e.printStackTrace();
    	}
    }
    	
    public static void veifytitlpage(String actual, String expected){
    	
    	Assert.assertEquals(actual, expected);
    	
    	//if(driver.getTitle().equals(title)){
    		
    		//System.out.println("title is verified" + title);
    	//}else{
    		
    		//System.out.println("title is not verified" +title);
    }
}