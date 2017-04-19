package com.godgoddess.base.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntegerUtil {
	
	/**
	 * 字符串转数字
	 * @param str
	 * @return
	 */
	public static int changeString2Int(String str){
		
		if(isNumeric(str)){
			return Integer.parseInt(str);
		}else{
			return -1;
		}
	}
	
	/**
	 * 判断字符串是否为数值（正数）
	 * @param str
	 * @return
	 */
	private static boolean isNumeric(String str){
		
		if(null == str){
			return false; 
		}else{
			//-?[0-9]+.?[0-9]+ 配合所有數字
			//-?[0-9]+ 匹配負數
			Pattern pattern = Pattern.compile("[0-9]*"); 
			Matcher isNum = pattern.matcher(str);
			if( !isNum.matches() ){
				return false; 
			}else{
				return true; 
			}
		}
	}
	
	public static void main(String[] args){
		
		System.out.println(changeString2Int(null));
	}

}
