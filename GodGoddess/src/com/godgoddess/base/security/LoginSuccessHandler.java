package com.godgoddess.base.security;

import java.io.IOException;

import com.godgoddess.base.util.Md5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.godgoddess.base.action.Memory;
import com.godgoddess.base.entity.TBaseUserEntity;


/**
 * @ClassName com.godgoddess.base.security.LoginSuccessHandler.java
 * @Description: 用户登录成功有助手类，用于记录日志及做页面跳转。
 * @author dzb@kingtopinfo.com
 * @date 2016年3月25日 下午4:18:23
 * @version 1.0
 */
@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
	
	@Autowired
	 private Memory memory;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException { 
		
		UserInfo userInfo = (UserInfo)authentication.getPrincipal();
		String seed = Md5.md5Digest(userInfo.getUsername());
		String token = Md5.getMd5Time(userInfo.getPassword(), userInfo.getUsername());
		memory.clearLoginInfoBySeed(seed);
		TBaseUserEntity tBaseUserEntity = new TBaseUserEntity();
		tBaseUserEntity.setEmail(token);
		memory.setValue(seed, token, 60, 0);
		memory.setValue(token, tBaseUserEntity, 60, 0);	
        response.getWriter().write(token);
        response.getWriter().close();
//		HttpSession session = request.getSession();
//		session.setAttribute("to",Md5.getMd5Time());
	}
	 
}
