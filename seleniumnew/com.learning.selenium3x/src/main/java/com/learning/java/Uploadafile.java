package com.learning.java;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.media.sound.Toolkit;

public class Uploadafile {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\DevCenter\\SeleniumWorkspace\\JavaSelenium\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
    
    driver.navigate().to("http://www.google.com");
    
    driver.navigate().forward();
    driver.navigate().back();
    driver.navigate().refresh(); 
   
    
    
      StringSelection sel = new StringSelection("C:\\Users\\RaviCKota\\Desktop.doc");
      
       
      
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
      
      driver.get("http://my.monsterindia.com/create_account.html");
      
      Thread.sleep(2000);
      
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("scroll(0, 350)");
      
      driver.findElement(By.id("wordresume")).click();
      
      
      Robot robot = new Robot();
      
      robot.keyPress(KeyEvent.VK_ENTER);
      
      
      
      
      
      
      
      
		
		

	}

}
