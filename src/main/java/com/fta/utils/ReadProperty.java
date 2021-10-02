package com.fta.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.fta.constants.FrameworkConstants;

public final class ReadProperty {

	protected ReadProperty() {	}
	private static FileInputStream fis;
	private static Properties property=new Properties();
	private static Map<String,String> configmap=new HashMap<>();
	
	static {
		try {
			fis=new FileInputStream(FrameworkConstants.getConfigpropertiespath());
			property.load(fis);
			
			//adding property value to hashmap because hashtable is slow
//			for(Object key:property.keySet())
//			{
//				configmap.put(String.valueOf(key), String.valueOf(property.get(key)));
//			}
			
			for(Map.Entry<Object,Object> entry:property.entrySet())
			{
				configmap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String getvalueusinghashmap(String key) 
	{
		if(Objects.isNull(key) || Objects.isNull(configmap.get(key)))
		{
			try {
				throw new Exception("Property Name "+key+"is not found, please check the config.properties file");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return configmap.get(key);		
	}

	
//	public static String get(String key) 
//	{
//		if(Objects.isNull(key) || Objects.isNull(property.getProperty(key)))
//		{
//			try {
//				throw new Exception("Property Name "+key+"is not found, please check the config.properties file");
//			}catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
//		return property.getProperty(key);		
//	}

}
