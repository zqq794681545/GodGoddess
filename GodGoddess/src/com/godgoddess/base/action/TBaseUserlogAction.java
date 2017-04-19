package com.godgoddess.base.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.RowBounds;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseUserlogEntity;
import com.godgoddess.base.service.TBaseUserlogService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName com.godgoddess.base.action.TBaseUserlogAction
 * @Description T_BASE_USERLOG表Action类
 * @author dzb@kingtopinfo.com
 * @date 2014-04-02 09:29:44
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service
public class TBaseUserlogAction extends ActionSupport implements ServletRequestAware {
	
	private HttpServletRequest request;
	@Autowired
	private TBaseUserlogService tBaseUserlogService;
	private List<TBaseUserlogEntity> rows = new ArrayList<TBaseUserlogEntity>();
	private TBaseUserlogEntity e = new TBaseUserlogEntity();
	private int page=0;
	private int total=0;
	
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

	public List<TBaseUserlogEntity> getRows() {
		return rows;
	}
	
	public TBaseUserlogEntity getE() {
		return e;
	}

	public void setE(TBaseUserlogEntity e) {
		this.e = e;
	}

	//分页显示
	public String selectPagination(){
		int _rows=10;
		String _rowsStr=request.getParameter("rows");
		if(_rowsStr != null)
			_rows=Integer.parseInt(request.getParameter("rows"));
		int start = (this.page-1)*_rows;
		this.total = tBaseUserlogService.selectCount(e);
		this.rows = tBaseUserlogService.selectPagination(e,new RowBounds(start,_rows));
		return SUCCESS;
		
	}

	/**
	* 以上为代码生成器自动生成
	*/
	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request=request;
	}
}