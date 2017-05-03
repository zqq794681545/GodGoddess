package com.godgoddess.base.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.RowBounds;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseUserEntity;
import com.godgoddess.base.security.RefreshResourceService;
import com.godgoddess.base.service.TBaseUserService;
import com.godgoddess.base.util.UserBase;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName com.godgoddess.base.action.TBaseUserAction
 * @Description T_BASE_USER表Action类
 * @author Chenhb@kingtopinfo.com
 * @date 2014-02-18 09:21:43
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service
public class TBaseUserAction extends ActionSupport implements ServletRequestAware,ServletResponseAware {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	@Autowired
	private Memory memory;
	@Autowired
	private TBaseUserService tBaseUserService;
	@Autowired
	private TBaseFileAction tBaseFileAction;
	private RefreshResourceService refreshResourceService;
	private Map<String, Object> map = new HashMap<String, Object>(); 
	private List<TBaseUserEntity> rows = new ArrayList<TBaseUserEntity>();
	private String str;
	private TBaseUserEntity e = new TBaseUserEntity();
	private int row = 0;
	private int page = 0;
	private int total = 0;
	private String[] keys;
	
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public TBaseUserEntity getE() {
		return e;
	}

	public void setE(TBaseUserEntity e) {
		this.e = e;
	}

