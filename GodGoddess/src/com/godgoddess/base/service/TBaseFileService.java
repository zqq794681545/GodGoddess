package com.godgoddess.base.service;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.godgoddess.base.entity.TBaseFileEntity;
import com.godgoddess.base.mapper.TBaseFileMapper;
import com.godgoddess.base.util.IDUtil;

/**
 * @ClassName com.kingtopinfo.base.service.TBaseFileService
 * @Description T_BASE_FILE表Service类
 * @author 林祥聪  lxcl@kingtopinfo.com
 * @date 2016-10-26 16:19:23
 * @version 1.0
 * @remark create by generator
 */
@Service("TBaseFileService")
@Transactional
public class TBaseFileService {
	
	@Autowired
	private TBaseFileMapper tBaseFileMapper;
	
	/**
	 * 查询条数
	 * @param e TBaseFileEntity
	 * @return 条数
	 */
	public int getCount(TBaseFileEntity e){
		return tBaseFileMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TBaseFileEntity
	 * @param rowBounds 分页实体
	 * @return TBaseFileEntity
	 */
	public List<TBaseFileEntity> selectPagination(TBaseFileEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tBaseFileMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * 按fileid查询
	 * @param fileid 主键fileid
	 * @return TBaseFileEntity
	 */	
	public TBaseFileEntity selectByPkey(String fileid){
		return tBaseFileMapper.selectByPkey(fileid);
	}
	
	/**
	 * 新增
	 * @param e TBaseFileEntity
	 * @return 条数
	 */	
	public int insert(TBaseFileEntity e){
		e.setGxsj(new Date());
		e.setFileid(IDUtil.getId());
		return tBaseFileMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TBaseFileEntity
	 * @return 条数
	 */	
	public int update(TBaseFileEntity e){
		return tBaseFileMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param fileid
	 * @return 条数
	 */	
	private int delete(String fileid){
		return tBaseFileMapper.delete(fileid);
	}
	/**
	 * 根据Operaid删除
	 * @param Operaid
	 * @return 条数
	 */	
	private int deleteByOperaid(String operaid){
		return tBaseFileMapper.deleteByOperaid(operaid);
	}
	
	/** 
	 * 批量删除
	 * @param idArray fileid
	 * @return 条数
	 */	
	public int deletes(String[] keys){
		int row = 0;
		for(String id : keys){
			//根据文件id查找文件路径
			TBaseFileEntity baseFileEntity = tBaseFileMapper.selectByPkey(id);
			File file = new File(baseFileEntity.getFilepath());
			//判断文件是否存在  存在才删除
			if(file.exists()){
				file.delete();
			}
			row += delete(id);
		}
		return row;
	}
	/** 
	 * 根据Operaid批量删除
	 * @param  Operaid
	 * @return 条数
	 */	
	 public int deleteByOperaids(String[] keys){
			int row = 0;
			for(String operaid : keys){
				//根据文件id查找文件路径
				List<TBaseFileEntity> filelist = tBaseFileMapper.selectByOperaid(operaid);
				for (TBaseFileEntity baseFileEntity :filelist) {
					File file = new File(baseFileEntity.getFilepath());
					//判断文件是否存在  存在才删除
					if(file.exists()){
						file.delete();
					}
					row += deleteByOperaid(operaid);
				}
			}
			return row;
		}
	
	/**
	 * Description :根据文件路径查询文件信息
	 * @author lxc
	 * Create at @2016年10月27日.上午11:23:28
	 */
	public TBaseFileEntity selectByFilePath(String filePath) {
		return tBaseFileMapper.selectByFilePath(filePath);
	}

	public List<TBaseFileEntity> selectByOperatypeAndOperaid(String operatype,
			String operaid) {
		TBaseFileEntity e = new TBaseFileEntity();
		e.setOperatype(operatype);
		e.setOperaid(operaid);
		return tBaseFileMapper.selectByOperatypeAndOperaid(e);
	}

	/**
	 * 可处理一些在数据库中保存相对路径的附件的删除功能  (删除流程文件)
	 * @param fileid 附件在数据库中保存的附件ID，仅用于删除数据库的记录
	 * @param filepath 删除附件的路径，此路径须为附件的绝对路径
	 * @return
	 */
	public int deleteByFileidAndFilepath(String fileid,String filepath){
		File file = new File(filepath);
		if(file.exists()){
			file.delete();
		}
		return tBaseFileMapper.delete(fileid);
	}

}