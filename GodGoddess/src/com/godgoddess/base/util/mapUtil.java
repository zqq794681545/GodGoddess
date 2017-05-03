package com.godgoddess.base.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class mapUtil {

	public Map<String, Object> setMaputil(String code,String massage,Object data) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("code", code);
		map.put("massage", massage);
		map.put("data", data);
		return map;
	}
	
	public Map<String, Object> setMaptoken(String code,String massage,Object token) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("code", code);
		map.put("massage", massage);
		map.put("token", token);
		return map;
	}

}
