package com.godgoddess.base.entity;

import com.godgoddess.base.entity.BaseEntity;
import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.godgoddess.base.entity.TTypeEntity
 * @Description t_type表实体类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 11:37:24
 * @version 1.0
 * @remark create by generator
 */

public class TTypeEntity extends BaseEntity{

	private String codeid;  //
	private String pid;  //
	private String name;  //
	private int value;  //
	private int state;  //
	private java.util.Date updatetime;  //
	private String id;  //
	
	public String getCodeid(){
		return codeid;
	}
	public void setCodeid(String codeid){
		this.codeid = codeid;
	}
	public String getPid(){
		return pid;
	}
	public void setPid(String pid){
		this.pid = pid;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state = state;
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