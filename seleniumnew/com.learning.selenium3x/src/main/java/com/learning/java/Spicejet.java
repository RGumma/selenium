package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	//public  static boolean Boolean;

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		
		//Boolean = driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected();
		
		//if(Boolean==true){
			
			//System.out.println("already selected");
			
		//}else{
				
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		
		//}
		
		
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT'] ")).click();
		
		driver.findElement(By.xpath(" //a[@value='GOI']")).click();
		
		Thread.sleep(3000);
		
	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
			 
		
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']/div[1]/table/tbody/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[2]/li[1]/a")).click();
		
	
           driver.findElement(By.xpath(" .//*[@id='ctl00_mainContent_txt_Fromdate'] ")).click();
           
        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[1]/a")).click();
		
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txt_Fromdate']")).click();
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txt_Fromdate']")).click();
        
        
        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txt_Todate']")).click();
        
        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[2]/td[3]/a")).click();
        
       int count = driver.findElements(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']/option")).size();
		
	    for(int i=0;i<count;i++){
	    	
	    	
	    	String text = driver.findElements(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']/option")).get(i).getText();
	    	
	  // if(text.equals("4 Adults")){
		   
		   
		 //  driver.findElements(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']/option")).get(i).click();
		   
		
	 // } else{
	    	
	    	//System.out.println("element not found");
	   
	    }
	    
	  // driver.close();
		
		
	}
	
}

		



