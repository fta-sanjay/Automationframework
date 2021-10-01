package com.fta.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadProperty {

	protected ReadProperty() {	}
	private static FileInputStream fis;
	private static Properties property=new Properties();
	
	static {
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
			property.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get(String key) 
	{
		if(Objects.isNull(key) || Objects.isNull(property.getProperty(key)))
		{
			try {
				throw new Exception("Property Name "+key+"is not found, please check the config.properties file");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return property.getProperty(key);		
	}

}
