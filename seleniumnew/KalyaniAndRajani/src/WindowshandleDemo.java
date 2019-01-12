import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowshandleDemo {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.bing.com");
		String main_window =driver.getWindowHandle();
		System.out.println("The main winow name is"+main_window);		
		driver.findElement(By.linkText("MSN")).click();
		Thread.sleep(5000);
		Set<String> child_windows =driver.getWindowHandles();
		System.out.println("The child_windows are"+child_windows.size());
		Iterator<String> it =child_windows.iterator();
		int i=1;
		
	
		while(it.hasNext())
		{
			Thread.sleep(5000);
			driver.switchTo().window(it.next());
			if(i==2)
			{
			driver.findElement(By.xpath(".//*[@id='q']")).sendKeys("Selenium");
			}

			i++;
			
		}
        Thread.sleep(3000);
        driver.switchTo().window(main_window);
        driver.findElement(By.xpath(".//*[@id='sb_form_q']")).sendKeys("Selenium");
        Thread.sleep(3000);
        driver.quit();
	}

}
