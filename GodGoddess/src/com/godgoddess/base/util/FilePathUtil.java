package com.godgoddess.base.util;

import java.io.IOException;
import java.util.Properties;

public class FilePathUtil {

	public static String getFilePath(String name){
		Properties prop = new Properties();  
	    try {  
	        prop.load(FilePathUtil.class.getClassLoader().getResourceAsStream("document-config.properties"));  
	        return prop.getProperty(name);
	    } catch(IOException e) {  
	        e.printStackTrace();  
	        return null;
	    }  
	}
}