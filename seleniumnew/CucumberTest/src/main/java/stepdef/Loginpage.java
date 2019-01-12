package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginpage {
	
	WebDriver driver;
	
	

    @Given("^user is on the login page of FreeCRM$")
     public void user_is_on_the_login_page_of_FreeCRM() throws Throwable {
    	
    	System.setProperty("webdriver.chrome.driver",
  				"C:\\Users\\RaviCKota\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");

  		driver = new ChromeDriver();
    	 
    driver.get("https://www.freecrm.com/index.html");
         
     }

     @When("^user enters \"(.*)\" and \"(.*)\"$")
     public void user_enters_username_and_password(String username, String password) throws Throwable {
    	 
    	 driver.findElement(By.name("username")).sendKeys(username);
    	 driver.findElement(By.name("password")).sendKeys(password);
    	 
         
     }

     @Then("^user click on login button$")
     public void user_click_on_login_button() throws Throwable {
    	 
    	 driver.findElement(By.xpath("//input[@value='Login']")).click();
         
     }
     
     
		
}		

	


