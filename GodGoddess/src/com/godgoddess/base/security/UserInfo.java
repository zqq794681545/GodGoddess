package com.godgoddess.base.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class UserInfo extends User {
	
	private static final long serialVersionUID = 1L;
	
	private String user;	//用户名
	private String xzqh;	//行政区划
	private String userid;	//用户编号
	private String gid;		//组织机构编号

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getXzqh() {
		return xzqh;
	}

	public void setXzqh(String xzqh) {
		this.xzqh = xzqh;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}
	
	/**
	 * @param username	用户名
	 * @param password	密码
	 * @param enabled	账号是否存在
	 * @param accountNonExpired		账号是否过期
	 * @param credentialsNonExpired		账号凭证是否过期
	 * @param accountNonLocked	账号是否被锁定
	 * @param authorities	权限列表
	 */

	public UserInfo(String username, String password, boolean enabled, boolean accountNonExpired,boolean credentialsNonExpired, boolean accountNonLocked, Collection<GrantedAuthority> authorities){
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

}
