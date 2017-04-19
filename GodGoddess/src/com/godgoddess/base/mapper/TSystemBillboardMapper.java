package com.godgoddess.base.mapper;

import java.util.List;
import com.godgoddess.base.entity.TSystemBillboardEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.base.mapper.TSystemBillboardMapper
 * @Description T_SYSTEM_BILLBOARD表数据库操作接口
 * @author zqq
 * @date 2016-10-12 10:33:25
 * @version 1.0
 * @remark create by generator
 */

public interface TSystemBillboardMapper {
	
	int getCount(TSystemBillboardEntity e);
	List<TSystemBillboardEntity> selectPagination(TSystemBillboardEntity e,RowBounds rowBounds);
	TSystemBillboardEntity getByPkey(String system_billboard_id);
	int insert(TSystemBillboardEntity e);
	int update(TSystemBillboardEntity e);
	int delete(String system_billboard_id);

}