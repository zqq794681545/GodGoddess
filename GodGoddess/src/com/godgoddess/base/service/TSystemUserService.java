package com.godgoddess.base.service;

import com.godgoddess.base.mapper.TSystemUserMapper;
import com.godgoddess.base.entity.TSystemUserEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

/**
 * @ClassName com.godgoddess.base.service.TSystemUserService
 * @Description T_SYSTEM_USER表Service类
 * @author dzb@kingtopinfo.com
 * @date 2016-10-10 09:50:59
 * @version 1.0
 * @remark create by generator
 */
@Service("TSystemUserService")
@Transactional
public class TSystemUserService {
	
	@Autowired
	private TSystemUserMapper tSystemUserMapper;
	
	/**
	 * 查询条数
	 * @param e TSystemUserEntity
	 * @return 条数
	 */
	public int getCount(TSystemUserEntity e){
		return tSystemUserMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TSystemUserEntity
	 * @param rowBounds 分页实体
	 * @return TSystemUserEntity
	 */
	public List<TSystemUserEntity> selectPagination(TSystemUserEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tSystemUserMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * 按system_user_id查询
	 * @param system_user_id 主键system_user_id
	 * @return TSystemUserEntity
	 */	
	public TSystemUserEntity getByPkey(String system_user_id){
		return tSystemUserMapper.getByPkey(system_user_id);
	}
	
	/**
	 * 新增
	 * @param e TSystemUserEntity
	 * @return 条数
	 */	
	public int insert(TSystemUserEntity e){
		return tSystemUserMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TSystemUserEntity
	 * @return 条数
	 */	
	public int update(TSystemUserEntity e){
		return tSystemUserMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param system_user_id
	 * @return 条数
	 */	
	private int delete(String system_user_id){
		return tSystemUserMapper.delete(system_user_id);
	}
	
	/**
	 * 批量删除
	 * @param idArray system_user_id
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