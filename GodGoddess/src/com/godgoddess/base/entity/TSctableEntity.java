package com.godgoddess.base.entity;

import com.godgoddess.base.entity.BaseEntity;
import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.godgoddess.base.entity.TSctableEntity
 * @Description t_sctable表实体类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 15:36:26
 * @version 1.0
 * @remark create by generator
 */

public class TSctableEntity extends BaseEntity{

	private String imggroupid;  //
	private java.util.Date sctime;  //
	private String userid;  //
	private int scbs;  //
	private String id;  //
	
	public String getImggroupid(){
		return imggroupid;
	}
	public void setImggroupid(String imggroupid){
		this.imggroupid = imggroupid;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getSctime(){
		return sctime;
	}
	public void setSctime(java.util.Date sctime){
		this.sctime = sctime;
	}
	public String getUserid(){
		return userid;
	}
	public void setUserid(String userid){
		this.userid = userid;
	}
	public int getScbs(){
		return scbs;
	}
	public void setScbs(int scbs){
		this.scbs = scbs;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
}