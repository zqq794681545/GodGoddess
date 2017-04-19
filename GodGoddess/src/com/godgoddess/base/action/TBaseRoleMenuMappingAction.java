package com.godgoddess.base.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseRoleMenuMappingEntity;
import com.godgoddess.base.service.TBaseRoleMenuMappingService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName com.godgoddess.base.action.TBaseRoleMenuMappingAction
 * @Description T_BASE_ROLE_MENU_MAPPING表Action类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:21:54
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service
public class TBaseRoleMenuMappingAction extends ActionSupport {
	
	@Autowired
	private TBaseRoleMenuMappingService tBaseRoleMenuMappingService;
	private TBaseRoleMenuMappingEntity e = new  TBaseRoleMenuMappingEntity();
	private int rows = 0;
	private List<TBaseRoleMenuMappingEntity> list = new ArrayList<TBaseRoleMenuMappingEntity>();
	
	public List<TBaseRoleMenuMappingEntity> getList() {
		return list;
	}

	public void setList(List<TBaseRoleMenuMappingEntity> list) {
		this.list = list;
	}
	
	public TBaseRoleMenuMappingEntity getE() {
		return e;
	}

	public void setE(TBaseRoleMenuMappingEntity e) {
		this.e = e;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public String insert(){
		this.rows = tBaseRoleMenuMappingService.insert(this.e);
		return SUCCESS;
	}
	
	public String delete(){
		this.rows = tBaseRoleMenuMappingService.deleteByRoleidAndMenuid(this.e);
		return SUCCESS;
	}
	
	public String selectByMenuid(){
		this.list = tBaseRoleMenuMappingService.selectByMenuid();
		return SUCCESS;
	}
	
}