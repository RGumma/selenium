package com.learning.appiummv;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Touchactions {

	public static void main(String[] args) throws MalformedURLException {
		
		File f = new File("src/main/resources");
		File fs = new File(f,"ApiDemos.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RajaniEmulator");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub" ),cap);
		TouchAction t = new TouchAction(driver);
		//t.tap(driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"))).perform();
		
		//driver.findElement(By.id)
		
		//tap, press, release ,scroll,swipe, drag and drop
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
		t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(3000).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
