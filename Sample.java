import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args){
		String actual="https://www.facebook.com/";
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("rajani");
		driver.findElement(By.id("pass")).sendKeys("rajitha");
		 String current=driver.getCurrentUrl();
		 System.out.println(driver.getCurrentUrl());
		
		if(actual.equals(current)){
			
			System.out.println("test case is passed");
			
		}else{
			System.out.println("test case is not passed");
			
		}
		
		driver.close();

}
}
