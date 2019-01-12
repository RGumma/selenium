package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataproviderFactory;

public class Homepage {

	WebDriver driver;

	@FindBy(xpath = ".//*[@id='Email']")
	WebElement username;

	@FindBy(xpath = ".//*[@id='next']")
	WebElement next;

	@FindBy(xpath = " .//*[@id='Passwd']")
	WebElement password;

	@FindBy(xpath = ".//*[@id='signIn']")
	WebElement signin;

	public void sendkeysusername(String name) {

		username.sendKeys(DataproviderFactory.getExcel().getdata(0, 0, 0));

	}

	public void clickonnext() {

		next.click();

	}

	public void sendkeyspassword(String pass) {

		password.sendKeys(DataproviderFactory.getExcel().getdata(0, 0, 1));

	}

	public void clickonsignin() {

		signin.click();

	}

	public String gettitle() {

		return driver.getTitle();

	}

}
