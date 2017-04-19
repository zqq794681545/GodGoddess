package com.godgoddess.base.security;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

public class UserInfoBase {

	private UserInfo userDetails = null;
	private WebAuthenticationDetails wauth = null;
	
	public String getAccount() {
		return userDetails.getUsername();
	}
	
	public String getUsername() {
		return userDetails.getUser();
	}
	
	public String getXzqh() {
		return userDetails.getXzqh();
	}
	
	public Collection<GrantedAuthority> getAuthorities() {
		return userDetails.getAuthorities();
	}
	
	public String getRemoteAddress(){
		return wauth.getRemoteAddress();
	}
	
	public String getSessionId(){
		return wauth.getSessionId();
	}

	public UserInfoBase(){
		userDetails = (UserInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		wauth = (WebAuthenticationDetails) auth.getDetails();
	}
	
	
}