	public List<TBaseUserEntity> getRows() {
		return rows;
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

	public String[] getKeys() {
		return keys;
	}

	public void setKeys(String[] keys) {
		this.keys = keys;
	}
	
	public String selectone(){
		this.str="逸群啊逸群";
	
	return SUCCESS;
	}
	public String selecttwo(){
		this.str="逸群啊逸群111";
	
		return SUCCESS;
	}
//	public String select(){
//		this.rows = tBaseUserService.select();
//		return SUCCESS;
//	}
//	
//	public String selectByKey(){
//		this.e = tBaseUserService.selectByKey(e.getId());
//		return SUCCESS;
//	}
	public String getAcode(){
		int _row = getRandNum(100000,999999);
		memory.clearLoginInfoBySeed("acode");
		memory.setValue("acode", _row,300,0);
		this.row = _row;
		return SUCCESS;
	}
	public String getPassword(){
		int _row = tBaseUserService.selectName(e.getPhone());
		if(_row >0 && memory.getValue("acode").equals(e.getAcode())){
			 this.row=tBaseUserService.updatePassword(e);
			 if(this.row ==1){
				 setMaputil("200","修改密码成功",null);
			 }
		}
		else{
			setMaputil("400","该号码还没有注册",null);
		}
		return SUCCESS;
	}
	public static int getRandNum(int min, int max) {
	    int randNum = min + (int)(Math.random() * ((max - min) + 1));
	    return randNum;
	}
	public String selectArray(){
		
		String str = "";
//		str = tBaseFileAction.downloadByFilePath("F:\\ios-7.png");
		ArrayList<String> data = new ArrayList<String>();
		ArrayList<Object> data1 = new ArrayList<Object>();
		data.add("F:\\tp\\tt_11.jpg");
		data.add("F:\\tp\\tt_12.jpg");
		data.add("F:\\tp\\tt_13.jpg");
		data.add("F:\\tp\\tt_14.jpg");
		data.add("F:\\tp\\tt_15.jpg");
		data.add("F:\\tp\\tt_16.jpg");
		data.add("F:\\tp\\tt_17.jpg");
		data.add("F:\\tp\\tt_18.jpg");
		data.add("F:\\tp\\tt_19.jpg");
		data.add("F:\\tp\\tt_110.jpg");
//		for(int i=1;i<=12;i++){
//			data1.add(tBaseFileAction.downloadByFilePath(data.get(i)));
//		}
		System.out.println("------------------"+e.getSex()+"-----------------------");
		tBaseFileAction.downloadByFilePath(data.get(e.getSex()),response);
		
//		setMaputil("200",str,null);
		return null;
	}
	
	public String register(){
		int row = tBaseUserService.selectName(e.getPhone());
		if(row >0){
//			ArrayList<String> data = new ArrayList<String>();
//			data.add("2222");
//			data.add("2222233");
//			Map<String, Object>  _map= new HashMap<String, Object>();
//			_map.put("list", data);
			setMaputil1("400","该号码已被注册，请重新输入手机号码",null);
		}
		else{
			this.row = tBaseUserService.insert(this.e);
			if(row ==1 ){
				setMaputil("200","注册成功",null);
			}
			else{
				setMaputil("400","注册失败",null);
			}
		}
		return SUCCESS;
	}
	public String updateNiCAndLogo(){
		this.row = tBaseUserService.updateNiCAndLogo(e);
		if(this.row >0){
			setMaputil("200","设置成功",null);
		}else{
			setMaputil("400","设置失败",null);
		}
		return SUCCESS;
	}
	public String updatePassword(){
		this.row = tBaseUserService.updatePassword(e);
		if(this.row >0){
			setMaputil("200","修改密码成功",null);
		}else{
			setMaputil("400","修改密码失败",null);
		}
		return SUCCESS;
	}
	public Map<String, Object> setMaputil(String code,String massage,ArrayList<?> data) {
		
		this.map.put("code", code);
		this.map.put("massage", massage);
		this.map.put("data", data);
		return this.map;
	}
	public Map<String, Object> setMaputil1(String code,String massage,Map<String, Object> map1) {
		
		this.map.put("code", code);
		this.map.put("massage", massage);
		this.map.put("data", map1);
		return this.map;
	}
	
	


	
//	
//	public String update(){
//		this.row = tBaseUserService.update(this.e);
//		return SUCCESS;
//	}
//	
//	public String updatePassword(){
//		this.row = tBaseUserService.updatePassword(this.e);
//		return SUCCESS;
//	}

//	public String deletes(){
//		this.row = tBaseUserService.deletes(this.keys);
//		return SUCCESS;
//	}
//	
//	/**
//	* 以上为代码生成器自动生成
//	*/
//	public String selectPagination(){
//		int _rows=10;
//		String _rowsStr=request.getParameter("rows");
//		if(_rowsStr != null)
//			_rows=Integer.parseInt(request.getParameter("rows"));
//		int start = (this.page-1)*_rows;
//		RowBounds rowBounds = new RowBounds(start,_rows);
//		this.total = tBaseUserService.getCount(e);
//		this.rows = tBaseUserService.selectPagination(e,rowBounds);
//		return SUCCESS;
//	}

	
//	public String selectUnauthorizedPagination(){
//		//设置分页信息
//		int _rows=10;
//		String _rowsStr=request.getParameter("rows");
//		if(_rowsStr != null)
//			_rows=Integer.parseInt(request.getParameter("rows"));
//		int start = (this.page-1)*_rows;
//		RowBounds rowBounds = new RowBounds(start,_rows);
//		this.total = tBaseUserService.getUnauthorizedCount(e);
//		this.rows = tBaseUserService.selectUnauthorizedPagination(e,rowBounds);
//		return SUCCESS;
//	}
	
//	public String selectAuthorizedPagination(){
//		//设置分页信息
//		int _rows=10;
//		String _rowsStr=request.getParameter("rows");
//		if(_rowsStr != null)
//			_rows=Integer.parseInt(request.getParameter("rows"));
//		int start = (this.page-1)*_rows;
//		RowBounds rowBounds = new RowBounds(start,_rows);
//		this.total = tBaseUserService.getAuthorizedCount(e);
//		this.rows = tBaseUserService.selectAuthorizedPagination(e,rowBounds);
//		return SUCCESS;
//	}
	
	public String selectByAccount(){
		this.e = tBaseUserService.selectByAccount(e.getPhone());
		return SUCCESS;
	}
//	public String selectByAccountnum(){
//		this.row = tBaseUserService.selectByAccountnum(e.getAccount());
//		return SUCCESS;
//	}
//	
	public String selectBaseUserByAccount(){
		
		String _account = UserBase.getUserInfo().getUsername();
		this.e = tBaseUserService.selectByAccount(_account);
		return SUCCESS;
	}
	
	public String refreshCache(){
		
		refreshResourceService.refreshCache();
		return SUCCESS;
	}
	
	
//	//查询未加入机构用户
//	public String selectUnaddGroupUser(){
//		int _rows=10;
//		String _rowsStr=request.getParameter("rows");
//		if(_rowsStr != null)
//			_rows=Integer.parseInt(request.getParameter("rows"));
//		int start = (this.page-1)*_rows;
//		RowBounds rowBounds = new RowBounds(start,_rows);
//		this.total = tBaseUserService.getUnaddGroupUserCount(e);
//		this.rows = tBaseUserService.selectUnaddGroupUserPagination(e,rowBounds);
//		return SUCCESS;
//	}
//	
//	//查询已加入机构用户
//	public String selectAddGroupUser(){
//		int _rows=10;
//		String _rowsStr=request.getParameter("rows");
//		if(_rowsStr != null)
//			_rows=Integer.parseInt(request.getParameter("rows"));
//		int start = (this.page-1)*_rows;
//		RowBounds rowBounds = new RowBounds(start,_rows);
//		this.total = tBaseUserService.getAddGroupUserCount(e);
//		this.rows = tBaseUserService.selectAddGroupUserPagination(e,rowBounds);
//		return SUCCESS;
//	}
//	
//	//加入机构
//	public String AddGroupByGid(){
//		String[] userid = e.getId().split(",");
//		String gid = e.getGid();
//		if(userid.length > 0 && userid != null && !"".equals(userid)){
//			for(int i=0;i<userid.length;i++){
//				this.row = tBaseUserService.AddGroupByGid(userid[i],gid);
//			}
//		}
//		return SUCCESS;
//	}
//		
//	//加入机构
//	public String DropGroupByGid(){
//		String[] userid = e.getId().split(",");
//		if(userid.length > 0 && userid != null && !"".equals(userid)){
//			for(int i=0;i<userid.length;i++){
//				this.row = tBaseUserService.DropGroupByGid(userid[i]);
//			}
//		}
//		return SUCCESS;
//	}
//		
//	//根据gid查询成员信息
//	public String selectUserByGid(){
//		this.rows = tBaseUserService.selectUserByGid(e.getGid());
//		return SUCCESS;
//	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request = request;
	}
	
	@Override
	public void setServletResponse(HttpServletResponse response) {	
		this.response = response ;
	}
}