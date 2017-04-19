package com.godgoddess.base.entity;

import java.util.Date;

import org.apache.struts2.json.annotations.JSON;

/**
 * @ClassName com.kingtopinfo.base.entity.TBaseUserlogEntity
 * @Description T_BASE_USERLOG表映射实体类
 * @author dzb@kingtopinfo.com
 * @date 2014-04-02 09:29:44
 * @version 1.0
 * @remark create by generator
 */

public class TBaseUserlogEntity {
	
	private java.util.Date logtime;
	private String remoteaddress;
	private String account;
	private String userlogid;
	private int type;
	private String sessionid;
	
	//新增属性
	private Date logtimeStart = null;
	private Date logtimeEnd = null;
	
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public java.util.Date getLogtime(){  
		return logtime;  
	}  
	public void setLogtime(java.util.Date logtime){  
		this.logtime = logtime;  
	}  
	public String getRemoteaddress(){  
		return remoteaddress;  
	}  
	public void setRemoteaddress(String remoteaddress){  
		this.remoteaddress = remoteaddress;  
	}  
	public String getAccount(){  
		return account;  
	}  
	public void setAccount(String account){  
		this.account = account;  
	}  
	public String getUserlogid(){  
		return userlogid;  
	}  
	public void setUserlogid(String userlogid){  
		this.userlogid = userlogid;  
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public Date getLogtimeStart() {
		return logtimeStart;
	}
	public void setLogtimeStart(Date logtimeStart) {
		this.logtimeStart = logtimeStart;
	}
	public Date getLogtimeEnd() {
		return logtimeEnd;
	}
	public void setLogtimeEnd(Date logtimeEnd) {
		this.logtimeEnd = logtimeEnd;
	}  
	
}