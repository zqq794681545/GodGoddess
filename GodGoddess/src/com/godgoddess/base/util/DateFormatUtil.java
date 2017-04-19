package com.godgoddess.base.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatUtil {
	public static final int YEAR = Calendar.YEAR;
	public static final int MONTH = Calendar.MONTH;
	public static final int DAY = Calendar.DATE;
	public static final int HOUR = Calendar.HOUR;
	public static final int MINUTE = Calendar.MINUTE;
	public static final int SECOND = Calendar.SECOND;
	/**
	 * 根据日历的规则，为给定的日历字段添加或减去指定的时间量
	 * @param date 需要增减的日期
	 * @param field 增减的单位(其格式包括：年-DateUtil.YEAR,月-DateUtil.MONTH,日-DateUtil.DAY,时-DateUtil.HOUR,分-DateUtil.MINUTE,秒-DateUtil.SECOND)
	 * @param amount 日期增减的时间量，+代表增减，-代表减少
	 * @return 
	 */
	public static Date add(Date date,int field, int amount){	
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, amount);
		return calendar.getTime();
	}
	
	/**
	 * 格式化日期
	 * @param date 需要格式化的日期
	 * @param pattern 日期格式
	 * @return
	 */
	public static Date formatDate(Date date,String pattern){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(sdf.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 格式化日期(yyyy-MM-dd)
	 * @param date
	 * @return
	 */
	public static Date formatDate(Date date){
		
		return formatDate(date,"yyyy-MM-dd");
	}
	
	/**
	 *  格式化时间为指定时间格式的时间字符串
	 * @param date 需要格式化的日期
	 * @param pattern 日期格式
	 * @return
	 */
	public static String format(Date date,String pattern){
		if(date == null)
			return "";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
	/**
	 *  将时间字符转换成时间。
	 * @param dateString 时间字符串
	 * @param pattern 日期格式
	 * @return
	 */
	public static Date parse(String dateString,String pattern){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(add(new Date(),DateFormatUtil.DAY, 1));
		System.out.println(formatDate(new Date(),"yyyy-MM-dd"));
		System.out.println(format(new Date(),"yyyy-MM-dd HH:mm:ss"));
		System.out.println(parse("2014-05-06 15:30:20","yyyy-MM-dd hh:mm:ss"));
	}

}
