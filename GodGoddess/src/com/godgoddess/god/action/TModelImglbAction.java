package com.godgoddess.god.action;

import com.github.pagehelper.PageHelper;
import com.godgoddess.god.service.TModelImglbService;
import com.godgoddess.god.entity.TModelImglbEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.godgoddess.base.util.IntegerUtil;
import com.godgoddess.base.util.PageBean;
import com.godgoddess.base.util.mapUtil;

/**
 * @ClassName com.godgoddess.god.action.TModelImglbAction
 * @Description t_model_imglb表Action类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 14:08:56
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service("TModelImglbAction")
public class TModelImglbAction extends ActionSupport implements ServletRequestAware {
	
	private HttpServletRequest request;
	@Autowired
	private TModelImglbService tModelImglbService;
	
	private Map<String, Object> map = new HashMap<String, Object>(); 
	private List<TModelImglbEntity> rows = new ArrayList<TModelImglbEntity>();
	private TModelImglbEntity e = new TModelImglbEntity();
	private String[] keys;
	private int row = 0;
	private int page = 0;
	private int total = 0;
	private String order;
	private String sort;
	
	
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public List<TModelImglbEntity> getRows() {
		return rows;
	}
	public TModelImglbEntity getE() {
		return e;
	}
	public void setE(TModelImglbEntity e) {
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
		this.total = tModelImglbService.getCount(e);
		this.rows = tModelImglbService.selectPagination(e,2,this.page);
		return SUCCESS;
	}
	public String selectAll(){
		int _rows = IntegerUtil.changeString2Int(request.getParameter("rows"));
		Map<String, Object> data = new HashMap<String, Object>();
		 PageHelper.startPage(this.page,_rows);
		 PageBean<TModelImglbEntity> page= new PageBean<TModelImglbEntity>(tModelImglbService.selectAll());;
		data.put("total", page.getTotal());
		data.put("rows", page.getList());
		this.map =new mapUtil().setMaputil("200", "请求成功", data);

		return SUCCESS;
	}
	
	
	/**
	 * 通过主键查询
	 */	
	public String selectByPkey(){
		this.e = tModelImglbService.selectByPkey(e.getId());
		return SUCCESS;
	}
	
	/**
	 * 新增
	 */	
	public String insert(){
		this.row = tModelImglbService.insert(this.e);
		return SUCCESS;
	}
	
	/**
	 * 编辑
	 */	
	public String update(){
		this.row = tModelImglbService.update(this.e);
		return SUCCESS;
	}
	
	/**
	 * 删除
	 */	
	public String deletes(){
		this.row = tModelImglbService.deletes(this.keys);
		return SUCCESS;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request = request;
	}
	
}