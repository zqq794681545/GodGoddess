package com.godgoddess.base.entity;

import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseMenuModuleMappingEntity
 * @Description T_BASE_MENU_MODULE_MAPPING表实体类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-03-21 09:32:54
 * @version 1.0
 * @remark create by generator
 */

public class TBaseMenuModuleMappingEntity extends BaseEntity{

	private String menuid;  //菜单id
	private String moduleid;  //模块id
	private String roleid;  //角色id
	private java.util.Date updatetime;  //更新时间
	private String id;  //
	
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getMenuid(){
		return menuid;
	}
	public void setMenuid(String menuid){
		this.menuid = menuid;
	}
	public String getModuleid(){
		return moduleid;
	}
	public void setModuleid(String moduleid){
		this.moduleid = moduleid;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
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