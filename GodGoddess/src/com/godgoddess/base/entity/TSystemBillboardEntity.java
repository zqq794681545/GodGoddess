package com.godgoddess.base.entity;

import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.kingtopinfo.base.entity.TSystemBillboardEntity
 * @Description T_SYSTEM_BILLBOARD表实体类
 * @author dzb@kingtopinfo.com
 * @date 2016-10-12 10:33:25
 * @version 1.0
 * @remark create by generator
 */

public class TSystemBillboardEntity extends BaseEntity{

	private String createuser;  //创建人编号
	private String updateuser;  //更新人编号
	private String system_billboard_id;  //编号
	private java.util.Date billboard_time;  //公告时间
	private java.util.Date createtime;  //创建时间
	private java.util.Date updatetime;  //更新时间
	private String billboard_title;  //公告标题
	private String document_id;  //附件编号
	private int state;  //有效状态（0：无效、1：有效）
	private String billboard_body;  //公告文本
	
	public String getCreateuser(){
		return createuser;
	}
	public void setCreateuser(String createuser){
		this.createuser = createuser;
	}
	public String getUpdateuser(){
		return updateuser;
	}
	public void setUpdateuser(String updateuser){
		this.updateuser = updateuser;
	}
	public String getSystem_billboard_id(){
		return system_billboard_id;
	}
	public void setSystem_billboard_id(String system_billboard_id){
		this.system_billboard_id = system_billboard_id;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getBillboard_time(){
		return billboard_time;
	}
	public void setBillboard_time(java.util.Date billboard_time){
		this.billboard_time = billboard_time;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getCreatetime(){
		return createtime;
	}
	public void setCreatetime(java.util.Date createtime){
		this.createtime = createtime;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getUpdatetime(){
		return updatetime;
	}
	public void setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
	}
	public String getBillboard_title(){
		return billboard_title;
	}
	public void setBillboard_title(String billboard_title){
		this.billboard_title = billboard_title;
	}
	public String getDocument_id(){
		return document_id;
	}
	public void setDocument_id(String document_id){
		this.document_id = document_id;
	}
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state = state;
	}
	public String getBillboard_body() {
		return billboard_body;
	}
	public void setBillboard_body(String billboard_body) {
		this.billboard_body = billboard_body;
	}
	
}