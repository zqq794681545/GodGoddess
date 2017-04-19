package com.godgoddess.base.service;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.godgoddess.base.entity.TBaseDocumentEntity;
import com.godgoddess.base.mapper.TBaseDocumentMapper;
import com.godgoddess.base.util.FileUtil;
import com.godgoddess.base.util.GetBigFileMD5;
import com.godgoddess.base.util.IDUtil;
import com.godgoddess.base.util.PropertiesUtil;
import com.godgoddess.base.util.SystemUtil;
import com.godgoddess.base.util.UserBase;



/**
 * @ClassName com.kingtopinfo.base.service.TBaseDocumentService
 * @Description T_BASE_DOCUMENT表Service类
 * @author dzb@kingtopinfo.com
 * @date 2016-10-14 13:49:04
 * @version 1.0
 * @remark create by generator
 */
@Service("TBaseDocumentService")
@Transactional
public class TBaseDocumentService {
	
	@Autowired
	private TBaseDocumentMapper tBaseDocumentMapper;
	
	private Map<String, String> map = new HashMap<String, String>();
	
	TBaseDocumentService(){
		map = new PropertiesUtil("document-config.properties").read();
	}
	
	/**
	 * 查询条数
	 * @param e TBaseDocumentEntity
	 * @return 条数
	 */
	public int getCount(TBaseDocumentEntity e){
		return tBaseDocumentMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TBaseDocumentEntity
	 * @param rowBounds 分页实体
	 * @return TBaseDocumentEntity
	 */
	public List<TBaseDocumentEntity> selectPagination(TBaseDocumentEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tBaseDocumentMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * 按base_document_id查询
	 * @param base_document_id 主键base_document_id
	 * @return TBaseDocumentEntity
	 */	
	public TBaseDocumentEntity getByPkey(String base_document_id){
		return tBaseDocumentMapper.getByPkey(base_document_id);
	}
	
	/**
	 * 新增
	 * @param e TBaseDocumentEntity
	 * @return 条数
	 */	
	public int insert(TBaseDocumentEntity e){
		
		String userId = UserBase.getUserId();
		e.setState(1);
		e.setCreatetime(new Date());
		e.setCreateuser(userId);
		e.setUpdatetime(new Date());
		e.setUpdateuser(userId);
		
		return tBaseDocumentMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TBaseDocumentEntity
	 * @return 条数
	 */	
	public int update(TBaseDocumentEntity e){
		return tBaseDocumentMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param base_document_id
	 * @return 条数
	 */	
	private int delete(String base_document_id){
		TBaseDocumentEntity e = getByPkey(base_document_id);
		if(null == e){
			return 0;
		}else{
			FileUtil.deleteFile(e.getPath());
			return tBaseDocumentMapper.delete(base_document_id);
		}
	}
	
	/**
	 * 批量删除
	 * @param idArray base_document_id
	 * @return 条数
	 */	
	public int deletes(String[] keys){
		int row = 0;
		for(String id : keys){
			row += delete(id);
		}
		return row;
	}
	
	/**
	 * 接收附件 保存到文件服务器（目前保存到本地磁盘）
	 * @param src_id
	 * @param file
	 * @param fileFileName
	 * @param fileContentType
	 * @return
	 */
	public int upload(String src_id,File[] file,String[] fileFileName, String[] fileContentType){
		
		int i = 0;
		String path = map.get("default_Path");//文件保存路径
		//多文件循环上传
		for(int j=0; j<file.length; j++){
			TBaseDocumentEntity e = new TBaseDocumentEntity();
			String base_document_id = IDUtil.getId();
			e.setBase_document_id(base_document_id);
			e.setSrc_id(src_id);//业务主键
			e.setName(fileFileName[j]);//上传时文件的名称
			e.setExt(fileContentType[j]);//文件的扩展名
			e.setSizes(FileUtil.fileSize(file[j]));//文件的大小（单位：KB）
			String _unique = IDUtil.getUnique();//获取一个唯一的数值，用于修改文件服务器上的文件名称，防止同名被覆盖
			String pathFileName = _unique+"."+FileUtil.getExt(fileFileName[j]);
			String pathFile = path + SystemUtil.separator() + pathFileName;
			e.setPath(pathFile);//文件存放的位置
			e.setMd5key(GetBigFileMD5.getMD5(file[j]));//文件MD5，用于判断是否为同一个文件
			boolean b = FileUtil.copyFile(file[j], path, pathFileName);
			if(b){
				i = insert(e);
				i++;
			}
		}
		return i;
	}
	
	public List<TBaseDocumentEntity> selectBySrcId(String src_id){
		return tBaseDocumentMapper.selectBySrcId(src_id);
	}

}