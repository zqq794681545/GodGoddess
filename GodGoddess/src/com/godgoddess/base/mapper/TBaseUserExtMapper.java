package com.godgoddess.base.mapper;

import com.godgoddess.base.entity.TBaseUserExtEntity;
/**
 * @ClassName com.godgoddess.base.mapper.TBaseUserExtMapper
 * @Description T_BASE_USER_EXT表数据库操作接口
 * @author zqq
 * @date 2014-12-29 10:12:19
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseUserExtMapper {
	
	TBaseUserExtEntity getByPkey(String id);
	int insert(TBaseUserExtEntity e);
	int update(TBaseUserExtEntity e);
	int delete(String id);
	TBaseUserExtEntity selectByUserid(String userid);

}