package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	
	
	public static String capturescreenshot(WebDriver driver, String screenshotName){
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		String destination = "./Screenshots/"+screenshotName+
		
		FileUtils.copyFile(src, new  );
		
		
	}

}
