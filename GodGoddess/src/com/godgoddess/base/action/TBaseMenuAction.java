package com.godgoddess.base.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseMenuEntity;
import com.godgoddess.base.service.TBaseMenuService;
import com.godgoddess.base.service.TBaseRoleService;
import com.godgoddess.base.util.UserBase;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName com.godgoddess.base.action.TBaseMenuAction
 * @Description T_BASE_MENU表Action类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-20 09:12:37
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service
public class TBaseMenuAction extends ActionSupport {
	
	@Autowired
	private TBaseMenuService tBaseMenuService;
	@Autowired
	private TBaseRoleService tBaseRoleService;
	private List<TBaseMenuEntity> node = new ArrayList<TBaseMenuEntity>();
	private TBaseMenuEntity e = new  TBaseMenuEntity();
	private int rows = 0;
	private String data = null;
	private List<String> list = new ArrayList<String>();
	private TBaseMenuEntity np = new TBaseMenuEntity();
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<TBaseMenuEntity> getNode() {
		return node;
	}

	public void setNode(List<TBaseMenuEntity> node) {
		this.node = node;
	}
	
	public TBaseMenuEntity getE() {
		return e;
	}

	public void setE(TBaseMenuEntity e) {
		this.e = e;
	}

	public TBaseMenuEntity getNp() {
		return np;
	}

	public void setNp(TBaseMenuEntity np) {
		this.np = np;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	public String select(){
		this.node = tBaseMenuService.select();
		return SUCCESS;
	}
	public String selectroleOfMenu(){
		this.node = tBaseMenuService.selectroleOfMenu(e.getRoleid());
		return SUCCESS;
	}
	
	public String selectByKey(){
		this.e = tBaseMenuService.selectByKey(e.getId());
		return SUCCESS;
	}
	
	public String insert(){
		this.rows = tBaseMenuService.insert(this.e);
		return SUCCESS;
	}
	
	public String update(){
		this.rows = tBaseMenuService.update(this.e);
		return SUCCESS;
	}
	
	public String move(){
		this.rows = tBaseMenuService.move(this.e);
		return SUCCESS;
	}
	
	public String delete(){
		this.rows = tBaseMenuService.delete(e.getId());
		return SUCCESS;
	}
	
	
	/**
	* 以上为代码生成器自动生成
	*/
	public String selectByRole(){
		String username = UserBase.getUsername();
		List<String> roleids = tBaseRoleService.selectRoleIdByAccount(username);
		this.node = tBaseMenuService.selectByRole(roleids);
		return SUCCESS;
	}
	
	public String moveUpOrDown(){
		this.rows = tBaseMenuService.moveUpOrDown(this.e,this.np);
		return SUCCESS;
	}
	
	public String selectAction(){
		this.node = tBaseMenuService.selectAction(e.getPid());
		return SUCCESS;
	}
	
	public String urlIfExist(){
		this.rows = tBaseMenuService.urlIfExist(this.e);
		return SUCCESS;
	}
	
}