package com.godgoddess.base.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.godgoddess.base.entity.TBaseUserlogEntity;
import com.godgoddess.base.service.TBaseUserlogService;

/**
 * @ClassName com.godgoddess.base.security.LoginSuccessHandler.java
 * @Description: 用户登录成功有助手类，用于记录日志及做页面跳转。
 * @author dzb@kingtopinfo.com
 * @date 2016年3月25日 下午4:18:23
 * @version 1.0
 */

public class LoginSuccessHandler implements AuthenticationSuccessHandler {
	
	@Autowired
	private TBaseUserlogService tBaseUserlogService;

	private String defaultTargetUrl;
	
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {

		this.redirectStrategy.sendRedirect(request, response, this.defaultTargetUrl);
		
		UserInfo userInfo = (UserInfo)authentication.getPrincipal();
		String ip = ClientInfo4SecurityUtil.getRemoteAddress(authentication);
		String sessionid = ClientInfo4SecurityUtil.getSessionId(authentication);
		TBaseUserlogEntity oTBaseUserlogEntity = new TBaseUserlogEntity();
		oTBaseUserlogEntity.setType(1);
		oTBaseUserlogEntity.setAccount(userInfo.getUsername());
		oTBaseUserlogEntity.setRemoteaddress(ip);
		oTBaseUserlogEntity.setSessionid(sessionid);
		tBaseUserlogService.insert(oTBaseUserlogEntity);
	}
	
	public void setDefaultTargetUrl(String defaultTargetUrl) {  
        this.defaultTargetUrl = defaultTargetUrl;  
    }   

}
