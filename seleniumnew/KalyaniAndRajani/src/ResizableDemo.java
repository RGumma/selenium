import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ResizableDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver =new FirefoxDriver();
		driver.get("http://jqueryui.com");
		String tiltle =driver.getTitle();
		//Assert.assertEquals(tiltle, "Jqueryui");
		driver.findElement(By.linkText("Resizable")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Actions action =new Actions(driver);
		 WebElement element =driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		 Thread.sleep(3000);
		action.dragAndDropBy(element,150,150).build().perform();;
		
		Thread.sleep(3000);

	}

}
