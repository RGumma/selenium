package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
		
             WebDriver driver = new ChromeDriver();
             
             driver.get("http://jqueryui.com");
             driver.findElement(By.id(".//*[@id='sidebar']/aside[2]/ul/li[4]/a"));
            WebElement element = driver.findElement(By.id("html/body/div[1]/fieldset[1]/label[1]/span[1]"));
               
               
              Boolean checkselenium= element.isSelected();
           
               if(checkselenium == false){
            	   
            	   element.click();
            	   
            	   System.out.println(" test has selected the selenium checkbox");
            	   
               } else {
            		   
            		   System.out.println("selenium check box was selected by default");
            		   
            	   }
            	   
            	   
               }
             
             
             
             
             
		
		

	}

}
