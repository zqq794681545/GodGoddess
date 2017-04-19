package com.godgoddess.base.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseTypeEntity;
import com.godgoddess.base.service.TBaseTypeService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName com.godgoddess.action.TBaseTypeAction
 * @Description T_BASE_TYPE表Action类
 * @author dzb@kingtopinfo.com
 * @date 2013-11-19 15:45:37
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service("TBaseTypeAction")
public class TBaseTypeAction extends ActionSupport {
	
	@Autowired
	private TBaseTypeService tBaseTypeService;
	private List<TBaseTypeEntity> node = new ArrayList<TBaseTypeEntity>();
	private TBaseTypeEntity e = new TBaseTypeEntity();
	private int rows = 0;
	private String[] keys;
	private TBaseTypeEntity np = new TBaseTypeEntity();
	
	public List<TBaseTypeEntity> getNode() {
		return node;
	}

	public void setNode(List<TBaseTypeEntity> node) {
		this.node = node;
	}

	public TBaseTypeEntity getE() {
		return e;
	}

	public void setE(TBaseTypeEntity e) {
		this.e = e;
	}

	public TBaseTypeEntity getNp() {
		return np;
	}

	public void setNp(TBaseTypeEntity np) {
		this.np = np;
	}
	
	public String[] getKeys() {
		return keys;
	}

	public void setKeys(String[] keys) {
		this.keys = keys;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public String selectByKey(){
		this.e = tBaseTypeService.selectByKey(e.getId());
		return SUCCESS;
	}
	
	public String selectByCode(){
		this.node = tBaseTypeService.selectByCode(e.getCode());
		return SUCCESS;
	}
	
	public String selectAllByCode(){
		this.node = tBaseTypeService.selectAllByCode(e.getCode());
		return SUCCESS;
	}
	
	public String selectByCodeAndValue(){
		this.e = tBaseTypeService.selectByCodeAndValue(e);
		return SUCCESS;
	}
	
	public String selectByQjxzqh(){
		this.node = tBaseTypeService.selectByQjxzqh(e);
		return SUCCESS;
	}
	
	public String deletes(){
		this.rows = tBaseTypeService.deletes(this.keys);
		return SUCCESS;
	}


	/**
	* 以上为代码生成器自动生成
	*/
	
	public String save(){
		
		this.rows=tBaseTypeService.save(e);
		return SUCCESS;
	}
	
	public String insert(){
		
		this.rows=tBaseTypeService.insert(e);
		return SUCCESS;
	}
	
	public String update(){
		
		this.rows=tBaseTypeService.update(e);
		return SUCCESS;
	}
	
	public String move(){
		this.rows=tBaseTypeService.move(e);
		return SUCCESS;
	}
	
	public String selectMenu(){
		this.node = tBaseTypeService.selectMenu(e.getType());
		return SUCCESS;
	}
	
	public String selectCountByPid(){
		this.rows=tBaseTypeService.selectCountByPid(e.getPid());
		return SUCCESS;
	}
	
	public String moveUpOrDown(){
		this.rows = tBaseTypeService.moveUpOrDown(this.e, this.np);
		return SUCCESS;
	}
	
	public String selectVerByCode(){
		
		this.e.setVer(tBaseTypeService.selectVerByCode(e.getCode()));
		return SUCCESS;
	}
	
	public String updateVerByCode(){
		
		this.rows = tBaseTypeService.updateVerByCode(e.getCode());
		return SUCCESS;
	}
	
	public String initComboxBox(){
		this.node = tBaseTypeService.selectNameAndValueByCode(e.getCode());
		return SUCCESS;
	}
}