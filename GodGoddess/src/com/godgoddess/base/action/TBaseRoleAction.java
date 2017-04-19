package com.godgoddess.base.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseRoleEntity;
import com.godgoddess.base.service.TBaseRoleService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName com.godgoddess.base.action.TBaseRoleAction
 * @Description T_BASE_ROLE表Action类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:22:06
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service
public class TBaseRoleAction extends ActionSupport {
	
	@Autowired
	private TBaseRoleService tBaseRoleService;
	private List<TBaseRoleEntity> node = new ArrayList<TBaseRoleEntity>();
	private TBaseRoleEntity e = new TBaseRoleEntity() ;
	private int rows = 0;
	
	public List<TBaseRoleEntity> getNode() {
		return node;
	}

	public void setNode(List<TBaseRoleEntity> node) {
		this.node = node;
	}
	
	public TBaseRoleEntity getE() {
		return e;
	}

	public void setE(TBaseRoleEntity e) {
		this.e = e;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	public String select(){
		this.node = tBaseRoleService.select();
		return SUCCESS;
	}
	
	public String selectByKey(){
		this.e = tBaseRoleService.selectByKey(e.getId());
		return SUCCESS;
	}
	
	public String insert(){
		this.rows = tBaseRoleService.insert(this.e);
		return SUCCESS;
	}
	
	public String update(){
		this.rows = tBaseRoleService.update(this.e);
		return SUCCESS;
	}
	
	public String move(){
		this.rows = tBaseRoleService.move(this.e);
		return SUCCESS;
	}
	
	public String delete(){
		this.rows = tBaseRoleService.delete(e.getId());
		return SUCCESS;
	}
	
	public String selectAddedMenuRoles(){
		this.node = tBaseRoleService.selectAddedMenuRoles(e.getMenuid());
		return SUCCESS;
	}
	
	public String selectMKMenuRoles(){
		this.node = tBaseRoleService.selectMKMenuRoles(e.getMenuid());
		return SUCCESS;
	}
	
	public String selectAddedHelpRoles(){
		this.node = tBaseRoleService.selectAddedHelpRoles(e.getMenuid());
		return SUCCESS;
	}
	/**
	* 以上为代码生成器自动生成
	*/
	
}