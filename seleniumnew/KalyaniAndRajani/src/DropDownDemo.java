import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.mortgagecalculator.org");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		Select select ;
		
		select =new Select(driver.findElement(By.name("param[start_month]")));
		//Thread.sleep(3000);
		select.selectByValue("4");
		//Thread.sleep(3000);
		select.selectByVisibleText("Jan");
		//Thread.sleep(3000);
		select.selectByIndex(8);
	//	Thread.sleep(3000);
		driver.close();
		
	
	}

}
