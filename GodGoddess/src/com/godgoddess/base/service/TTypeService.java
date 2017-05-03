package com.godgoddess.base.service;

import com.godgoddess.base.mapper.TTypeMapper;
import com.godgoddess.base.entity.TTypeEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

/**
 * @ClassName com.godgoddess.base.service.TTypeService
 * @Description t_type表Service类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 11:37:24
 * @version 1.0
 * @remark create by generator
 */
@Service("TTypeService")
@Transactional
public class TTypeService {
	
	@Autowired
	private TTypeMapper tTypeMapper;
	
	/**
	 * 查询条数
	 * @param e TTypeEntity
	 * @return 条数
	 */
	public int getCount(TTypeEntity e){
		return tTypeMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TTypeEntity
	 * @param rowBounds 分页实体
	 * @return TTypeEntity
	 */
	public List<TTypeEntity> selectPagination(TTypeEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tTypeMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * 按id查询
	 * @param id 主键id
	 * @return TTypeEntity
	 */	
	public TTypeEntity selectByPkey(String id){
		return tTypeMapper.selectByPkey(id);
	}
	
	/**
	 * 新增
	 * @param e TTypeEntity
	 * @return 条数
	 */	
	public int insert(TTypeEntity e){
		return tTypeMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TTypeEntity
	 * @return 条数
	 */	
	public int update(TTypeEntity e){
		return tTypeMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return 条数
	 */	
	private int delete(String id){
		return tTypeMapper.delete(id);
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