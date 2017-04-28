package com.godgoddess.base.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.godgoddess.base.entity.TBaseUserEntity;

/**
 * @ClassName com.godgoddess.base.mapper.TBaseUserMapper
 * @Description T_BASE_USER表数据库操作接口
 * @author zqq
 * @date 2014-02-18 09:21:43
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseUserMapper {
	
//	List<TBaseUserEntity> select();
//	TBaseUserEntity selectByKey(String id);
	int insert(TBaseUserEntity e);
	int updateNiCAndLogo(TBaseUserEntity e);
	int updatePassword(TBaseUserEntity e);
	int selectName(String phone);
//	int update(TBaseUserEntity e);
//	int delete(String id);
//	int updatePassword(TBaseUserEntity e);
//	List<String> selectRoleIdByAccount(String phone);
	TBaseUserEntity selectByAccount(String phone);
//	/**
//	* 以上为代码生成器自动生成
//	*/
//	List<TBaseUserEntity> selectPagination(TBaseUserEntity e,RowBounds rowBounds);
//	Integer getCount(TBaseUserEntity e);
//	
//	List<TBaseUserEntity> selectUnauthorizedPagination(TBaseUserEntity tBaseUserEntity,RowBounds rowBounds);
//	Integer getUnauthorizedCount(TBaseUserEntity tBaseUserEntity);
//	
//	List<TBaseUserEntity> selectAuthorizedPagination(TBaseUserEntity tBaseUserEntity,RowBounds rowBounds);
//	Integer getAuthorizedCount(TBaseUserEntity tBaseUserEntity);
//	int selectByAccountnum(String account);
////
//	String selectPasswordByAccount(String account);
//	String selectXzqhByAccount(String account);
////	
//	int verifyUserInfo(TBaseUserEntity e);
//	
//	List<TBaseUserEntity> selectUnaddGroupUserPagination(TBaseUserEntity tBaseUserEntity,RowBounds rowBounds);
//	Integer getUnaddGroupUserCount(TBaseUserEntity tBaseUserEntity);
//	
//	List<TBaseUserEntity> selectAddGroupUserPagination(TBaseUserEntity tBaseUserEntity,RowBounds rowBounds);
//	Integer getAddGroupUserCount(TBaseUserEntity tBaseUserEntity);
//	int AddGroupByGid(TBaseUserEntity tBaseUserEntity);
//	int DropGroupByGid(String userid);
//	List<TBaseUserEntity> selectUserByGid(String gid);
//	String selectUserNameByKey(String assignee);
}