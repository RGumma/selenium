import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		Thread.sleep(6000);
	    WebElement electronics =driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[1]"));
		//WebElement electronics =driver.findElement(By.className("Wbt_B2"));
	    //String value =electronics.getText();
	   // System.out.println("The text of the tab i"+value);
		Actions action =new Actions(driver);
		action.moveToElement(electronics).build().perform();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Samsung")).click();
		Thread.sleep(6000);
		WebElement ele =driver.findElement(By.xpath(".//*[@id='price_range']/li[1]/a/input[@class='facetoption']"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	       Thread.sleep(500);
		
		driver.findElement(By.xpath(".//*[@id='price_range']/li[1]/a/input")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath(".//*[@id='price_range']/li[1]/a/input")).click();
		Thread.sleep(6000);
		driver.close();
		

	}

}
