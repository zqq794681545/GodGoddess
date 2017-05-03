package com.godgoddess.god.service;

import com.godgoddess.god.mapper.TModelMapper;
import com.godgoddess.god.entity.TModelEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

/**
 * @ClassName com.godgoddess.god.service.TModelService
 * @Description t_model表Service类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 10:25:05
 * @version 1.0
 * @remark create by generator
 */
@Service("TModelService")
@Transactional
public class TModelService {
	
	@Autowired
	private TModelMapper tModelMapper;
	
	/**
	 * 查询条数
	 * @param e TModelEntity
	 * @return 条数
	 */
	public int getCount(TModelEntity e){
		return tModelMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TModelEntity
	 * @param rowBounds 分页实体
	 * @return TModelEntity
	 */
	public List<TModelEntity> selectPagination(TModelEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tModelMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * 按id查询
	 * @param id 主键id
	 * @return TModelEntity
	 */	
	public TModelEntity selectByPkey(String id){
		return tModelMapper.selectByPkey(id);
	}
	
	/**
	 * 新增
	 * @param e TModelEntity
	 * @return 条数
	 */	
	public int insert(TModelEntity e){
		return tModelMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TModelEntity
	 * @return 条数
	 */	
	public int update(TModelEntity e){
		return tModelMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return 条数
	 */	
	private int delete(String id){
		return tModelMapper.delete(id);
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