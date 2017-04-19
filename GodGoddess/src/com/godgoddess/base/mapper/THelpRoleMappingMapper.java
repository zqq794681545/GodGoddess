package com.godgoddess.base.mapper;

import com.godgoddess.base.entity.THelpRoleMappingEntity;

/**
 * @ClassName com.godgoddess.base.mapper.THelpRoleMappingMapper
 * @Description T_BASE_ROLE_MENU_MAPPING表数据库操作接口
 * @author zqq
 * @date 2014-02-18 09:21:54
 * @version 1.0
 * @remark create by generator
 */

public interface THelpRoleMappingMapper {
	
	int insert(THelpRoleMappingEntity e);
	int deleteByRoleidAndMenuid(THelpRoleMappingEntity e);
	
	/**
	* 以上为代码生成器自动生成
	*/
	int deleteByMenuid(String menuid);
	int deleteByRoleid(String roleid);
}