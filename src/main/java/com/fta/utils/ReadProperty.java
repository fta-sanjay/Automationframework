package com.fta.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class ReadProperty {

	protected ReadProperty() {	}
	private static FileInputStream fis;
	public static String get(String key)
	{
		Properties property=new Properties();
		try {
			 fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/configfile");
			property.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return property.getProperty(key);		
	}

}
