

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PrintingtheDropDownValues {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.mortgagecalculator.org");
		Thread.sleep(3000);
		List<WebElement> list =	driver.findElements(By.xpath(".//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[6]/select[1]/option"));
        int length =list.size();
        System.out.println("The Size of the dropdown is"+length);
        for(int i=0;i<length;i++)
        {
        String values=	list.get(i).getText();
        System.out.println("The values in the dropdown are"+values);
        }
        driver.close();
        
		
	}

}
