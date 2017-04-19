package com.godgoddess.base.entity;

import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseDocumentEntity
 * @Description T_BASE_DOCUMENT表实体类
 * @author dzb@kingtopinfo.com
 * @date 2016-10-14 13:49:04
 * @version 1.0
 * @remark create by generator
 */

public class TBaseDocumentEntity {

	private String name;  //文件名
	private String ext;  //扩展名
	private String createuser;  //创建人编号
	private String updateuser;  //更新人编号
	private long sizes;  //大小（单位：k）
	private String base_document_id;  //编号
	private java.util.Date createtime;  //创建时间
	private java.util.Date updatetime;  //更新时间
	private String path;  //文件路径
	private int state;  //有效状态（0：无效、1：有效）
	private String src_id;	//源编号（业务表主键）
	private String md5key;	//MD5标示
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getExt(){
		return ext;
	}
	public void setExt(String ext){
		this.ext = ext;
	}
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
	public long getSizes(){
		return sizes;
	}
	public void setSizes(long sizes){
		this.sizes = sizes;
	}
	public String getBase_document_id(){
		return base_document_id;
	}
	public void setBase_document_id(String base_document_id){
		this.base_document_id = base_document_id;
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
	public String getPath(){
		return path;
	}
	public void setPath(String path){
		this.path = path;
	}
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state = state;
	}
	public String getSrc_id() {
		return src_id;
	}
	public void setSrc_id(String src_id) {
		this.src_id = src_id;
	}
	public String getMd5key() {
		return md5key;
	}
	public void setMd5key(String md5key) {
		this.md5key = md5key;
	}
}