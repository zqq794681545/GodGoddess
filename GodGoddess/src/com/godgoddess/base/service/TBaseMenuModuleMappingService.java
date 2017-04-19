package com.godgoddess.base.service;

import com.godgoddess.base.mapper.TBaseMenuModuleMappingMapper;
import com.godgoddess.base.util.IDUtil;
import com.godgoddess.base.util.UserBase;
import com.godgoddess.base.entity.TBaseMenuModuleMappingEntity;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

/**
 * @ClassName com.godgoddess.base.service.TBaseMenuModuleMappingService
 * @Description T_BASE_MENU_MODULE_MAPPING表Service类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-03-21 09:32:54
 * @version 1.0
 * @remark create by generator
 */
@Service("TBaseMenuModuleMappingService")
@Transactional
public class TBaseMenuModuleMappingService {
	
	@Autowired
	private TBaseMenuModuleMappingMapper tBaseMenuModuleMappingMapper;

	
	/**
	 * 查询条数
	 * @param e TBaseMenuModuleMappingEntity
	 * @return 条数
	 */
	public int getCount(TBaseMenuModuleMappingEntity e){
		return tBaseMenuModuleMappingMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TBaseMenuModuleMappingEntity
	 * @param rowBounds 分页实体
	 * @return TBaseMenuModuleMappingEntity
	 */
	public List<TBaseMenuModuleMappingEntity> selectPagination(TBaseMenuModuleMappingEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tBaseMenuModuleMappingMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * 按id查询
	 * @param id 主键id
	 * @return TBaseMenuModuleMappingEntity
	 */	
	public TBaseMenuModuleMappingEntity selectByPkey(String id){
		return tBaseMenuModuleMappingMapper.selectByPkey(id);
	}

	
	/**
	 * 新增
	 * @param e TBaseMenuModuleMappingEntity
	 * @return 条数
	 */	
	public int insert(TBaseMenuModuleMappingEntity e){
		e.setId(IDUtil.getId());
		e.setUpdatetime(new Date());
		return tBaseMenuModuleMappingMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TBaseMenuModuleMappingEntity
	 * @return 条数
	 */	
	public int update(TBaseMenuModuleMappingEntity e){
		return tBaseMenuModuleMappingMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return 条数
	 */	
	private int delete(String id){
		return tBaseMenuModuleMappingMapper.delete(id);
	}
	
	public int deletemenuAndModule(TBaseMenuModuleMappingEntity e){
		return tBaseMenuModuleMappingMapper.deletemenuAndModule(e);
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