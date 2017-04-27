package com.godgoddess.base.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class mapUtil {
	private Map<String, Object> map = new HashMap<String, Object>();

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	} 
	public Map<String, Object> setMaputil(String code,String massage,ArrayList<?> data) {
		
		this.map.put("code", code);
		this.map.put("massage", massage);
		this.map.put("data", data);
		return this.map;
	}

}
