package com.learning.appiummv;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Activity {

	public static void main(String[] args) throws MalformedURLException {
		
		File f = new File("src/main/resources");
		File fs = new File(f,"ApiDemos.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RajaniEmulator"); // real device android device
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub" ),cap);
        
      System.out.println( driver.getContext());// will tell you in which app you are in
		
		System.out.println(driver.getOrientation());// 
		
		driver.currentActivity();
		driver.presskeycode(Androidkeycode.back)
		// presskeycode in appium 
		
		
		
		//package name and activity name
		
		
		
		
	}

}
