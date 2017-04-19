package com.godgoddess.base.entity;

import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseGroupEntity
 * @Description T_BASE_GROUP表映射实体类
 * @author 姚子鹏 yaozp@kingtopinfo.com
 * @date 2014-12-26 10:40:47
 * @version 1.0
 * @remark create by generator
 */

public class TBaseGroupEntity {
	
	
	/**
	* 机构名称
	*/
	private String gname;
	
	/**
	* 机构编号
	*/
	private String id;
	
	/**
	* 更新时间
	*/
	private java.util.Date updatetime;
	
	/**
	* 机构父编号
	*/
	private String pid;
	
	
	public String getGname(){  
		return gname;  
	}
	  
	public void setGname(String gname){  
		this.gname = gname;  
	}  
	
	public String getId(){  
		return id;  
	}
	  
	public void setId(String id){  
		this.id = id;  
	}  
	
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getUpdatetime(){  
		return updatetime;  
	}
	  
	public void setUpdatetime(java.util.Date updatetime){  
		this.updatetime = updatetime;  
	}  
	
	public String getPid(){  
		return pid;  
	}
	  
	public void setPid(String pid){  
		this.pid = pid;  
	}  
	
}