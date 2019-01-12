package testng;


 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable extends Sample {
	
	
	@Test
	
	public void draggable1() throws InterruptedException{
		
		System.out.println("Current page is ="+driver.getCurrentUrl());
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		action.dragAndDropBy(element, 150, 150).build().perform();
	
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		
		
	}
	
	
	

}
