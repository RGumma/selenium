package com.learning.appiummv;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Scrolling12 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		File f = new File("src/main/resources");
		File fs = new File(f,"ApiDemos.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RajaniEmulator");
			cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub" ),cap);
	      driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	      Thread.sleep(3000);
	        driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
	        Thread.sleep(3000);
	       TouchAction t = new TouchAction(driver);
	 t.press(driver.findElement(By.xpath("//*[@content-desc='12']"))).moveTo(driver.findElement(By.xpath("//*[@content-desc='6']"))).release().perform();
	        
	}
	        
	        
	        
	        
	        
	        
	        
	        
	        
	       
	        
	        
	        
	        
	        
	        
	        

}
