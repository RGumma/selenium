package com.learning.appiummv;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Xpath12 {

	public static void main(String[] args) throws MalformedURLException {
		File f = new File("src/main/resources");
		File fs = new File(f,"ApiDemos.apk");
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RajaniEmulator");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub" ),cap);
        
    driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
   driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();
   
  
  driver.findElementById("android:id/checkbox").click();
 // driver.findElementByXPath("//android.widget.LinearLayout[@index='2']")).
  //driver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']")).click();
  driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click(); 
  
  driver.findElement(By.id("android:id/edit")).sendKeys("hello");
  driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
  
  //you can find the attributes using ui automator, id 
	
  // ("attribute(\"value\")")
  
  cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
  AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub" ),cap);
  
	
	
	}

}
