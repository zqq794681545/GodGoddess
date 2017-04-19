package com.godgoddess.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseUserRoleMappingEntity;
import com.godgoddess.base.service.TBaseUserRoleMappingService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName com.godgoddess.base.action.TBaseUserRoleMappingAction
 * @Description T_BASE_USER_ROLE_MAPPING表Action类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:21:47
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service
public class TBaseUserRoleMappingAction extends ActionSupport {
	
	@Autowired
	private TBaseUserRoleMappingService tBaseUserRoleMappingService;
	private TBaseUserRoleMappingEntity e = new  TBaseUserRoleMappingEntity();
	private int rows = 0;
	private String delIds;
	
	
	public TBaseUserRoleMappingEntity getE() {
		return e;
	}

	public void setE(TBaseUserRoleMappingEntity e) {
		this.e = e;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public String getDelIds() {
		return delIds;
	}

	public void setDelIds(String delIds) {
		this.delIds = delIds;
	}

	public String inserts(){
		
		this.rows = tBaseUserRoleMappingService.inserts(this.e);
		return SUCCESS;
	}
	
	public String deletes(){
		
		this.rows = tBaseUserRoleMappingService.deletesByRoidAndUserid(this.e);
		return SUCCESS;
	}
	
	/**
	* 以上为代码生成器自动生成
	*/
}