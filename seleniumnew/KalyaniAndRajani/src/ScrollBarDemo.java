import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ScrollBarDemo {
	
	WebDriver driver;
	@Test
	
	public void scroll_bar_demo() throws InterruptedException
	{
		
		driver =new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)");
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
	//	JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(5000);
		WebElement ele =driver.findElement(By.xpath(".//*[@id='blog-pager']/a"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		 Thread.sleep(5000);
		driver.quit();
	}
	

}
