import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BingDemotoValidateWebElements {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	//	boolean status;
		driver.get("http://www.bing.com");
		driver.manage().window().maximize();
  boolean  status	=	driver.findElement(By.id("sb_form_q")).isEnabled();
		if(status==true)
		{
			driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
			driver.findElement(By.id("sb_form_go")).click();
			}
		else	{
			System.out.println("The Element is not Enabled");
		}
	
	//Thread.sleep(3000);
	driver.findElement(By.id("id_sc")).click();
	//Thread.sleep(2000);
	driver.findElement(By.linkText("Settings")).click();
	status =	driver.findElement(By.id("adlt_set_strict")).isSelected();
		if(status==true)
		{
			System.out.println("It is already Selected");
		}	
		else	{
			driver.findElement(By.id("adlt_set_strict")).click();
			driver.findElement(By.id("sv_btn")).click();
		}
     driver.close();
	}

}
