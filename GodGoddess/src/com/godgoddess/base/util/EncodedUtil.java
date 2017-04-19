package com.godgoddess.base.util;

import java.io.UnsupportedEncodingException;

public class EncodedUtil {
	
	public static String encodeISO(String str, String encoding){
		
		String s = "";
		if(null != str){
			try {
				s = new String(str.getBytes("ISO-8859-1"),encoding);
			} catch (UnsupportedEncodingException e) {
				s = "转换代码失败";
				e.printStackTrace();
			}
		}else{
			s = "";
		}
		return s;
	}
	
	public static String encodeISO4GBK(String str){
		
		return encodeISO(str, "GBK");
	}
	
	public static String encodeISO4UTF8(String str){
		
		return encodeISO(str, "UTF-8");
	}

}
