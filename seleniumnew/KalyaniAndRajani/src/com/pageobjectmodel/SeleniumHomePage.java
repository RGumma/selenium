package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SeleniumHomePage {
	
	public SeleniumHomePage() {
		// TODO Auto-generated constructor stub
	}
	
	public SeleniumHomePage(WebDriver driver)
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),this);
	}
	
	@FindBy(xpath=".//*[@id='menu_projects']/a")
	public WebElement selectDownload;
	
	@FindBy(linkText="Documentation")
	public WebElement selectDocument;
	
	public SeleniumHomePage click_project()
	{
		SeleniumHomePage home =new SeleniumHomePage();
		try{
			selectDownload.click();
		}catch(Exception e){
		}
		return home;
		
	}
	
	public SeleniumHomePage click_document()
	{
		SeleniumHomePage home =new SeleniumHomePage();
		try{
			selectDocument.click();
		}catch(Exception e){
		}
		return home;
		
	}
	
	
	

}
