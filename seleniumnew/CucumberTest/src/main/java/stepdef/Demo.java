package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {
	
	WebDriver driver;
 @Given("^user is on the Registration form$")
		public void user_is_on_the_Registration_form() throws Throwable {
		    
			System.setProperty("webdriver.chrome.driver",
	  				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
	  		
	  		driver.get("http://way2automation.com/way2auto_jquery/index.php");
	    	}

 @When("^user enters name \"([^\"]*)\"$")
 public void user_enters_name(String name) throws Throwable {
	 driver.findElement(By.xpath("//input[@type='text'][@name='name']")).sendKeys(name);
	 
	 
 }
 @When("^user enters phone \"([^\"]*)\"$")
 public void user_enters_phone(String phone) throws Throwable {
	 
	 driver.findElement(By.xpath("//input[@type='tel'][@name='phone']")).sendKeys(phone);
     
     
     }
 
 @When("^user enters email \"([^\"]*)\"$")
 public void user_enters_email(String email) throws Throwable {
	 driver.findElement(By.xpath("//input[@type='email'][@name='email']")).sendKeys(email);  
	 
     
 }

 @When("^user enters country \"([^\"]*)\"$")
 public void user_enters_country(String country) throws Throwable {
	 
	 Select se = new Select (driver.findElement(By.name("country")));
		se.selectByValue(country);
     
     
 }
			
 @When("^user enters city \"([^\"]*)\"$")
 public void user_enters_city(String city) throws Throwable {
     
	 driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[5]/input")).sendKeys(city);
    
 }	
 
 @When("^user enters username \"([^\"]*)\"$")
 public void user_enters_username(String username) throws Throwable {
     
	 driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[6]/input")).sendKeys(username);
	 
     
 }
		
 @When("^user enters password \"([^\"]*)\"$")
 public void user_enters_password(String password) throws Throwable {
	 
	 driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[7]/input")).sendKeys(password);
     
    
 }
			
 @Then("^user clicks on the submit button$")
 public void user_clicks_on_the_submit_button() throws Throwable {
     
	 List<WebElement>list=driver.findElements(By.xpath("//input[@class='button'][@value='Submit']"));
	   list.get(1).click();
		
  }
}
