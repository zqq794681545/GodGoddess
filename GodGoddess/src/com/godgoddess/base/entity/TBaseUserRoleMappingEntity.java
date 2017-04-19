package com.godgoddess.base.entity;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseUserRoleMappingEntity
 * @Description T_BASE_USER_ROLE_MAPPING表映射实体类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:21:47
 * @version 1.0
 * @remark create by generator
 */

public class TBaseUserRoleMappingEntity {
	
	private String[] userids;
	private String userid;
	private String roleid;
	private java.util.Date updatetime;
	private String id;
	
	public String[] getUserids() {
		return userids;
	}
	public void setUserids(String[] userids) {
		this.userids = userids;
	}
	public String getUserid(){  
		return userid;  
	}  
	public void setUserid(String userid){  
		this.userid = userid;  
	}  
	public String getRoleid(){  
		return roleid;  
	}  
	public void setRoleid(String roleid){  
		this.roleid = roleid;  
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
	
}