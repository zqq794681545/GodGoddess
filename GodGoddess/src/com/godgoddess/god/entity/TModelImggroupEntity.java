package com.godgoddess.god.entity;

import com.godgoddess.base.entity.BaseEntity;
import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.godgoddess.god.entity.TModelImggroupEntity
 * @Description t_model_imggroup表实体类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 14:45:50
 * @version 1.0
 * @remark create by generator
 */

public class TModelImggroupEntity extends BaseEntity{

	private String imggroupid;  //
	private String imggroupgrfm;  //
	private java.util.Date imggroupgxsj;  //
	private int imgfmsize;  //
	private String imggroupname;  //
	private String imggroupgxr;  //
	private String imggroupbt;  //
	private int imggroupsee;  //
	private int imggroupvip;  //
	private String modelid;  //
	private int imggrouptype;  //
	private int imggroupgrbs;  //
	private int imggroupdzrs;  //
	private String id;  //
	
	public String getImggroupid(){
		return imggroupid;
	}
	public void setImggroupid(String imggroupid){
		this.imggroupid = imggroupid;
	}
	public String getImggroupgrfm(){
		return imggroupgrfm;
	}
	public void setImggroupgrfm(String imggroupgrfm){
		this.imggroupgrfm = imggroupgrfm;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getImggroupgxsj(){
		return imggroupgxsj;
	}
	public void setImggroupgxsj(java.util.Date imggroupgxsj){
		this.imggroupgxsj = imggroupgxsj;
	}
	public int getImgfmsize(){
		return imgfmsize;
	}
	public void setImgfmsize(int imgfmsize){
		this.imgfmsize = imgfmsize;
	}
	public String getImggroupname(){
		return imggroupname;
	}
	public void setImggroupname(String imggroupname){
		this.imggroupname = imggroupname;
	}
	public String getImggroupgxr(){
		return imggroupgxr;
	}
	public void setImggroupgxr(String imggroupgxr){
		this.imggroupgxr = imggroupgxr;
	}
	public String getImggroupbt(){
		return imggroupbt;
	}
	public void setImggroupbt(String imggroupbt){
		this.imggroupbt = imggroupbt;
	}
	public int getImggroupsee(){
		return imggroupsee;
	}
	public void setImggroupsee(int imggroupsee){
		this.imggroupsee = imggroupsee;
	}
	public int getImggroupvip(){
		return imggroupvip;
	}
	public void setImggroupvip(int imggroupvip){
		this.imggroupvip = imggroupvip;
	}
	public String getModelid(){
		return modelid;
	}
	public void setModelid(String modelid){
		this.modelid = modelid;
	}
	public int getImggrouptype(){
		return imggrouptype;
	}
	public void setImggrouptype(int imggrouptype){
		this.imggrouptype = imggrouptype;
	}
	public int getImggroupgrbs(){
		return imggroupgrbs;
	}
	public void setImggroupgrbs(int imggroupgrbs){
		this.imggroupgrbs = imggroupgrbs;
	}
	public int getImggroupdzrs(){
		return imggroupdzrs;
	}
	public void setImggroupdzrs(int imggroupdzrs){
		this.imggroupdzrs = imggroupdzrs;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
}