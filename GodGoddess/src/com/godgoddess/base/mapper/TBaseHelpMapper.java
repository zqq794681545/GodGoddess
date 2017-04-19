package com.godgoddess.base.mapper;

import java.util.List;

import com.godgoddess.base.entity.TBaseHelpEntity;

/**
 * @ClassName com.godgoddess.base.mapper.TBaseHelpMapper
 * @Description T_BASE_MENU表数据库操作接口
 * @author zqq
 * @date 2014-02-20 09:12:37
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseHelpMapper {
	
	List<TBaseHelpEntity> select();
	List<String> selectIdByName (String name);
	int insert(TBaseHelpEntity e);
	int update(TBaseHelpEntity e);
	int delete(String id);
	
	/**
	* 以上为代码生成器自动生成
	*/
	List<TBaseHelpEntity> selectByPid(String pid);
	int move(TBaseHelpEntity e);
	List<TBaseHelpEntity> selectByRole(List<String> roleids);
	int selectMaxSequ();
	int updateSequ(TBaseHelpEntity e);
	List<String> selectUrlByRoleId(String roleid);
	List<String> selectAllUrl();
	List<String> selectRoleByUrl(String url);
	List<String> selectUrlByName(String name);
}