package com.godgoddess.base.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.godgoddess.base.entity.TBaseUserlogEntity;

/**
 * @ClassName com.godgoddess.base.mapper.TBaseUserlogMapper
 * @Description T_BASE_USERLOG表数据库操作接口
 * @author zqq
 * @date 2014-04-02 09:29:44
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseUserlogMapper {
	
	List<TBaseUserlogEntity> selectPagination(TBaseUserlogEntity e,RowBounds rowBounds);
	int selectCount(TBaseUserlogEntity e);
	int insert(TBaseUserlogEntity e);
	
	
	/**
	* 以上为代码生成器自动生成
	*/
	
}