package com.godgoddess.base.util;

public class StringFormatUtil {

	/**
	 * 把null替换为空字符串及去掉字符串后的空格
	 * @param str
	 * @return
	 */
	public static String replaceNull(String str){
		
		if(null == str){
			str = "";
		}else{
			str = str.trim();
		}
		return str;
	}
}
