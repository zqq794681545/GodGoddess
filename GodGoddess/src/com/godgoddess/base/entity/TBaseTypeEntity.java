package com.godgoddess.base.entity;

import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.kingtopinfo.entity.TBaseTypeEntity
 * @Description T_BASE_TYPE表映射实体类
 * @author dzb@kingtopinfo.com
 * @date 2013-11-19 15:45:37
 * @version 1.0
 * @remark create by generator
 */

public class TBaseTypeEntity {
	
	private String id;
	private Integer status = 0;
	private String name = "";
	private String code = "";
	private String value;
	private java.util.Date updateTime = null;
	private String pid;
	private String type;
	private int sequ;
	private int ver;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public int getSequ() {
		return sequ;
	}
	public void setSequ(int sequ) {
		this.sequ = sequ;
	}
	public int getVer() {
		return ver;
	}
	public void setVer(int ver) {
		this.ver = ver;
	}
	
}