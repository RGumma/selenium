package com.learning.appiummv;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		File f = new File("src/main/resources");
		File fs = new File(f,"ApiDemos.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RajaniEmulator");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub" ),cap);
		driver.findElementByXPath("//android.widget.TextView[@text= 'Views']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByXPath("//android.widget.TextView[@index='1']").click();
		//special characters are not allowed in tagname // so cant go with xpath i.e classname
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		TouchAction act = new TouchAction(driver);
		
		act.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(3000).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
		
		// Appium is not supporting scroll method
		
		// swipe also there is no direct method
		
		//driver.findElementbyuiAutomator("new UIscrollable(new selector()).scrollIntoView(text(\"webview")")
        
		// for drag and drop 
		
		//t.longpress(ele).move(ele).release.perform
		
		driver.currentactivity- apidemos
		
		getContext();- views
		
		
		views //native- entirely an app with mobile gestures
		
		
		hybrid - mobile and web app
		
		
		driver.getorientation()- landscape or potrate
		
		driver.islocked()- false
		
		
		driver.hidekeybord();
		
		
		
		webview 
		
	}

}
