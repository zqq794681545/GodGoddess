package com.godgoddess.god.mapper;

import java.util.List;
import com.godgoddess.god.entity.TModelImggroupEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.god.mapper.TModelImggroupMapper
 * @Description t_model_imggroup表数据库操作接口
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 14:45:50
 * @version 1.0
 * @remark create by generator
 */

public interface TModelImggroupMapper {
	
	int getCount(TModelImggroupEntity e);
	List<TModelImggroupEntity> selectPagination(TModelImggroupEntity e,RowBounds rowBounds);
	TModelImggroupEntity selectByPkey(String id);
	int insert(TModelImggroupEntity e);
	int update(TModelImggroupEntity e);
	int delete(String id);

}