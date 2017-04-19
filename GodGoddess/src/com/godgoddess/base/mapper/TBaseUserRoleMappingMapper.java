package com.godgoddess.base.mapper;

import com.godgoddess.base.entity.TBaseUserRoleMappingEntity;

/**
 * @ClassName com.godgoddess.base.mapper.TBaseUserRoleMappingMapper
 * @Description T_BASE_USER_ROLE_MAPPING表数据库操作接口
 * @author zqq
 * @date 2014-02-18 09:21:47
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseUserRoleMappingMapper {
	
//	int insert(List<TBaseUserRoleMappingEntity> tBaseUserRoleMappingEntitys);
	int insert(TBaseUserRoleMappingEntity tBaseUserRoleMappingEntity);
	int deleteByRoidAndUserid(TBaseUserRoleMappingEntity tBaseUserRoleMappingEntity);
	
	/**
	* 以上为代码生成器自动生成
	*/
	int deleteByUserid(String userid);
	int deleteByRoleid(String roleid);
	
}