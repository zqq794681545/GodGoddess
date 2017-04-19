package com.godgoddess.base.entity;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseRoleEntity
 * @Description T_BASE_ROLE表映射实体类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:22:06
 * @version 1.0
 * @remark create by generator
 */

public class TBaseRoleEntity {
	
	private String pid;
	private String rolename;
	private java.util.Date updatetime;
	private String id;
	private String userid;
	private String menuid;
	public String getPid(){  
		return pid;  
	}  
	public void setPid(String pid){  
		this.pid = pid;  
	}  
	public String getRolename(){  
		return rolename;  
	}  
	public void setRolename(String rolename){  
		this.rolename = rolename;  
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getMenuid() {
		return menuid;
	}
	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}  
	
}