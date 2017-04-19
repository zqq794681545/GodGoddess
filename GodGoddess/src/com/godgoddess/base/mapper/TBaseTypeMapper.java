package com.godgoddess.base.mapper;

import java.util.List;

import com.godgoddess.base.entity.TBaseTypeEntity;

/**
 * @ClassName com.godgoddess.mapper.TBaseTypeMapper
 * @Description T_BASE_TYPE表数据库操作接口
 * @author zqq
 * @date 2013-11-19 15:45:37
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseTypeMapper {
	
	int insert(TBaseTypeEntity e);
	int update(TBaseTypeEntity e);
	int delete(String id);
	int move(TBaseTypeEntity e);
	List<TBaseTypeEntity> selectValueByCode(String code);
	List<TBaseTypeEntity> selectByCode(String code);
	List<TBaseTypeEntity> selectAllByCode(String code);
	TBaseTypeEntity selectByCodeAndValue(TBaseTypeEntity e);
	String selectMaxVlueByCode(String type);
	List<TBaseTypeEntity> selectMenu(String type);
	int selectCountByPid(String pid);
	Integer selectMaxSequ();
	int updateSequ(TBaseTypeEntity e);
	TBaseTypeEntity selectByKey(String id);
	List<TBaseTypeEntity> selectAll();
	/**
	* 以上为代码生成器自动生成
	*/
	List<TBaseTypeEntity> selectByQjxzqh(TBaseTypeEntity e);
	int selectVerByCode(String code);//通过代码类型获取代码版本
	int updateVerByCode(TBaseTypeEntity tBaseTypeEntity);
	String selectNameByCodeAndValue(TBaseTypeEntity e);
	
	List<TBaseTypeEntity> selectNameAndValueByCode(String code);
	
}