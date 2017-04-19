package com.godgoddess.base.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * properties文件加载类
 * @author dzb@kingtopinfo.com
 *
 */
public class PropertiesUtil {
	
	private Map<String, String> map = new HashMap<String, String>();
	
	/**
	 * 加载初始化properties
	 * @param propertiesPath
	 */
	public PropertiesUtil(String propertiesPath){
		
		Properties prop = new Properties();
		try {
			//InputStream stream = PropertiesUtil.class.getClass().getResourceAsStream("/"+propertiesPath);
			InputStream stream = this.getClass().getClassLoader().getResourceAsStream("/"+propertiesPath);
			prop.load(stream);
			stream.close();
			Iterator<Entry<Object, Object>> itr = prop.entrySet().iterator();
	        while (itr.hasNext()){
				Entry<Object, Object> e = itr.next();
				map.put((String)e.getKey(),(String)e.getValue());
	        }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取Properties文件的内容
	 * @param path
	 * @return
	 */
	public Map<String, String> read(){
		return map;
	}
}
