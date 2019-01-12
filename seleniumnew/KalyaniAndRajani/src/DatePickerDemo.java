import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://jqueryui.com");
		driver.findElement(By.linkText("Datepicker")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//driver.findElement(By.linkText("12")).click();
		WebElement element =driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody"));
		List<WebElement> rows=  element.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> coloumns =rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<coloumns.size();j++)
			{
			String table_values=	coloumns.get(j).getText();
			System.out.println("The values are "+table_values);
			}
		}
		//Thread.sleep(5000);
		driver.close();

	}

}
