package com.godgoddess.god.service;

import com.godgoddess.god.mapper.TModelImglbMapper;
import com.godgoddess.god.entity.TModelImglbEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

/**
 * @ClassName com.godgoddess.god.service.TModelImglbService
 * @Description t_model_imglb表Service类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 14:08:56
 * @version 1.0
 * @remark create by generator
 */
@Service("TModelImglbService")
@Transactional
public class TModelImglbService {
	
	@Autowired
	private TModelImglbMapper tModelImglbMapper;
	
	/**
	 * 查询条数
	 * @param e TModelImglbEntity
	 * @return 条数
	 */
	public int getCount(TModelImglbEntity e){
		return tModelImglbMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TModelImglbEntity
	 * @param rowBounds 分页实体
	 * @return TModelImglbEntity
	 */
	public List<TModelImglbEntity> selectPagination(TModelImglbEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tModelImglbMapper.selectPagination(e,rowBounds);
	}
	
	public List<TModelImglbEntity> selectAll(){
		return tModelImglbMapper.selectAll();
	}
	
	/**
	 * 按id查询
	 * @param id 主键id
	 * @return TModelImglbEntity
	 */	
	public TModelImglbEntity selectByPkey(String id){
		return tModelImglbMapper.selectByPkey(id);
	}
	
	/**
	 * 新增
	 * @param e TModelImglbEntity
	 * @return 条数
	 */	
	public int insert(TModelImglbEntity e){
		return tModelImglbMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TModelImglbEntity
	 * @return 条数
	 */	
	public int update(TModelImglbEntity e){
		return tModelImglbMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return 条数
	 */	
	private int delete(String id){
		return tModelImglbMapper.delete(id);
	}
	
	/**
	 * 批量删除
	 * @param idArray id
	 * @return 条数
	 */	
	public int deletes(String[] keys){
		int row = 0;
		for(String id : keys){
			row += delete(id);
		}
		return row;
	}

}