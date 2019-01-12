package com.learning.appiummv;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Raagaapp {

	public static void main(String[] args) throws MalformedURLException {
		
		File f = new File("src/main/resources");
		File fs = new File(f,"net.amp.raaga_2018-07-31.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RajaniEmulator");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub" ),cap);
		
        driver.findElement(By.xpath("//android.widget.Button[@text='DENY']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='NO THANKS']")).click();
        driver.findElements(By.xpath("//android.widget.ImageButton")).get(0).click();
        
        
        
        
        
        
        
        
		
		
	}

}
