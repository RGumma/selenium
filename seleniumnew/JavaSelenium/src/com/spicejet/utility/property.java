package com.spicejet.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property {
	
	public String filename;
	
	
public void getProperty( String strkey) throws IOException  {
	
	File fi =new File(filename);
	
	FileInputStream fis;
try {
	
	fis = new FileInputStream(fi);
	
	 Properties prop =new Properties();
	 
		prop.load(fis);
		
			 String value = prop.getProperty(strkey);
	 
} catch (FileNotFoundException e) {
	
	e.printStackTrace();
}
	
}

 public void setproperty(String key, String value) throws IOException {
	 
	 File fi = new File(filename);
      
	 FileInputStream fis;
	try {
		fis = new FileInputStream(fi);
		 
		Properties prop = new Properties();
		 
			prop.load(fis); 
			 
			prop.setProperty(key, value);
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	 
}
}
