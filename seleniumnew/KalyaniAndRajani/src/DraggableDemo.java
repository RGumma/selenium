import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DraggableDemo {

	
	
	WebDriver driver;
	
	
	
	@BeforeTest
	public void openBrowser()
	{
		
	    driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void  closeBrowser()
	{
		
		driver.quit();
	}
		
	@BeforeClass
	public void verify_the_title_page() throws IOException
	{
		FileInputStream fi =new FileInputStream("C:\\Users\\Lenovo\\workspace\\KalyaniAndRajani\\environment.properties");
		Properties prop=new Properties();
		prop.load(fi);
		driver.get(prop.getProperty("URL"));
		String title_page =driver.getTitle();
		Assert.assertEquals("jQuery UI",title_page);
	}
	
	@Test
	public void DraggableDemo() throws InterruptedException
	{
		
		driver.findElement(By.linkText("Draggable")).click();
		//Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		Actions action =new Actions(driver);
		 WebElement element =driver.findElement(By.id("draggable"));
		// Thread.sleep(3000);
		action.dragAndDropBy(element,150,150).build().perform();;
		//action.s
		//Thread.sleep(3000);
		driver.switchTo().defaultContent();
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Droppable")).click();

	}

}
