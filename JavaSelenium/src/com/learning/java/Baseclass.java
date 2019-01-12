package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

 public WebDriver driver = null;
	

 public WebElement Webelement = null;

	public void Browsersetup(String browser){
	
	 if(browser.equals("firefox")){
		 
		  driver = new FirefoxDriver();
		  
	 } else if (browser.equals("chrome")){
			  
			  System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
			  driver= new ChromeDriver();
			  }
	}

public void Openurl(String url){
	
	driver.get(url);
	
}

public void maximizebrowser(){
	
	driver.manage().window().maximize();

}

public void Inputbox(String locator, CharSequence[] value){
	
	WebElement element = driver.findElement(By.name(locator)); 
	element.clear();
	element.sendKeys(value);

}

public void checkbox(String locator, int number){
	
	Webelement= driver.findElement(By.name(locator));
	Select dropdown = new Select(Webelement);
     dropdown.selectByIndex(number);

} 
     public void close(){
       
    	 driver.close();
     
  
     }
    

}

















