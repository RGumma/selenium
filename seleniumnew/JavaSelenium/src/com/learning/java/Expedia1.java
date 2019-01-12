lm;,'./'package com.learning.java;

import org.openqa.selenium.By;import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;import org.openqa.selenium.support.ui.ExpectedConditions;import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expedia1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		WebDriverWait wd = new WebDriverWait(driver,5);
		driver.get("http://www.expedia.com");
		
		driver.findElement(By.xpath(".//*[@id='package-origin']")).sendKeys("df");
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='typeahead-list']/div")));
		driver.findElement(By.xpath(".//*[@id='aria-option-0']/div")).click();
		driver.findElement(By.xpath(".//*[@id='package-destination']")).sendKeys("chi");
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='typeahead-list']/div/div/ul")));
		driver.findElement(By.xpath(".//*[@id='aria-option-4']/div")).click();
		driver.findElement(By.xpath(".//*[@id='package-departing']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='package-departing-wrapper']/div/div/div[2]/table/tbody/tr[4]/td[4]/button")).click();
		driver.findElement(By.xpath(".//*[@id='package-returning']")).click();
		driver.findElement(By.xpath(".//*[@id='package-returning-wrapper']/div/div/div[3]/table/tbody/tr[1]/td[6]/button")).click();
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='package-rooms']"));
		
		Select dropdown = new Select(element);
		
		dropdown.selectByIndex(0);
		
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='package-1-adults']"));
		
		Select dropdown1 = new Select(element1);
		
		dropdown1.selectByIndex(1);
		
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='package-1-children']"));
		
		Select dropdown2 = new Select(element2);
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath(".//*[@id='search-button']")).click();
		
		driver.findElement(By.xpath(".//*[@id='hotel-destination']")).click();
		
		boolean Boolean = driver.findElement(By.xpath("//*[@id='local-favourites-module']/section[1]/div/article[1]/a/section/figure/img.")).isDisplayed();
		
		if(Boolean==true){
			
			System.out.println("image is displased");
		}else{
			
			System.out.println("image is not displased");
		}
		
		driver.close();
		
	
	}

}
