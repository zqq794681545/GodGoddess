package com.godgoddess.base.mapper;

import java.util.List;

import com.godgoddess.base.entity.TBaseFileEntity;

import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.base.mapper.TBaseFileMapper
 * @Description T_BASE_FILE表数据库操作接口
 * @author zqq
 * @date 2016-10-26 16:19:23
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseFileMapper {
	
	int getCount(TBaseFileEntity e);
	List<TBaseFileEntity> selectPagination(TBaseFileEntity e,RowBounds rowBounds);
	TBaseFileEntity selectByPkey(String fileid);
	List<TBaseFileEntity> selectByOperaid(String operaid);
	int insert(TBaseFileEntity e);
	int update(TBaseFileEntity e);
	int delete(String fileid);
	int deleteByOperaid(String operaid);
	TBaseFileEntity selectByFilePath(String filePath);
	List<TBaseFileEntity> selectByOperatypeAndOperaid(TBaseFileEntity e);

}