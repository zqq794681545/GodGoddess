package com.godgoddess.base.action;

import com.godgoddess.base.service.TTypeService;
import com.godgoddess.base.entity.TTypeEntity;

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
 * @ClassName com.godgoddess.base.action.TTypeAction
 * @Description t_type表Action类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 11:37:24
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service("TTypeAction")
public class TTypeAction extends ActionSupport implements ServletRequestAware {
	
	private HttpServletRequest request;
	@Autowired
	private TTypeService tTypeService;
	
	private List<TTypeEntity> rows = new ArrayList<TTypeEntity>();
	private TTypeEntity e = new TTypeEntity();
	private String[] keys;
	private int row = 0;
	private int page = 0;
	private int total = 0;
	private String order;
	private String sort;
	
	public List<TTypeEntity> getRows() {
		return rows;
	}
	public TTypeEntity getE() {
		return e;
	}
	public void setE(TTypeEntity e) {
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
		this.total = tTypeService.getCount(e);
		this.rows = tTypeService.selectPagination(e,_rows,this.page);
		return SUCCESS;
	}
	
	/**
	 * 通过主键查询
	 */	
	public String selectByPkey(){
		this.e = tTypeService.selectByPkey(e.getId());
		return SUCCESS;
	}
	
	/**
	 * 新增
	 */	
	public String insert(){
		this.row = tTypeService.insert(this.e);
		return SUCCESS;
	}
	
	/**
	 * 编辑
	 */	
	public String update(){
		this.row = tTypeService.update(this.e);
		return SUCCESS;
	}
	
	/**
	 * 删除
	 */	
	public String deletes(){
		this.row = tTypeService.deletes(this.keys);
		return SUCCESS;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request = request;
	}
	
}