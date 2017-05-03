package com.godgoddess.base.service;

import com.godgoddess.base.mapper.TSctableMapper;
import com.godgoddess.base.entity.TSctableEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

/**
 * @ClassName com.godgoddess.base.service.TSctableService
 * @Description t_sctable表Service类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 15:36:26
 * @version 1.0
 * @remark create by generator
 */
@Service("TSctableService")
@Transactional
public class TSctableService {
	
	@Autowired
	private TSctableMapper tSctableMapper;
	
	/**
	 * 查询条数
	 * @param e TSctableEntity
	 * @return 条数
	 */
	public int getCount(TSctableEntity e){
		return tSctableMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TSctableEntity
	 * @param rowBounds 分页实体
	 * @return TSctableEntity
	 */
	public List<TSctableEntity> selectPagination(TSctableEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tSctableMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * 按id查询
	 * @param id 主键id
	 * @return TSctableEntity
	 */	
	public TSctableEntity selectByPkey(String id){
		return tSctableMapper.selectByPkey(id);
	}
	
	/**
	 * 新增
	 * @param e TSctableEntity
	 * @return 条数
	 */	
	public int insert(TSctableEntity e){
		return tSctableMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TSctableEntity
	 * @return 条数
	 */	
	public int update(TSctableEntity e){
		return tSctableMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return 条数
	 */	
	private int delete(String id){
		return tSctableMapper.delete(id);
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