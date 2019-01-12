package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin {
	
	WebDriver driver;
	
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page(){
	    
		System.setProperty("webdriver.chrome.driver",
  				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

  		driver = new ChromeDriver();
  		
  		driver.get("https://www.facebook.com/");
  		
		
	   }

	@When("^user enters user \"([^\"]*)\"$")
	public void user_enters_user(String user){
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(user);
} 	
     
      @When("^user enters pass \"([^\"]*)\"$")
      public void user_enters_pass(String pass){
	    driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(pass);
	    
	}

	@Then("^login should be successful$")
	public void login_should_be_successful(){
		
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		
	}
	
}
