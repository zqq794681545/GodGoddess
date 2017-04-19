package com.godgoddess.base.entity;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseUserEntity
 * @Description T_BASE_USER表映射实体类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:21:43
 * @version 1.0
 * @remark create by generator
 */

public class TBaseUserEntity{
	
	private String password;
	private int state;
	private String username;
	private String account;
	private java.util.Date updatetime;
	private String id;
	private String roleid;
	private String xzqh;
	private String gid;
	private String pid;
	private String gname;
	private String institutions;
	
	public String getInstitutions() {
		return institutions;
	}
	public void setInstitutions(String institutions) {
		this.institutions = institutions;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getPassword(){  
		return password;  
	}  
	public void setPassword(String password){  
		this.password = password;  
	}  
	public int getState(){  
		return state;  
	}  
	public void setState(int state){  
		this.state = state;  
	}  
	public String getUsername(){  
		return username;  
	}  
	public void setUsername(String username){  
		this.username = username;  
	}  
	public String getAccount(){  
		return account;  
	}  
	public void setAccount(String account){  
		this.account = account;  
	}  
	public java.util.Date getUpdatetime(){  
		return updatetime;  
	}  
	public void setUpdatetime(java.util.Date updatetime){  
		this.updatetime = updatetime;  
	}  
	public String getId(){  
		return id;  
	}  
	public void setId(String id){  
		this.id = id;  
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getXzqh() {
		return xzqh;
	}
	public void setXzqh(String xzqh) {
		this.xzqh = xzqh;
	}
	/**
	 * @return the pid
	 */
	public String getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	/**
	 * @return the gname
	 */
	public String getGname() {
		return gname;
	}
	/**
	 * @param gname the gname to set
	 */
	public void setGname(String gname) {
		this.gname = gname;
	}  
	
}