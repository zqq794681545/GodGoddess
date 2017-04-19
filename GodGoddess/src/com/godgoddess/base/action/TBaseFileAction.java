package com.godgoddess.base.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseFileEntity;
import com.godgoddess.base.service.TBaseFileService;
import com.godgoddess.base.util.FilePathUtil;
import com.godgoddess.base.util.FileUtil;
import com.godgoddess.base.util.IntegerUtil;
import com.godgoddess.base.util.UserBase;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName com.godgoddess.base.action.TBaseFileAction
 * @Description T_BASE_FILE表Action类
 * @author 林祥聪  lxcl@kingtopinfo.com
 * @date 2016-10-26 16:19:23
 * @version 1.0
 * @remark create by generator
 */

@SuppressWarnings("serial")
@Scope("prototype")
@Service("TBaseFileAction")
public class TBaseFileAction extends ActionSupport implements ServletRequestAware ,ServletResponseAware{
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	@Autowired
	private TBaseFileService tBaseFileService;
	
	private List<TBaseFileEntity> rows = new ArrayList<TBaseFileEntity>();
	private TBaseFileEntity e = new TBaseFileEntity();
	private String[] keys;
	private int row = 0;
	private int page = 0;
	private int total = 0;
	private String order;
	private String sort;
	
	private File upload;
	private String uploadFileName;
	private int chunk;
	private int chunks;
	//下载地址或fileid
	private String filePath;
	private String fileid;
	//删除附件id
	private String delids;
	private String operatype;
	private String operaid;
	private String name;
	
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public int getChunk() {
		return chunk;
	}
	public void setChunk(int chunk) {
		this.chunk = chunk;
	}
	public int getChunks() {
		return chunks;
	}
	public void setChunks(int chunks) {
		this.chunks = chunks;
	}
	public String getFileid() {
		return fileid;
	}
	public void setFileid(String fileid) {
		this.fileid = fileid;
	}
	public String getDelids() {
		return delids;
	}
	public void setDelids(String delids) {
		this.delids = delids;
	}
	public String getOperatype() {
		return operatype;
	}
	public void setOperatype(String operatype) {
		this.operatype = operatype;
	}
	public String getOperaid() {
		return operaid;
	}
	public void setOperaid(String operaid) {
		this.operaid = operaid;
	}
	public List<TBaseFileEntity> getRows() {
		return rows;
	}
	public TBaseFileEntity getE() {
		return e;
	}
	public void setE(TBaseFileEntity e) {
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
		this.total = tBaseFileService.getCount(e);
		this.rows = tBaseFileService.selectPagination(e,_rows,this.page);
		return SUCCESS;
	}
	
	/**
	 * 通过主键查询
	 */	
	public String selectByPkey(){
		this.e = tBaseFileService.selectByPkey(e.getFileid());
		return SUCCESS;
	}
	
	/**
	 * 新增
	 */	
	public String insert(){
		this.row = tBaseFileService.insert(this.e);
		return SUCCESS;
	}
	
	/**
	 * 编辑
	 */	
	public String update(){
		this.row = tBaseFileService.update(this.e);
		return SUCCESS;
	}
	
	/**
	 * 删除
	 */	
	public String deletes(){
		this.row = tBaseFileService.deletes(this.keys);
		return SUCCESS;
	}
	
	/**
	 * 根据operaid删除
	 */	
	public String deleteByOperaids(){
		this.row = tBaseFileService.deleteByOperaids(this.keys);
		return SUCCESS;
	}
	
	/**
	 * Description :上传附件
	 * @author lxc
	 * Create at @2016年10月27日.上午9:08:52
	 */
	public String upload() throws Exception {
		//文件保存路径
//		String dstPath = ServletActionContext.getServletContext().getRealPath("/files");
		String dstPath = "";
		if("PW_FILE".equals(operatype)){
			dstPath = ServletActionContext.getServletContext().getRealPath("")+"/files";
		}else{
			dstPath = FilePathUtil.getFilePath("default_Path");
		}
		//创建文件存放路径
		FileUtil.creatPath(dstPath);
		//创建目标文件对象
		File dstFile = new File(dstPath+"\\"+this.getName());

		// 文件已存在（上传了同名的文件）
		if (chunk == 0 && dstFile.exists()) {
			dstFile.delete();
			dstFile = new File(dstPath);
		}	
		FileUtil.copy(this.upload, dstFile);
		if (chunk == chunks - 1) {
			// 完成一整个文件;
			TBaseFileEntity e = new TBaseFileEntity();
			e.setCjr(UserBase.getZwUserName());//中文名称 用户名
			e.setRemark("");
			e.setFilesize(dstFile.length());
			e.setFilename(uploadFileName);
			String extend = uploadFileName.substring(uploadFileName.lastIndexOf("."));
			e.setExtend(extend);
			e.setState(1);
			e.setOperatype(operatype);
			e.setOperaid(operaid);
			if("PW_FILE".equals(operatype)){
				e.setFilepath("/phjg/files/"+this.getName());
			}else{
				e.setFilepath(dstFile.getPath());
			}
			tBaseFileService.insert(e);
		}
		return SUCCESS;
	}
	
	/**
	 * Description :文件下载    判断文件是否存在
	 * @author lxc   
	 * Create at @2016年10月27日.上午11:29:07
	 */
	public void downloadByFilePath(){
		try {
			TBaseFileEntity e = tBaseFileService.selectByFilePath(filePath);
			String fileName = e.getFilename();
			String dstPath = filePath;
			File file = new File(dstPath);
			//1.设置文件ContentType类型，这样设置，会自动判断下载文件类型 
			response.setContentType("multipart/form-data");
			//2.设置文件头：最后一个参数是设置下载文件名(假如我们叫a.pdf)  
			response.setHeader("Content-Disposition", "attachment;fileName="+fileName);
			// 以流的形式下载文件。
			InputStream fis = new BufferedInputStream(new FileInputStream(dstPath));
			// 清空response
			response.reset();
			// 设置response的Header
			response.setHeader( "Content-Disposition", "attachment;filename=" + new String(fileName.getBytes("gb2312"), "ISO8859-1" )); 
			response.addHeader("Content-Length", "" + file.length());
			OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
			response.setContentType("application/octet-stream");
			//流缓冲区
			byte[] buffer = new byte[1024];  
            while (fis.read(buffer) != -1) {  
            	toClient.write(buffer);  
                buffer = new byte[1024];  
            }
            //释放资源
			fis.close();
			toClient.flush();
			toClient.close();     	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Description :根据流程的文件类型与id查询图片
	 * @author lxc
	 * Create at @2016年10月28日.上午9:02:18
	 */
	public String selectByOperatypeAndOperaid(){
		this.rows = tBaseFileService.selectByOperatypeAndOperaid(operatype,operaid);
		return SUCCESS;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request = request;
	}
	
	@Override
	public void setServletResponse(HttpServletResponse response) {	
		this.response = response ;
	}
}