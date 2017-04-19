package com.godgoddess.base.entity;

import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseHolidaysEntity
 * @Description T_BASE_HOLIDAYS表实体类
 * @author 张宇然
 * @date 2016-10-31 10:51:58
 * @version 1.0
 * @remark create by generator
 */

public class TBaseHolidaysEntity extends BaseEntity{

	private String createperson;  //创建人
	private String holidayname;  //节假日名称
	private String remark;  //备注
	private String updateperson;  //更新人
	private String id;  //ID
	private int isholiday;  //是否节假日 1-是 0-否
	private java.util.Date createtime;  //创建时间
	private java.util.Date updatetime;  //更新时间
	private java.util.Date holidaydate;  //节假日日期
	private String holidaytype;  //节假日类型 1-休假 2-上班
	private int year;  //年份
	
	public String getCreateperson(){
		return createperson;
	}
	public void setCreateperson(String createperson){
		this.createperson = createperson;
	}
	public String getHolidayname(){
		return holidayname;
	}
	public void setHolidayname(String holidayname){
		this.holidayname = holidayname;
	}
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getUpdateperson(){
		return updateperson;
	}
	public void setUpdateperson(String updateperson){
		this.updateperson = updateperson;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public int getIsholiday(){
		return isholiday;
	}
	public void setIsholiday(int isholiday){
		this.isholiday = isholiday;
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
	@JSON(format="yyyy-MM-dd")
	public java.util.Date getHolidaydate(){
		return holidaydate;
	}
	public void setHolidaydate(java.util.Date holidaydate){
		this.holidaydate = holidaydate;
	}
	public String getHolidaytype(){
		return holidaytype;
	}
	public void setHolidaytype(String holidaytype){
		this.holidaytype = holidaytype;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
}