package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties prop;

	public ConfigDataProvider() {

		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {

			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getchromepath() {

		String path = prop.getProperty("chromepath");

		return path;
	}

	public String geturl(String url) {

		 url = prop.getProperty("url");
		return url;
	}

	public String getproperty() {

		String value = prop.getProperty("name");

		return value;

	}

	public void setproperty(String strkey, String strvalue) {

		prop.setProperty(strkey, strvalue);

	}

}
