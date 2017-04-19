package com.godgoddess.base.mapper;

import java.util.List;
import java.util.Map;

import com.godgoddess.base.entity.TBaseRoleEntity;

/**
 * @ClassName com.godgoddess.base.mapper.TBaseRoleMapper
 * @Description T_BASE_ROLE表数据库操作接口
 * @author zqq
 * @date 2014-02-18 09:22:06
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseRoleMapper {
	
	List<TBaseRoleEntity> select();
	TBaseRoleEntity selectByKey(String id);
	List<TBaseRoleEntity> selectByPid(String id);
	int insert(TBaseRoleEntity e);
	int update(TBaseRoleEntity e);
	int move(TBaseRoleEntity e);
	int delete(String id);
	
	
	/**
	* 以上为代码生成器自动生成
	*/
	List<TBaseRoleEntity> selectAddedMenuRoles(String menuid);
	List<String> selectRoleIdByAccount(String account);
	List<TBaseRoleEntity> selectRolesByUserid(String userid);
	List<TBaseRoleEntity> selectAddedHelpRoles(String menuid);
	
	List<TBaseRoleEntity> selectAction();
	List<TBaseRoleEntity> selectMKMenuRoles(String menuid);
	List<TBaseRoleEntity> selectRoleNameByAccount(String account);
}