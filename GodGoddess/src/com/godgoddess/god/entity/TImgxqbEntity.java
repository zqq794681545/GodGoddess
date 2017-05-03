package com.godgoddess.god.entity;

import com.godgoddess.base.entity.BaseEntity;
import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.godgoddess.god.entity.TImgxqbEntity
 * @Description t_imgxqb表实体类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 16:10:16
 * @version 1.0
 * @remark create by generator
 */

public class TImgxqbEntity extends BaseEntity{

	private String imggroupid;  //
	private String imggxr;  //
	private String imgpath;  //
	private int imgheight;  //
	private String imgextend;  //
	private java.util.Date imggxsj;  //
	private int imgweight;  //
	private int imgstate;  //
	private String imgname;  //
	private int imgtype;  //
	private String id;  //
	
	public String getImggroupid(){
		return imggroupid;
	}
	public void setImggroupid(String imggroupid){
		this.imggroupid = imggroupid;
	}
	public String getImggxr(){
		return imggxr;
	}
	public void setImggxr(String imggxr){
		this.imggxr = imggxr;
	}
	public String getImgpath(){
		return imgpath;
	}
	public void setImgpath(String imgpath){
		this.imgpath = imgpath;
	}
	public int getImgheight(){
		return imgheight;
	}
	public void setImgheight(int imgheight){
		this.imgheight = imgheight;
	}
	public String getImgextend(){
		return imgextend;
	}
	public void setImgextend(String imgextend){
		this.imgextend = imgextend;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getImggxsj(){
		return imggxsj;
	}
	public void setImggxsj(java.util.Date imggxsj){
		this.imggxsj = imggxsj;
	}
	public int getImgweight(){
		return imgweight;
	}
	public void setImgweight(int imgweight){
		this.imgweight = imgweight;
	}
	public int getImgstate(){
		return imgstate;
	}
	public void setImgstate(int imgstate){
		this.imgstate = imgstate;
	}
	public String getImgname(){
		return imgname;
	}
	public void setImgname(String imgname){
		this.imgname = imgname;
	}
	public int getImgtype(){
		return imgtype;
	}
	public void setImgtype(int imgtype){
		this.imgtype = imgtype;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
}