package com.godgoddess.base.mapper;

import java.util.List;
import com.godgoddess.base.entity.TBaseGroupEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.base.mapper.TBaseGroupMapper
 * @Description T_BASE_GROUP表数据库操作接口
 * @author zqq
 * @date 2014-12-26 10:40:48
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseGroupMapper {
	
	int getCount(TBaseGroupEntity e);
	List<TBaseGroupEntity> selectPagination(TBaseGroupEntity e,RowBounds rowBounds);
	List<TBaseGroupEntity> select();
	TBaseGroupEntity getByPkey(String id);
	int insert(TBaseGroupEntity e);
	int update(TBaseGroupEntity e);
	int delete(String id);
	int move(TBaseGroupEntity e);
	TBaseGroupEntity selectGnameByPid(String pid);

}