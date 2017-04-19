package com.godgoddess.base.action;

import com.godgoddess.base.service.TBaseMenuModuleMappingService;
import com.godgoddess.base.entity.TBaseMenuModuleMappingEntity;
import com.godgoddess.base.entity.TBaseRoleEntity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.godgoddess.base.util.IntegerUtil;

/**
 * @ClassName com.godgoddess.base.action.TBaseMenuModuleMappingAction
 * @Description T_BASE_MENU_MODULE_MAPPING表Action类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-03-21 09:32:54
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service("TBaseMenuModuleMappingAction")
public class TBaseMenuModuleMappingAction extends ActionSupport implements ServletRequestAware {
	
	private HttpServletRequest request;
	@Autowired
	private TBaseMenuModuleMappingService tBaseMenuModuleMappingService;
	
	private List<TBaseMenuModuleMappingEntity> rows = new ArrayList<TBaseMenuModuleMappingEntity>();
	private TBaseMenuModuleMappingEntity e = new TBaseMenuModuleMappingEntity();
	private String[] keys;
	private int row = 0;
	private int page = 0;
	private int total = 0;
	private String order;
	private String sort;
	
	
	
	public List<TBaseMenuModuleMappingEntity> getRows() {
		return rows;
	}
	public TBaseMenuModuleMappingEntity getE() {
		return e;
	}
	public void setE(TBaseMenuModuleMappingEntity e) {
		this.e = e;
	}
	public String[] getKeys() {
		return keys;
	}
	public void setKeys(String[] keys) {
		this.keys = keys;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
	/**
	 * 分页查询
	 */
	public String selectPagination(){
		int _rows = IntegerUtil.changeString2Int(request.getParameter("rows"));
		e.setSort(this.sort);
		e.setOrder(this.order);
		this.total = tBaseMenuModuleMappingService.getCount(e);
		this.rows = tBaseMenuModuleMappingService.selectPagination(e,_rows,this.page);
		return SUCCESS;
	}
	
	/**
	 * 通过主键查询
	 */	
	public String selectByPkey(){
		this.e = tBaseMenuModuleMappingService.selectByPkey(e.getId());
		return SUCCESS;
	}
	
	
	/**
	 * 新增
	 */	
	public String insert(){
		this.row = tBaseMenuModuleMappingService.insert(this.e);
		return SUCCESS;
	}
	
	/**
	 * 编辑
	 */	
	public String update(){
		this.row = tBaseMenuModuleMappingService.update(this.e);
		return SUCCESS;
	}
	
	/**
	 * 删除
	 */	
	public String deletes(){
		this.row = tBaseMenuModuleMappingService.deletes(this.keys);
		return SUCCESS;
	}
	
	public String deletemenuAndModule(){
		this.row = tBaseMenuModuleMappingService.deletemenuAndModule(this.e);
		return SUCCESS;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request = request;
	}
	
}