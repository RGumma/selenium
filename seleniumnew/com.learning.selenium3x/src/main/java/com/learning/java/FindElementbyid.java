package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementbyid {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		
		//driver.findElement(By.name("username")).sendKeys("Rajani");
		
		
	driver.findElement(By.xpath("//*[@id='load_form']/fieldset[1]/input[@name='name']")).sendKeys("Rajani");
	
	driver.findElement(By.xpath("//*[@id='load_form']/fieldset[2]/input[@name='phone']")).sendKeys("9290168267");
	
	driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[3]/input[@name='email']")).sendKeys("rajani.gummadidala@gmail.com");
	
	Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[4]/select[@name='country']")));
	
	dropdown.selectByIndex(1);
	
	driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[5]/input[@name='city']")).sendKeys("Hyder");
	
      driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[6]/input[@name='username']")).sendKeys("rajani"); 
      
      driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[7]/input[@name='password']")).sendKeys("krishna");
      
      driver.findElement(By.xpath(".//*[@id='load_form' and @class='ajaxsubmit']/div/div[2]/input[@value='Submit']")).click();
      Thread.sleep(3000);
	driver.close();
		
		
		
}
}