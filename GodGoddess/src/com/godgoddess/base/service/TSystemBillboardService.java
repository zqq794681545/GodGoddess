package com.godgoddess.base.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.godgoddess.base.entity.TSystemBillboardEntity;
import com.godgoddess.base.mapper.TSystemBillboardMapper;
import com.godgoddess.base.util.IDUtil;
import com.godgoddess.base.util.UserBase;

/**
 * @ClassName com.godgoddess.base.service.TSystemBillboardService
 * @Description T_SYSTEM_BILLBOARD表Service类
 * @author dzb@kingtopinfo.com
 * @date 2016-10-12 10:33:25
 * @version 1.0
 * @remark create by generator
 */
@Service("TSystemBillboardService")
@Transactional
public class TSystemBillboardService {
	
	@Autowired
	private TSystemBillboardMapper tSystemBillboardMapper;
	
	/**
	 * 查询条数
	 * @param e TSystemBillboardEntity
	 * @return 条数
	 */
	public int getCount(TSystemBillboardEntity e){
		return tSystemBillboardMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TSystemBillboardEntity
	 * @param rowBounds 分页实体
	 * @return TSystemBillboardEntity
	 */
	public List<TSystemBillboardEntity> selectPagination(TSystemBillboardEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tSystemBillboardMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * 按system_billboard_id查询
	 * @param system_billboard_id 主键system_billboard_id
	 * @return TSystemBillboardEntity
	 */	
	public TSystemBillboardEntity getByPkey(String system_billboard_id){
		return tSystemBillboardMapper.getByPkey(system_billboard_id);
	}
	
	/**
	 * 新增
	 * @param e TSystemBillboardEntity
	 * @return 条数
	 */	
	public String insert(TSystemBillboardEntity e){
		
		String userId = UserBase.getUserId();
		String id = IDUtil.getId();
		e.setSystem_billboard_id(id);
		e.setCreatetime(new Date());
		e.setCreateuser(userId);
		e.setUpdatetime(new Date());
		e.setUpdateuser(userId);
		int i = tSystemBillboardMapper.insert(e);
		if(i == 1){
			return id;
		}else{
			return "";
		}
	}
	
	/**
	 * 编辑
	 * @param e TSystemBillboardEntity
	 * @return 条数
	 */	
	public int update(TSystemBillboardEntity e){
		
		String userId = UserBase.getUserId();
		e.setUpdatetime(new Date());
		e.setUpdateuser(userId);
		return tSystemBillboardMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param system_billboard_id
	 * @return 条数
	 */	
	private int delete(String system_billboard_id){
		return tSystemBillboardMapper.delete(system_billboard_id);
	}
	
	/**
	 * 批量删除
	 * @param idArray system_billboard_id
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