package com.godgoddess.base.mapper;

import java.util.List;
import com.godgoddess.base.entity.TSctableEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.base.mapper.TSctableMapper
 * @Description t_sctable表数据库操作接口
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 15:36:26
 * @version 1.0
 * @remark create by generator
 */

public interface TSctableMapper {
	
	int getCount(TSctableEntity e);
	List<TSctableEntity> selectPagination(TSctableEntity e,RowBounds rowBounds);
	TSctableEntity selectByPkey(String id);
	int insert(TSctableEntity e);
	int update(TSctableEntity e);
	int delete(String id);

}