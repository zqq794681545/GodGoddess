package com.godgoddess.base.util;

import org.springframework.security.core.context.SecurityContextHolder;

import com.godgoddess.base.security.UserInfo;


public class UserBase {
	
	/**
	 * Description :获取登陆账号 account
	 * @author lxc
	 * Create at @2016年10月27日.上午9:43:20
	 */
	public static String getUsername(){
		UserInfo userDetails = getUserInfo();
		if(null == userDetails){
			return "未知";
		}else{
			return userDetails.getUsername();
		}
	}
	
	/**
	 * Description :获取用户名  中文
	 * @author lxc
	 * Create at @2016年10月27日.上午9:44:04
	 */
	public static String getZwUserName(){
		UserInfo userDetails = getUserInfo();
		if(null == userDetails){
			return "未知";
		}else{
			return userDetails.getUser();
		}
	}
	
	/**
	 * Description :获取行政区划
	 * @author lxc
	 * Create at @2016年11月14日.下午2:35:18
	 */
	public static String getXzqh(){
		UserInfo userDetails = getUserInfo();
		if(null == userDetails){
			return "未知";
		}else{
			return userDetails.getXzqh();
		}
	}
	
	public static String getUserId(){
		UserInfo userDetails = getUserInfo();
		if(null == userDetails){
			return "未知";
		}else{
			return userDetails.getUserid();
		}
	}
	
	public static UserInfo getUserInfo(){
		
		UserInfo userDetails = null;
		try{
			userDetails = (UserInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			return userDetails;
		}catch(java.lang.ClassCastException e){
			return null;
		}
		
	}
	
	
	
}
