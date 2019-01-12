package com.learning.java;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
		Browserclass bc = new Browserclass();
		
		bc.setup("chrome");
		
		bc.selectTextBox("firstName","rajani");
		bc.selectTextBox( "lastName","kota");
		bc.selectTextBox("phone", "3098259364");
		bc.selectTextBox("userName", "rajinieee2006@yahoo.com");
		bc.selectTextBox("address1", "1805 houghton dr");
		bc.selectTextBox("city", "Mckinney");
		bc.selectTextBox("state","Texas");
		bc.selectTextBox("postalCode","75070");
		bc.selectDropDown("country", 214);
		bc.selectTextBox("email", "rajinieee2006@yahoo.com");
		bc.selectTextBox("password", "Krishna_12");
		bc.selectTextBox("confirmPassword", "Krishna_12");
		bc.selectButton("register");
		Thread.sleep(10000);
		bc.close();
	} 
	
}