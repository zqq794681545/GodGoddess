package com.godgoddess.base.entity;

import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseFileEntity
 * @Description T_BASE_FILE表实体类
 * @author 林祥聪  lxcl@kingtopinfo.com
 * @date 2016-10-26 16:19:23
 * @version 1.0
 * @remark create by generator
 */

public class TBaseFileEntity extends BaseEntity{

	private String operatype;  //业务类型
	private String remark;  //备注
	private String operaid;  //业务编号
	private String cjr;  //创建人
	private long filesize;  //文件大小
	private String filename;  //文件名称
	private String extend;  //扩展名
	private java.util.Date gxsj;  //更新时间
	private String fileid;  //编号
	private String filepath;  //文件路径
	private int state;  //有效标识
	
	public String getOperatype(){
		return operatype;
	}
	public void setOperatype(String operatype){
		this.operatype = operatype;
	}
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getOperaid(){
		return operaid;
	}
	public void setOperaid(String operaid){
		this.operaid = operaid;
	}
	public String getCjr(){
		return cjr;
	}
	public void setCjr(String cjr){
		this.cjr = cjr;
	}
	public long getFilesize(){
		return filesize;
	}
	public void setFilesize(long filesize){
		this.filesize = filesize;
	}
	public String getFilename(){
		return filename;
	}
	public void setFilename(String filename){
		this.filename = filename;
	}
	public String getExtend(){
		return extend;
	}
	public void setExtend(String extend){
		this.extend = extend;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getGxsj(){
		return gxsj;
	}
	public void setGxsj(java.util.Date gxsj){
		this.gxsj = gxsj;
	}
	public String getFileid(){
		return fileid;
	}
	public void setFileid(String fileid){
		this.fileid = fileid;
	}
	public String getFilepath(){
		return filepath;
	}
	public void setFilepath(String filepath){
		this.filepath = filepath;
	}
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state = state;
	}
}