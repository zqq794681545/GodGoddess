package com.godgoddess.base.mapper;

import java.util.List;

import com.godgoddess.base.entity.TBaseMenuEntity;

/**
 * @ClassName com.godgoddess.base.mapper.TBaseMenuMapper
 * @Description T_BASE_MENU表数据库操作接口
 * @author zqq
 * @date 2014-02-20 09:12:37
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseMenuMapper {
	
	List<TBaseMenuEntity> selectroleOfMenu(String roleid);
	List<TBaseMenuEntity> select();
	TBaseMenuEntity selectByKey(String id);
	int insert(TBaseMenuEntity e);
	int update(TBaseMenuEntity e);
	int delete(String id);
	
	/**
	* 以上为代码生成器自动生成
	*/
	List<TBaseMenuEntity> selectByPid(String pid);
	int move(TBaseMenuEntity e);
	List<TBaseMenuEntity> selectByRole(List<String> roleids);
	List<TBaseMenuEntity> selectMenuByRole();
	int selectMaxSequ();
	int updateSequ(TBaseMenuEntity e);
	List<String> selectUrlByRoleId(String roleid);
	List<TBaseMenuEntity> selectAllUrl();
	List<String> selectRoleByUrl(String url);
	List<String> selectRoleByActionUrl(String url);
	
	List<TBaseMenuEntity> selectAction(String pid);
	int urlIfExist(TBaseMenuEntity e);
	List<TBaseMenuEntity> selectByUrl(String url);
}