package com.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxandRadiobutton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RaviCKota\\Downloads\\chromedriver_win32_New\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/checkboxradio/");
		driver.findElement(By.xpath("//a[contains(text(),'Checkboxradio')]"));

		driver.switchTo().frame(0);

		WebElement element = driver.findElement(By.xpath("html/body/div[1]/fieldset[1]/label[2]/span[1]"));

		Boolean checkbox = element.isSelected();

		if (checkbox == false) {

			element.click();

			Thread.sleep(3000);

		} else {

			System.out.println("checkbox is already selected");

		}

		driver.close();

	}

}