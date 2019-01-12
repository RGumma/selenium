import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DateDemo {
	
	static WebDriver driver;
	
		   public static void main(String args[])
		     {
		        int day, month, year;		        
		        GregorianCalendar date = new GregorianCalendar();

		        day = date.get(Calendar.DAY_OF_MONTH);
		        

		       String today_date =Integer.toString(day);
		      //String future_date =today_date+2;
		       System.out.println("The day is"+today_date);
		      
		       
		       
		        
		        WebElement dateWidget = driver.findElement(By.xpath("xpath of the table "));
		        List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));
		        List<WebElement> columns=dateWidget.findElements(By.tagName("td"));
		        
		        for (WebElement cell: columns){
		         //Select 13th Date 
		         if (cell.getText().equals(today_date)){
		         cell.findElement(By.linkText(today_date)).click();
		         break;
		         }
		        }
		       
		        driver.switchTo().defaultContent();
		        
		        
		      //  Question mark webdrive code for To field
		        
		        WebElement dateWidget1 = driver.findElement(By.xpath("xpath of the table "));
				        List<WebElement> rows1=dateWidget.findElements(By.tagName("tr"));
				        List<WebElement> columns1=dateWidget.findElements(By.tagName("td"));
				        
				        for (WebElement cell: columns1){
				         //Select 13th Date 
				         if (cell.getText().equals(today_date)){
				         cell.findElement(By.linkText(today_date)).click();
				         break;
				         }
				        }
				       
              driver.switchTo().defaultContent();
		       
		       
		       
		     }
		  

}
