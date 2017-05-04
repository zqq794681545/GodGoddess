package com.godgoddess.base.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class filesAction extends ActionSupport {
	
		private static final long serialVersionUID = 572146812454l; 
		private static final int BUFFER_SIZE = 16 * 1024; 

		//注意，文件上传时<s：file />同时与myFile，myFileContentType，myFileFileName绑定
		//所以同时要提供myFileContentType，myFileFileName的设置方法

		private File myFile; //上传文件
		private String contentType; //上传文件类型
		private String fileName; //上传文件名
		private String imageFileName; 
		private String caption; //文件说明，与页面属性绑定
		
		public void setMyFileContentType(String contentType){ 
			System.out.println("文件类型："+ contentType); 
			this .contentType = contentType; 
		} 
		public void setMyFileFileName(String fileName){ 
			System.out.println("文件名称："+ fileName); 
			this.fileName = fileName; 
		} 
		public void setMyFile(File myFile) {
			this .myFile = myFile;
		}
		public String getImageFileName() {
			return imageFileName;
		}

		public String getCaption() {
			return caption;
		}

		public void setCaption(String caption) {
			this .caption = caption;
		}
		public void copy(File src, File dst) {
			try {
				InputStream in = null ;
				OutputStream out = null ;
				try {
					in = new BufferedInputStream( new FileInputStream(src), BUFFER_SIZE);
					out = new BufferedOutputStream( new FileOutputStream(dst), BUFFER_SIZE);
					byte [] buffer = new byte [BUFFER_SIZE];
					while (in.read(buffer) > 0 ) {
					out.write(buffer);
					}
				} finally {
					if ( null != in) {
					in.close();
				}
					if ( null != out) {
					out.close();
					}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		}
		public String getExtention(String fileName) {
			int pos = fileName.lastIndexOf(".");
			return fileName.substring(pos);
		}
		
		@Override
		public String execute() {
			imageFileName = "12" + getExtention(fileName);
			File imageFile = new File("F:/hk/" + imageFileName);
			copy(myFile, imageFile);
			return SUCCESS;
		}
}