package com.learning.appiummv;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Andrioduiautomatorviewer {

	public static void main(String[] args) throws MalformedURLException {
		
		File f = new File("src/main/resources");
		File fs = new File(f,"ApiDemos.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RajaniEmulator");
	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub" ),cap);
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
			//with android ui automator you can validate checkable and clickable,checkable all are properties
	
	//the synatax for uiautomator viewer is ("attribute("value")")
	
	//validate clickable features for all properties.
	
	//driver.findelementsbyandroiduiautomator("new uiselector().property(value)");
	
	driver.findElementbyandroiduiautomator("new uiselector().clickable(true)"));
	
	// tap 
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
