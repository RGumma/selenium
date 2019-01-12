package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

   

public class Contact {
	
	WebDriver driver;
	
	Actions act;
	@Given("^user is on the home page$")
     public void user_is_on_the_home_page() throws Throwable {
		
		driver.get("https://www.freecrm.com/index.html");
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys(" rajanichandra");
   	 driver.findElement(By.name("password")).sendKeys("Z123Y321");
   	driver.findElement(By.xpath("//input[@value='Login']")).click();
     }

     @When("^user mouse over on the contact page$")
     public void user_mouse_over_on_the_contact_page() throws Throwable {
    	 
    	act = new Actions(driver);
    	
    	act.moveToElement((driver.findElement(By.xpath("//a[@title='Contacts']")))).perform();
   
     }
     
     @Then("^user clicks on contact page$")
     public void user_clicks_on_contact_page() throws Throwable {
         
    	 act = new Actions(driver);
    	 
    	 act.moveToElement(driver.findElement(By.xpath(".//*[@id='navmenu']/ul/li[4]/ul/li[1]/a"))).click().build().perform();
         
     }
     
     

     @Then("^user enters firstname and lastname$")
     public void user_enters_firstname_and_lastname() throws Throwable {
    	 
    	 driver.findElement(By.id("first_name")).sendKeys("rajitha");
   		
   	    driver.findElement(By.id("surname")).sendKeys("Perala");
        
     }

     @Then("^user clicks on save button$")
     public void user_clicks_on_save_button() throws Throwable {
    	 
    	 driver.findElement(By.id(".//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")).click();
    	 
    	
    	 

     }
     
}
