package com.godgoddess.base.mapper;

import java.util.List;
import com.godgoddess.base.entity.TTypeEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.base.mapper.TTypeMapper
 * @Description t_type表数据库操作接口
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 11:37:24
 * @version 1.0
 * @remark create by generator
 */

public interface TTypeMapper {
	
	int getCount(TTypeEntity e);
	List<TTypeEntity> selectPagination(TTypeEntity e,RowBounds rowBounds);
	TTypeEntity selectByPkey(String id);
	int insert(TTypeEntity e);
	int update(TTypeEntity e);
	int delete(String id);

}