package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class GoogleHomePage {

	public GoogleHomePage() {
		// TODO Auto-generated constructor stub
	}
	
	public GoogleHomePage(WebDriver driver)
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),this);
	}
	
	@FindBy(name="q")
	public WebElement  txt;
	
	@FindBy(name="btnG")
	public WebElement searchButton;
	
	@FindBy(linkText="Selenium - Web Browser Automation")
	public WebElement linktext;
	
	
	public GoogleHomePage enterText()
	{
		try
		{
			txt.sendKeys("Selenium");
		}catch(Exception e)
		{
			
		}
		return new  GoogleHomePage();
	}
	
	public GoogleHomePage clickSearchButton()
	{
		try
		{
			searchButton.click();;
		}catch(Exception e)
		{
			
		}
		return new  GoogleHomePage();
	}
	
	public GoogleHomePage clicklinkSelenium()
	{
		try
		{
			linktext.click();
		}catch(Exception e)
		{
			
		}
		return new  GoogleHomePage();
	}
	
}
