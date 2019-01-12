package com.learning.java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.co.in/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		int count = links.size();
		
		System.out.println(count);

		for (int i = 0; i < count; i++) {

			WebElement element = links.get(i);
			
		String url = element.getAttribute("href");
		
		 verifyLinkActive(url);
		 
		}

	}

	
	public static void  verifyLinkActive(String linkUrl) throws IOException{
		
		
		
			URL url = new URL(linkUrl);
			
			HttpURLConnection httpconnect = (HttpURLConnection)url.openConnection();
			
			httpconnect.setConnectTimeout(3000);
			
			httpconnect.connect();
			
			if(httpconnect.getResponseCode()==200){
				
				{
				
					System.out.println(linkUrl + " " +  httpconnect.getResponseMessage());
			
				}
				
			if(httpconnect.getResponseCode()== httpconnect.HTTP_NOT_FOUND){
				
				System.out.println(linkUrl +  " "+ httpconnect.getResponseMessage() + " "+ httpconnect.HTTP_NOT_FOUND);
				
				
			}
				
				
			}
			
			
			
			
			
			
			
		
		
		
		
		
		}

	
	
	
	
	
	
	
}
