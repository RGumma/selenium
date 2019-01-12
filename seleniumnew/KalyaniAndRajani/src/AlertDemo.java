import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		Alert alert;
		driver.get("http://only-testing-blog.blogspot.in/");
		
		driver
		
		driver.findElement(By.xpath(".//*[@id='Blog1']/div[1]/div[7]/div/div/div/h3/a")).click();
		//Thread.sleep(3000);
		WebDriverWait wait =new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		 alert=driver.switchTo().alert();

		alert.accept();

		driver.findElement(By.name("fname")).sendKeys("Arun");
		driver.findElement(By.name("lname")).sendKeys("Kumar");
		//Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='submitButton']")).click();
		//Thread.sleep(3000);
		 alert=driver.switchTo().alert();
		alert.accept();
		//Thread.sleep(3000);
		driver.quit();

		
	}

}
