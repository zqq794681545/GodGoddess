package com.godgoddess.god.entity;

import org.apache.struts2.json.annotations.JSON;

import com.godgoddess.base.entity.BaseEntity;

/**
 * @ClassName com.godgoddess.god.entity.TModelEntity
 * @Description t_model表实体类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 10:25:05
 * @version 1.0
 * @remark create by generator
 */

public class TModelEntity extends BaseEntity{

	private String modelemail;  //
	private java.util.Date modelcjsj;  //
	private java.util.Date modelbq;  //
	private java.util.Date modelbirthday;  //
	private double modelbust;  //
	private int modelage;  //
	private double modelheight;  //
	private String modelavatar;  //
	private String modelname;  //
	private String modelcup;  //
	private double modelweight;  //
	private String modelintroduction;  //
	private double modelwaist;  //
	private double modelhipline;  //
	private int modelsex;  //
	private String modelphone;  //
	private String modelnickname;  //
	private String id;  //
	
	public String getModelemail(){
		return modelemail;
	}
	public void setModelemail(String modelemail){
		this.modelemail = modelemail;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getModelcjsj(){
		return modelcjsj;
	}
	public void setModelcjsj(java.util.Date modelcjsj){
		this.modelcjsj = modelcjsj;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getModelbq(){
		return modelbq;
	}
	public void setModelbq(java.util.Date modelbq){
		this.modelbq = modelbq;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getModelbirthday(){
		return modelbirthday;
	}
	public void setModelbirthday(java.util.Date modelbirthday){
		this.modelbirthday = modelbirthday;
	}
	public double getModelbust(){
		return modelbust;
	}
	public void setModelbust(double modelbust){
		this.modelbust = modelbust;
	}
	public int getModelage(){
		return modelage;
	}
	public void setModelage(int modelage){
		this.modelage = modelage;
	}
	public double getModelheight(){
		return modelheight;
	}
	public void setModelheight(double modelheight){
		this.modelheight = modelheight;
	}
	public String getModelavatar(){
		return modelavatar;
	}
	public void setModelavatar(String modelavatar){
		this.modelavatar = modelavatar;
	}
	public String getModelname(){
		return modelname;
	}
	public void setModelname(String modelname){
		this.modelname = modelname;
	}
	public String getModelcup(){
		return modelcup;
	}
	public void setModelcup(String modelcup){
		this.modelcup = modelcup;
	}
	public double getModelweight(){
		return modelweight;
	}
	public void setModelweight(double modelweight){
		this.modelweight = modelweight;
	}
	public String getModelintroduction(){
		return modelintroduction;
	}
	public void setModelintroduction(String modelintroduction){
		this.modelintroduction = modelintroduction;
	}
	public double getModelwaist(){
		return modelwaist;
	}
	public void setModelwaist(double modelwaist){
		this.modelwaist = modelwaist;
	}
	public double getModelhipline(){
		return modelhipline;
	}
	public void setModelhipline(double modelhipline){
		this.modelhipline = modelhipline;
	}
	public int getModelsex(){
		return modelsex;
	}
	public void setModelsex(int modelsex){
		this.modelsex = modelsex;
	}
	public String getModelphone(){
		return modelphone;
	}
	public void setModelphone(String modelphone){
		this.modelphone = modelphone;
	}
	public String getModelnickname(){
		return modelnickname;
	}
	public void setModelnickname(String modelnickname){
		this.modelnickname = modelnickname;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
}