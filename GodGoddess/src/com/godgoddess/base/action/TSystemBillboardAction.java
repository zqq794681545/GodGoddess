package com.godgoddess.base.action;

import com.godgoddess.base.service.TSystemBillboardService;
import com.godgoddess.base.entity.TSystemBillboardEntity;

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
 * @ClassName com.godgoddess.base.action.TSystemBillboardAction
 * @Description T_SYSTEM_BILLBOARD表Action类
 * @author dzb@kingtopinfo.com
 * @date 2016-10-12 10:33:25
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service("TSystemBillboardAction")
public class TSystemBillboardAction extends ActionSupport implements ServletRequestAware {
	
	private HttpServletRequest request;
	@Autowired
	private TSystemBillboardService tSystemBillboardService;
	
	private List<TSystemBillboardEntity> rows = new ArrayList<TSystemBillboardEntity>();
	private TSystemBillboardEntity e = new TSystemBillboardEntity();
	private String[] keys;
	private int row = 0;
	private int page = 0;
	private int total = 0;
	private String order;
	private String sort;
	private String system_billboard_id;
	
	public List<TSystemBillboardEntity> getRows() {
		return rows;
	}
	public TSystemBillboardEntity getE() {
		return e;
	}
	public void setE(TSystemBillboardEntity e) {
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
	public String getSystem_billboard_id() {
		return system_billboard_id;
	}
	public void setSystem_billboard_id(String system_billboard_id) {
		this.system_billboard_id = system_billboard_id;
	}
	
	/**
	 * 分页查询
	 */
	public String selectPagination(){
		int _rows = IntegerUtil.changeString2Int(request.getParameter("rows"));
		e.setSort(this.sort);
		e.setOrder(this.order);
		this.total = tSystemBillboardService.getCount(e);
		this.rows = tSystemBillboardService.selectPagination(e,_rows,this.page);
		return SUCCESS;
	}
	
	/**
	 * 通过主键查询
	 */	
	public String selectByPkey(){
		this.e = tSystemBillboardService.getByPkey(e.getSystem_billboard_id());
		return SUCCESS;
	}
	
	/**
	 * 新增
	 */	
	public String insert(){
		this.system_billboard_id = tSystemBillboardService.insert(this.e);
		return SUCCESS;
	}
	
	/**
	 * 编辑
	 */	
	public String update(){
		this.row = tSystemBillboardService.update(this.e);
		return SUCCESS;
	}
	
	/**
	 * 删除
	 */	
	public String deletes(){
		this.row = tSystemBillboardService.deletes(this.keys);
		return SUCCESS;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request = request;
	}
	
}