package com.godgoddess.base.entity;

/**
 * @ClassName com.kingtopinfo.base.entity.THelpRoleMappingEntity
 * @Description T_BASE_ROLE_MENU_MAPPING表映射实体类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:21:54
 * @version 1.0
 * @remark create by generator
 */

public class THelpRoleMappingEntity {
	
	private String menuid;
	private String roleid;
	private java.util.Date updatetime;
	private String id;
	
	public String getMenuid(){  
		return menuid;  
	}  
	public void setMenuid(String menuid){  
		this.menuid = menuid;  
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