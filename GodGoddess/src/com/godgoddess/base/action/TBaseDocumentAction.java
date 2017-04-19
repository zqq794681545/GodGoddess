package com.godgoddess.base.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;





import com.godgoddess.base.entity.TBaseDocumentEntity;
import com.godgoddess.base.service.TBaseDocumentService;
import com.godgoddess.base.util.IntegerUtil;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName com.godgoddess.base.action.TBaseDocumentAction
 * @Description T_BASE_DOCUMENT表Action类
 * @author dzb@kingtopinfo.com
 * @date 2016-10-14 13:49:04
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service("TBaseDocumentAction")
public class TBaseDocumentAction extends ActionSupport implements ServletRequestAware{
	
	private HttpServletRequest request;
	@Autowired
	private TBaseDocumentService tBaseDocumentService;
	
	private List<TBaseDocumentEntity> rows = new ArrayList<TBaseDocumentEntity>();
	private TBaseDocumentEntity e = new TBaseDocumentEntity();
	private String[] keys;
	private int row = 0;
	private int page = 0;
	private int total = 0;
	
	private File[] file;
	private String[] fileFileName;
	private String[] fileContentType;
	
	private String fileName;
	private InputStream downloadFile;
	
	public List<TBaseDocumentEntity> getRows() {
		return rows;
	}
	public TBaseDocumentEntity getE() {
		return e;
	}
	public void setE(TBaseDocumentEntity e) {
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
	public File[] getFile() {
		return file;
	}
	public void setFile(File[] file) {
		this.file = file;
	}
	public String[] getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String[] fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String[] getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String[] fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public InputStream getDownloadFile() {
		
		return downloadFile;
	}
	
	/**
	 * 分页查询
	 */
	public String selectPagination(){
		
		int _rows = IntegerUtil.changeString2Int(request.getParameter("rows"));
		this.total = tBaseDocumentService.getCount(e);
		this.rows = tBaseDocumentService.selectPagination(e,_rows,this.page);
		return SUCCESS;
	}
	
	/**
	 * 通过主键查询
	 */	
	public String selectByPkey(){
		this.e = tBaseDocumentService.getByPkey(e.getBase_document_id());
		return SUCCESS;
	}
	
	public String upload(){
		
		this.row = tBaseDocumentService.upload(e.getSrc_id(), this.file, this.fileFileName, this.fileContentType);
		return SUCCESS;
	}
	
	public String download(){
		
		TBaseDocumentEntity oTBaseDocumentEntity = tBaseDocumentService.getByPkey(e.getBase_document_id());
		try {
			this.fileName = new String(oTBaseDocumentEntity.getName().getBytes("GBK"), "ISO8859-1" );
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		File file = new File(oTBaseDocumentEntity.getPath());
		try {
			this.downloadFile =  new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		return SUCCESS;
	}
	
	/**
	 * 删除
	 */	
	public String deletes(){
		this.row = tBaseDocumentService.deletes(this.keys);
		return SUCCESS;
	}
	
	public String selectBySrcId(){
		
		this.rows = tBaseDocumentService.selectBySrcId(e.getSrc_id());
		return SUCCESS;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request = request;
	}
	
}