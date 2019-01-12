package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UPandDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/");
		
	driver.findElement(By.xpath("//a[@href='http://jqueryui.com/controlgroup/']")).click();
	
	
	driver.switchTo().frame(0);
	
	int expected = 1;
	for(int j=1;j<=5;j++){
	
		driver.findElement(By.xpath("html/body/div[1]/fieldset[1]/div/span[2]/a[1]/span[1]")).click();
		String actual = driver.findElement(By.xpath(".//*[@id='horizontal-spinner']")).getText();
		//System.out.println(element.getTagName());
		//System.out.println(element.toString());
		//System.out.println(element.getText());
		//Assert.assertTrue((Integer.toString(expected)).equals(actual),"Invalid value");
		expected++;
	}
	
	
   Thread.sleep(3000);
    

	
	driver.close();
	
	

	}

}
