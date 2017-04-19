package com.godgoddess.base.mapper;

import java.util.List;
import com.godgoddess.base.entity.TBaseHolidaysEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.base.mapper.TBaseHolidaysMapper
 * @Description T_BASE_HOLIDAYS表数据库操作接口
 * @author zqq
 * @date 2016-10-31 10:51:58
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseHolidaysMapper {
	
	int getCount(TBaseHolidaysEntity e);
	List<TBaseHolidaysEntity> selectPagination(TBaseHolidaysEntity e,RowBounds rowBounds);
	TBaseHolidaysEntity selectByPkey(String id);
	int insert(TBaseHolidaysEntity e);
	int update(TBaseHolidaysEntity e);
	int delete(String id);

}