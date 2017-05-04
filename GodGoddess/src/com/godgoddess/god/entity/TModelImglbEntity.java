package com.godgoddess.god.entity;

import com.godgoddess.base.entity.BaseEntity;
import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.godgoddess.god.entity.TModelImglbEntity
 * @Description t_model_imglb表实体类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 14:08:56
 * @version 1.0
 * @remark create by generator
 */

public class TModelImglbEntity extends BaseEntity{

	private String imglbid;  //
	private String imggroupvalue;  //
	private java.util.Date updatetime;  //
	private String imglbfmpath;  //
	private String id;  //
	private String groupname;  //
	private int imagenum;  //
	
	
	public int getImagenum() {
		return imagenum;
	}
	public void setImagenum(int imagenum) {
		this.imagenum = imagenum;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getImglbid() {
		return imglbid;
	}
	public void setImglbid(String imglbid) {
		this.imglbid = imglbid;
	}
	public String getImggroupvalue(){
		return imggroupvalue;
	}
	public void setImggroupvalue(String imggroupvalue){
		this.imggroupvalue = imggroupvalue;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getUpdatetime(){
		return updatetime;
	}
	public void setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
	}
	public String getImglbfmpath(){
		return imglbfmpath;
	}
	public void setImglbfmpath(String imglbfmpath){
		this.imglbfmpath = imglbfmpath;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
}