package com.godgoddess.god.service;

import com.godgoddess.god.mapper.TModelImggroupMapper;
import com.godgoddess.god.entity.TModelImggroupEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

/**
 * @ClassName com.godgoddess.god.service.TModelImggroupService
 * @Description t_model_imggroup表Service类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 14:45:50
 * @version 1.0
 * @remark create by generator
 */
@Service("TModelImggroupService")
@Transactional
public class TModelImggroupService {
	
	@Autowired
	private TModelImggroupMapper tModelImggroupMapper;
	
	/**
	 * 查询条数
	 * @param e TModelImggroupEntity
	 * @return 条数
	 */
	public int getCount(TModelImggroupEntity e){
		return tModelImggroupMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TModelImggroupEntity
	 * @param rowBounds 分页实体
	 * @return TModelImggroupEntity
	 */
	public List<TModelImggroupEntity> selectPagination(TModelImggroupEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tModelImggroupMapper.selectPagination(e,rowBounds);
	}
	public List<TModelImggroupEntity> selectAll(TModelImggroupEntity e){
		return tModelImggroupMapper.selectAll(e);
	}
	
	/**
	 * 按id查询
	 * @param id 主键id
	 * @return TModelImggroupEntity
	 */	
	public TModelImggroupEntity selectByPkey(String id){
		return tModelImggroupMapper.selectByPkey(id);
	}
	
	/**
	 * 新增
	 * @param e TModelImggroupEntity
	 * @return 条数
	 */	
	public int insert(TModelImggroupEntity e){
		return tModelImggroupMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TModelImggroupEntity
	 * @return 条数
	 */	
	public int update(TModelImggroupEntity e){
		return tModelImggroupMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return 条数
	 */	
	private int delete(String id){
		return tModelImggroupMapper.delete(id);
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