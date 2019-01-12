package com.packetFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {
	
	private Properties prop = new Properties();
	
	
	public Property(String filename) throws IOException{
		
		FileInputStream fis = new FileInputStream (filename);
		
		prop.load(fis);
	}

	public String getvalue(String key){
		
		String value = null;
		
		value=prop.getProperty(key);
		
		return value; 
	}

	

}
