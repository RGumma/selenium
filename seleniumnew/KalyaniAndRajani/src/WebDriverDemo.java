import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverDemo {

	
	
	public static void main(String[] args) {
		
		//command to open the browser
		WebDriver driver =new FirefoxDriver() ;
	    driver.get("http://www.facebook.com");
	    driver.findElement(By.id("email")).sendKeys(Keys.SHIFT,"vajinepelly.wgl");
	    driver.findElement(By.id("pass")).sendKeys("1234567");
	    driver.findElement(By.id("u_0_w")).click();
		driver.close();
		
		
	}

}
