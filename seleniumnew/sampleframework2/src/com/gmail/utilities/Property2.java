package com.gmail.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property2 {

	public static Properties props = new Properties();

	public static void initialze(String strFileName){
		
		try {
			FileInputStream fis = new FileInputStream(strFileName);
			props.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public String getProperty(String strKey) {
		
		String strValue = null;
		try {
				strValue = props.getProperty(strKey);
		} catch (Exception e) {
	
			System.out.println(e);
		}
		return strValue;
	}

	/*public void setProperty(String strKey, String strValue) throws Throwable {
		try {
			File f = new File(strFileName);
			if (f.exists()) {
				FileInputStream in = new FileInputStream(f);
				props.load(in);
				props.setProperty(strKey, strValue);
				props.store(new FileOutputStream(strFileName), null);
				in.close();
			} else {
				System.out.println("File not found!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/

	/*public void removeProperty(String strKey) {
		try {
			File f = new File(strFileName);
			if (f.exists()) {
				FileInputStream in = new FileInputStream(f);
				props.load(in);
				props.remove(strKey);
				props.store(new FileOutputStream(strFileName), null);
				in.close();
			} else
				System.out.println("File not found!");
		} catch (Exception e) {
			System.out.println(e);
		}

	}*/
}
