package com.godgoddess.base.service;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

import com.godgoddess.base.entity.TBaseHolidaysEntity;
import com.godgoddess.base.mapper.TBaseHolidaysMapper;
import com.godgoddess.base.util.IDUtil;
import com.godgoddess.base.util.UserBase;

/**
 * @ClassName com.godgoddess.service.TBaseHolidaysService
 * @Description T_BASE_HOLIDAYS表Service类
 * @author 张宇然
 * @date 2016-10-31 10:51:58
 * @version 1.0
 * @remark create by generator
 */
@Service("TBaseHolidaysService")
@Transactional
public class TBaseHolidaysService {
	
	@Autowired
	private TBaseHolidaysMapper tBaseHolidaysMapper;
	
	/**
	 * 查询条数
	 * @param e TBaseHolidaysEntity
	 * @return 条数
	 */
	public int getCount(TBaseHolidaysEntity e){
		return tBaseHolidaysMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TBaseHolidaysEntity
	 * @param rowBounds 分页实体
	 * @return TBaseHolidaysEntity
	 */
	public List<TBaseHolidaysEntity> selectPagination(TBaseHolidaysEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tBaseHolidaysMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * 按id查询
	 * @param id 主键id
	 * @return TBaseHolidaysEntity
	 */	
	public TBaseHolidaysEntity selectByPkey(String id){
		return tBaseHolidaysMapper.selectByPkey(id);
	}
	
	/**
	 * 新增
	 * @param e TBaseHolidaysEntity
	 * @return 条数
	 */	
	public int insert(TBaseHolidaysEntity e){
		e.setId(IDUtil.getId());
		e.setCreateperson(UserBase.getUsername());
		e.setCreatetime(new Date());
		return tBaseHolidaysMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TBaseHolidaysEntity
	 * @return 条数
	 */	
	public int update(TBaseHolidaysEntity e){
		return tBaseHolidaysMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return 条数
	 */	
	private int delete(String id){
		return tBaseHolidaysMapper.delete(id);
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