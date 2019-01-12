package factory;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataprovider.ConfigDataProvider;

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver getbrowser(String browser) {

		if (browser.equals("chrome")){ 

		ConfigDataProvider cf = new ConfigDataProvider();
			System.setProperty("webdriver.chrome.driver", DataproviderFactory.getcongig().getchromepath());
			
			driver = new ChromeDriver();

		} else if (browser.equals("FieFox")) {

			driver = new FirefoxDriver();
 
		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

	public static void closebrowser() {

		driver.close();

	}

}
