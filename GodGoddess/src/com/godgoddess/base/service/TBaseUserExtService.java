package com.godgoddess.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseUserExtEntity;
import com.godgoddess.base.mapper.TBaseUserExtMapper;
import com.godgoddess.base.util.IDUtil;

/**
 * @ClassName com.godgoddess.base.service.TBaseUserExtService
 * @Description T_BASE_USER_EXT表服务类
 * @author 姚子鹏 yaozp@kingtopinfo.com
 * @date 2014-12-29 10:12:20
 * @version 1.0
 * @remark create by generator
 */
@Service("TBaseUserExtService")
public class TBaseUserExtService {
	
	@Autowired
	private TBaseUserExtMapper tBaseUserExtMapper;
	
	/**
	 * @Description 查询全部信息
	 * @return TBaseUserExtEntity集合
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-29 10:12:20
	 */	
	public TBaseUserExtEntity selectByUserid(String userid){
		return tBaseUserExtMapper.selectByUserid(userid);
	}
	
	/**
	 * @Description 按id查询TBaseUserExtEntity信息
	 * @param id 主键id
	 * @return TBaseUserExtEntity实体
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-29 10:12:20
	 */	
	public TBaseUserExtEntity getByPkey(String id){
		return tBaseUserExtMapper.getByPkey(id);
	}
	
	/**
	 * @Description 添加TBaseUserExtEntity信息
	 * @param e TBaseUserExtEntity实体
	 * @return 影响条数
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-29 10:12:20
	 */	
	public int insert(TBaseUserExtEntity e){
		e.setId(IDUtil.getId());
		return tBaseUserExtMapper.insert(e);
	}
	
	/**
	 * @Description 修改TBaseUserExtEntity信息
	 * @param e TBaseUserExtEntity实体
	 * @return 影响条数
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-29 10:12:20
	 */	
	public int update(TBaseUserExtEntity e){
		return tBaseUserExtMapper.update(e);
	}
	
	/**
	 * @Description 按id删除TBaseUserExtEntity信息
	 * @param id
	 * @return 影响条数
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-29 10:12:20
	 */	
	public int delete(String id){
		return tBaseUserExtMapper.delete(id);
	}
	
	/**
	 * @Description 按id集合批量删除TBaseUserExtEntity信息
	 * @param idArray id集合
	 * @return 影响条数
	 * @author 姚子鹏 yaozp@kingtopinfo.com
	 * @date 2014-12-29 10:12:20
	 */	
	public int deleteBatch(String[] idArray){
		int row = 0;
		for(String id : idArray){
			row += delete(id);
		}
		return row;
	}

}