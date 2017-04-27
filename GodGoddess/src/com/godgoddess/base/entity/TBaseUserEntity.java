package com.godgoddess.base.entity;

import java.io.Serializable;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseUserEntity
 * @Description T_BASE_USER表映射实体类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:21:43
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
public class TBaseUserEntity implements Serializable{
	
	private String id;
	private String phone;
	private int groupid;
	private int sex;
	private String password;
	private String nikename;
	private java.util.Date reg_time;
	private String avatar;
	private String email;
	private java.util.Date last_login_time;
	private java.util.Date start_vip_sj;
	private java.util.Date end_vip_sj;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNikename() {
		return nikename;
	}
	public void setNikename(String nikename) {
		this.nikename = nikename;
	}
	public java.util.Date getReg_time() {
		return reg_time;
	}
	public void setReg_time(java.util.Date reg_time) {
		this.reg_time = reg_time;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public java.util.Date getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(java.util.Date last_login_time) {
		this.last_login_time = last_login_time;
	}
	public java.util.Date getStart_vip_sj() {
		return start_vip_sj;
	}
	public void setStart_vip_sj(java.util.Date start_vip_sj) {
		this.start_vip_sj = start_vip_sj;
	}
	public java.util.Date getEnd_vip_sj() {
		return end_vip_sj;
	}
	public void setEnd_vip_sj(java.util.Date end_vip_sj) {
		this.end_vip_sj = end_vip_sj;
	}
	
	
	
//	private String password;
//	private int state;
//	private String username;
//	private String account;
//	private java.util.Date updatetime;
//	private String id;
//	private String roleid;
//	private String xzqh;
//	private String gid;
//	private String pid;
//	private String gname;
//	private String institutions;
//	
//	public String getInstitutions() {
//		return institutions;
//	}
//	public void setInstitutions(String institutions) {
//		this.institutions = institutions;
//	}
//	public String getGid() {
//		return gid;
//	}
//	public void setGid(String gid) {
//		this.gid = gid;
//	}
//	public String getPassword(){  
//		return password;  
//	}  
//	public void setPassword(String password){  
//		this.password = password;  
//	}  
//	public int getState(){  
//		return state;  
//	}  
//	public void setState(int state){  
//		this.state = state;  
//	}  
//	public String getUsername(){  
//		return username;  
//	}  
//	public void setUsername(String username){  
//		this.username = username;  
//	}  
//	public String getAccount(){  
//		return account;  
//	}  
//	public void setAccount(String account){  
//		this.account = account;  
//	}  
//	public java.util.Date getUpdatetime(){  
//		return updatetime;  
//	}  
//	public void setUpdatetime(java.util.Date updatetime){  
//		this.updatetime = updatetime;  
//	}  
//	public String getId(){  
//		return id;  
//	}  
//	public void setId(String id){  
//		this.id = id;  
//	}
//	public String getRoleid() {
//		return roleid;
//	}
//	public void setRoleid(String roleid) {
//		this.roleid = roleid;
//	}
//	public String getXzqh() {
//		return xzqh;
//	}
//	public void setXzqh(String xzqh) {
//		this.xzqh = xzqh;
//	}
//	/**
//	 * @return the pid
//	 */
//	public String getPid() {
//		return pid;
//	}
//	/**
//	 * @param pid the pid to set
//	 */
//	public void setPid(String pid) {
//		this.pid = pid;
//	}
//	/**
//	 * @return the gname
//	 */
//	public String getGname() {
//		return gname;
//	}
//	/**
//	 * @param gname the gname to set
//	 */
//	public void setGname(String gname) {
//		this.gname = gname;
//	}  
	
}