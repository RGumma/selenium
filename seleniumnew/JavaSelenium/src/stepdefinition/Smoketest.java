package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoketest {
	
	WebDriver driver;
	
	@Given("^Open firefox and start application$")
	
	public void open_firefox_and_start_application(){
	
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("http://www.facebook.com");
	}
	
	
		
 @When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	
 public void I_enter_valid_username_and_valid_password(String uname, String pass){
	 
	 driver.findElement(By.id("email")).sendKeys("uname");
	 
	 driver.findElement(By.id("pass")).sendKeys("pass");
	 
}

	
@Then("^user should be login successfully$")

public void user_should_be_login_successfully(){
	
	driver.findElement(By.id("u_0_n")).click();
	
}
	
}
