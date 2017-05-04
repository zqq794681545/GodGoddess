package com.godgoddess.god.action;

import com.github.pagehelper.PageHelper;
import com.godgoddess.god.service.TImgxqbService;
import com.godgoddess.god.entity.TImgxqbEntity;
import com.godgoddess.god.entity.TModelImggroupEntity;

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
 * @ClassName com.godgoddess.god.action.TImgxqbAction
 * @Description t_imgxqb表Action类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 16:10:16
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service("TImgxqbAction")
public class TImgxqbAction extends ActionSupport implements ServletRequestAware {
	
	private HttpServletRequest request;
	@Autowired
	private TImgxqbService tImgxqbService;
	
	private List<TImgxqbEntity> rows = new ArrayList<TImgxqbEntity>();
	private Map<String, Object> map = new HashMap<String, Object>(); 
	private TImgxqbEntity e = new TImgxqbEntity();
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
	public List<TImgxqbEntity> getRows() {
		return rows;
	}
	public TImgxqbEntity getE() {
		return e;
	}
	public void setE(TImgxqbEntity e) {
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
		this.total = tImgxqbService.getCount(e);
		this.rows = tImgxqbService.selectPagination(e,_rows,this.page);
		return SUCCESS;
	}
	public String selectPaginas(){
		Map<String, Object> data = new HashMap<String, Object>();
		int _rows = IntegerUtil.changeString2Int(request.getParameter("rows"));
		PageHelper.startPage(this.page,_rows);
		PageBean<TImgxqbEntity> page= new PageBean<TImgxqbEntity>(tImgxqbService.selectPaginas(this.e));;
		data.put("total", page.getTotal());
		data.put("rows", page.getList());
		this.map =new mapUtil().setMaputil("200", "请求成功", data);
		return SUCCESS;
	}
	
	/**
	 * 通过主键查询
	 */	
	public String selectByPkey(){
		this.e = tImgxqbService.selectByPkey(e.getId());
		return SUCCESS;
	}
	
	/**
	 * 新增
	 */	
	public String insert(){
		this.row = tImgxqbService.insert(this.e);
		return SUCCESS;
	}
	
	/**
	 * 编辑
	 */	
	public String update(){
		this.row = tImgxqbService.update(this.e);
		return SUCCESS;
	}
	
	/**
	 * 删除
	 */	
	public String deletes(){
		this.row = tImgxqbService.deletes(this.keys);
		return SUCCESS;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request = request;
	}
	
}