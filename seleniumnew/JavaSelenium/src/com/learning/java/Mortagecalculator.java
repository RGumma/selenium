package com.learning.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mortagecalculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("http://www.mortgagecalculator.org/");
        Thread.sleep(3000);
        
       
        
     /* WebElement element=   driver.findElement(By.xpath(".//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[4]/a/strong/font"));
         
         String value =element.getText();
         
         System.out.println(value);*/
        
       /* driver.switchTo().frame("br1");
        
       WebElement element= driver.findElement(By.xpath(".//*[@id='brTabbedRateTable']/div[1]/form[1]/div/div[3]/div[1]/ul/li[1]/input"));
        
          boolean status = element.isSelected();
            
            if(status == false){
            	
            	element.click();
            	
            	System.out.println("check box is not selected");
            	
            }else{
            		
            	System.out.println("check box is already selected");
            	
            }
            	
            		
            	 driver.switchTo().defaultContent(); 		
          
        
         WebElement ele=  driver.findElement(By.name("param[homevalue]"));
     
                     ele.clear();
                     ele.sendKeys(new String [] {"20000"});*/
                       
	
      /* List<WebElement> list= driver.findElements(By.tagName("a"));
	                 
       int count= list.size();
       
       System.out.println(count);*/
        
        
        driver.switchTo().frame("br1");
        driver.findElement(By.xpath(".//*[@id='BRmoreInfo']/a")).click();
        driver.getWindowHandles();
        
        
        
       
       
         driver.close(); 
       
       
	}  
         
}      
        
        
		/*List<WebElement> list= driver.findElements(By.xpath(".//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[6]/select[1]"));
		   int length =list.size();
		   System.out.println(" the drop down size is" + length);
		for(int i = 0; i< length ; i++){
			
			String values= list.get(i).getText();
			
			System.out.println(" the list of values are" + values);
	}
		
		
	driver.close();	
		
		
	}*/


