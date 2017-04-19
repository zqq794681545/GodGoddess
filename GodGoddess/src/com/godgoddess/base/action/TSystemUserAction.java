package com.godgoddess.base.action;

import com.godgoddess.base.service.TSystemUserService;
import com.godgoddess.base.entity.TSystemUserEntity;

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
 * @ClassName com.godgoddess.base.action.TSystemUserAction
 * @Description T_SYSTEM_USER表Action类
 * @author dzb@kingtopinfo.com
 * @date 2016-10-10 09:50:59
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service("TSystemUserAction")
public class TSystemUserAction extends ActionSupport implements ServletRequestAware {
	
	private HttpServletRequest request;
	@Autowired
	private TSystemUserService tSystemUserService;
	
	private List<TSystemUserEntity> rows = new ArrayList<TSystemUserEntity>();
	private TSystemUserEntity e = new TSystemUserEntity();
	private String[] keys;
	private int row = 0;
	private int page = 0;
	private int total = 0;
	
	public List<TSystemUserEntity> getRows() {
		return rows;
	}
	public TSystemUserEntity getE() {
		return e;
	}
	public void setE(TSystemUserEntity e) {
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
	
	/**
	 * 分页查询
	 */
	public String selectPagination(){
		int _rows = IntegerUtil.changeString2Int(request.getParameter("rows"));
		this.total = tSystemUserService.getCount(e);
		this.rows = tSystemUserService.selectPagination(e,_rows,this.page);
		return SUCCESS;
	}
	
	/**
	 * 通过主键查询
	 */	
	public String selectByPkey(){
		this.e = tSystemUserService.getByPkey(e.getSystem_user_id());
		return SUCCESS;
	}
	
	/**
	 * 新增
	 */	
	public String insert(){
		this.row = tSystemUserService.insert(this.e);
		return SUCCESS;
	}
	
	/**
	 * 编辑
	 */	
	public String update(){
		this.row = tSystemUserService.update(this.e);
		return SUCCESS;
	}
	
	/**
	 * 删除
	 */	
	public String deletes(){
		this.row = tSystemUserService.deletes(this.keys);
		return SUCCESS;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request = request;
	}
	
}