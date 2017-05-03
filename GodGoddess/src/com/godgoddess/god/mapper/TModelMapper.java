package com.godgoddess.god.mapper;

import java.util.List;
import com.godgoddess.god.entity.TModelEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.god.mapper.TModelMapper
 * @Description t_model表数据库操作接口
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 10:25:05
 * @version 1.0
 * @remark create by generator
 */

public interface TModelMapper {
	
	int getCount(TModelEntity e);
	List<TModelEntity> selectPagination(TModelEntity e,RowBounds rowBounds);
	TModelEntity selectByPkey(String id);
	int insert(TModelEntity e);
	int update(TModelEntity e);
	int delete(String id);

}