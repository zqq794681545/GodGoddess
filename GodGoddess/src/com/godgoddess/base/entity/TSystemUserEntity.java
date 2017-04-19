package com.godgoddess.base.entity;

import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.kingtopinfo.base.entity.TSystemUserEntity
 * @Description T_SYSTEM_USER表实体类
 * @author dzb@kingtopinfo.com
 * @date 2016-10-10 09:50:59
 * @version 1.0
 * @remark create by generator
 */

public class TSystemUserEntity {

	private int zztype;  //社会组织类型
	private String mobile;  //经办人移动电话
	private String account;  //帐号
	private String card;  //经办人身份证号码
	private String mail;  //经办人邮箱地址
	private String shzz_name;  //社会组织名称
	private int state;  //状态（0：未验证、1：正常、2：锁定）
	private String mailkey;  //邮箱验证码
	private String tyshxydm;  //统一社会信用代码
	private String shzz_id;  //社会组织编号
	private String password;  //密码
	private String contacts;  //经办人名称
	private java.util.Date createtime;  //创建时间
	private String system_user_id;  //系统用户表编号
	private String tel;  //经办人固定电话
	
	public int getZztype(){
		return zztype;
	}
	public void setZztype(int zztype){
		this.zztype = zztype;
	}
	public String getMobile(){
		return mobile;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getAccount(){
		return account;
	}
	public void setAccount(String account){
		this.account = account;
	}
	public String getCard(){
		return card;
	}
	public void setCard(String card){
		this.card = card;
	}
	public String getMail(){
		return mail;
	}
	public void setMail(String mail){
		this.mail = mail;
	}
	public String getShzz_name(){
		return shzz_name;
	}
	public void setShzz_name(String shzz_name){
		this.shzz_name = shzz_name;
	}
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state = state;
	}
	public String getMailkey(){
		return mailkey;
	}
	public void setMailkey(String mailkey){
		this.mailkey = mailkey;
	}
	public String getTyshxydm(){
		return tyshxydm;
	}
	public void setTyshxydm(String tyshxydm){
		this.tyshxydm = tyshxydm;
	}
	public String getShzz_id(){
		return shzz_id;
	}
	public void setShzz_id(String shzz_id){
		this.shzz_id = shzz_id;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getContacts(){
		return contacts;
	}
	public void setContacts(String contacts){
		this.contacts = contacts;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getCreatetime(){
		return createtime;
	}
	public void setCreatetime(java.util.Date createtime){
		this.createtime = createtime;
	}
	public String getSystem_user_id(){
		return system_user_id;
	}
	public void setSystem_user_id(String system_user_id){
		this.system_user_id = system_user_id;
	}
	public String getTel(){
		return tel;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
}