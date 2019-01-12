package com.learning.appiummv;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		File f = new File("src/main/resources");
		File fs = new File(f,"ApiDemos.apk");
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RajaniEmulator");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub" ),cap);
        //xpath, id ,classname , androiduiautomator
        
        //class name can be a tagname
       
 driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
Thread.sleep(3000);
 driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
driver.findElementById("android:id/checkbox").click();

driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click(); //duplicates
//Thread.sleep(300);
driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
driver.findElementsByClassName("android.widget.Button").get(1).click(); //duplicates

    //androiduiautomator("attribute("value")");

//androiduiautomator("text(\"Views\")");

//driver.findElementsByandroiduiautomator("new UiSelector().clickable(true)").size();   

//for Tap

//Use Touch Actions


TouchActions t = new TouchActions(driver);

// t.press(el).waitAction(3000).release().perform();

//scroll, swipe and drag and drop













        
        

	}

}
