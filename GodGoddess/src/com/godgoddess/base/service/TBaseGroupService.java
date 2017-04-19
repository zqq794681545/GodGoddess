package com.godgoddess.base.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

import com.godgoddess.base.entity.TBaseGroupEntity;
import com.godgoddess.base.mapper.TBaseGroupMapper;
import com.godgoddess.base.util.IDUtil;

/**
 * @ClassName com.kingtopinfo.base.service.TBaseGroupService
 * @Description T_BASE_GROUP表服务类
 * @author 姚子鹏 yaozp@kingtopinfo.com
 * @date 2014-12-26 10:40:48
 * @version 1.0
 * @remark create by generator
 */
@Service("TBaseGroupService")
public class TBaseGroupService {
	
	@Autowired
	private TBaseGroupMapper tBaseGroupMapper;
	
	/**
	 * @Description 按条件查询总条数
	 * @param e TBaseGroupEntity实体
	 * @return 条数
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-26 10:40:48
	 */
	public int getCount(TBaseGroupEntity e){
		return tBaseGroupMapper.getCount(e);
	}
	
	/**
	 * @Description 按条件分页查询
	 * @param e TBaseGroupEntity实体
	 * @param rowBounds 分页实体
	 * @return TBaseGroupEntity集合
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-26 10:40:48
	 */
	public List<TBaseGroupEntity> selectPagination(TBaseGroupEntity e,RowBounds rowBounds){
		return tBaseGroupMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * @Description 查询全部信息
	 * @return TBaseGroupEntity集合
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-26 10:40:48
	 */	
	public List<TBaseGroupEntity> select(){
		return tBaseGroupMapper.select();
	}
	
	/**
	 * @Description 按id查询TBaseGroupEntity信息
	 * @param id 主键id
	 * @return TBaseGroupEntity实体
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-26 10:40:48
	 */	
	public TBaseGroupEntity getByPkey(String id){
		return tBaseGroupMapper.getByPkey(id);
	}
	
	/**
	 * @Description 添加TBaseGroupEntity信息
	 * @param e TBaseGroupEntity实体
	 * @return 影响条数
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-26 10:40:48
	 */	
	public int insert(TBaseGroupEntity e){
		e.setId(IDUtil.getId());
		e.setUpdatetime(new Date());
		return tBaseGroupMapper.insert(e);
	}
	
	/**
	 * @Description 修改TBaseGroupEntity信息
	 * @param e TBaseGroupEntity实体
	 * @return 影响条数
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-26 10:40:48
	 */	
	public int update(TBaseGroupEntity e){
		e.setUpdatetime(new Date());
		return tBaseGroupMapper.update(e);
	}
	
	/**
	 * @Description 按id删除TBaseGroupEntity信息
	 * @param id
	 * @return 影响条数
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-26 10:40:48
	 */	
	public int delete(String id){
		return tBaseGroupMapper.delete(id);
	}

	public int move(TBaseGroupEntity e) {
		return tBaseGroupMapper.move(e);
	}
}