package testng;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker1 extends Sample {
	
	


	
	
	@Test
	
	   public void resizable() throws InterruptedException{
		driver.manage().window().maximize();
	  driver.findElement(By.linkText("Resizable")).click();
	  Thread.sleep(3000);
	  //driver.switchTo().frame(0);
	  
	  WebElement frame=driver.findElement(By.xpath(".//*[@id='content']/iframe"));
	  driver.switchTo().frame(frame);
	  Actions action =new Actions(driver);
	   WebElement element =driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
	   Thread.sleep(3000);
	  action.dragAndDropBy(element,150,150).build().perform();;
	  Thread.sleep(3000);
	  driver.switchTo().defaultContent();
	}
	

}
