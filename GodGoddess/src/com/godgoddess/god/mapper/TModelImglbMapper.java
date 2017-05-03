package com.godgoddess.god.mapper;

import java.util.List;
import com.godgoddess.god.entity.TModelImglbEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.god.mapper.TModelImglbMapper
 * @Description t_model_imglb表数据库操作接口
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 14:08:56
 * @version 1.0
 * @remark create by generator
 */

public interface TModelImglbMapper {
	
	int getCount(TModelImglbEntity e);
	List<TModelImglbEntity> selectPagination(TModelImglbEntity e,RowBounds rowBounds);
	List<TModelImglbEntity> selectAll();
	TModelImglbEntity selectByPkey(String id);
	int insert(TModelImglbEntity e);
	int update(TModelImglbEntity e);
	int delete(String id);

}