package com.godgoddess.base.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.godgoddess.base.entity.TBaseUserEntity;
import com.godgoddess.base.service.TBaseUserService;


/**
 * @ClassName com.kingtopinfo.base.security.Login.java
 * @Description: 用户登录验证
 * @author dzb@kingtopinfo.com
 * @date 2016年3月28日 上午9:46:38
 * @version 1.0
 */
public class Login implements UserDetailsService {

	@Autowired
	private TBaseUserService tBaseUserService;

	@Override
	public UserDetails loadUserByUsername(String account){
		
		if (!"".equals(account)) {
			
			TBaseUserEntity oTBaseUserEntity = tBaseUserService.selectByAccount(account);
			//判断账号是否存在
			if(null != oTBaseUserEntity){
				
				Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
				SimpleGrantedAuthority auth = new SimpleGrantedAuthority("base");	//默认加载base权限
				auths.add(auth);
				List<String> roleid = tBaseUserService.selectRoleIdByAccount(account);
				for(int i=0;i<roleid.size();i++){
					auth = new SimpleGrantedAuthority(roleid.get(i));
					auths.add(auth);
				}
				UserInfo user = new UserInfo(account, oTBaseUserEntity.getPassword(), true, true, true, true, auths);
				user.setUser(oTBaseUserEntity.getUsername());	//添加附加属性
				user.setUserid(oTBaseUserEntity.getId());
				return user;
			}else{
				return null;
			}
		} else {
			return null;
		}
	}

}
