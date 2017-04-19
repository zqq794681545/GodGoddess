package com.godgoddess.base.entity;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseMenuEntity
 * @Description T_BASE_MENU表映射实体类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-20 09:12:37
 * @version 1.0
 * @remark create by generator
 */

public class TBaseMenuEntity {
	
	private String url;
	private String pid;
	private int state;
	private String name;
	private int sequ;
	private java.util.Date updatetime;
	private String id;
	private String roleid;
	private String type;
	private String icon;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl(){  
		return url;  
	}  
	public void setUrl(String url){  
		this.url = url;  
	}  
	public String getPid(){  
		return pid;  
	}  
	public void setPid(String pid){  
		this.pid = pid;  
	}  
	public int getState(){  
		return state;  
	}  
	public void setState(int state){  
		this.state = state;  
	}  
	public String getName(){  
		return name;  
	}  
	public void setName(String name){  
		this.name = name;  
	}  
	public int getSequ(){  
		return sequ;  
	}  
	public void setSequ(int sequ){  
		this.sequ = sequ;  
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
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
}