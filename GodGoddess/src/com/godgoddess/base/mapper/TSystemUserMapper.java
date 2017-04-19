package com.godgoddess.base.mapper;

import java.util.List;
import com.godgoddess.base.entity.TSystemUserEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.base.mapper.TSystemUserMapper
 * @Description T_SYSTEM_USER表数据库操作接口
 * @author zqq
 * @date 2016-10-10 09:50:59
 * @version 1.0
 * @remark create by generator
 */

public interface TSystemUserMapper {
	
	int getCount(TSystemUserEntity e);
	List<TSystemUserEntity> selectPagination(TSystemUserEntity e,RowBounds rowBounds);
	TSystemUserEntity getByPkey(String system_user_id);
	int insert(TSystemUserEntity e);
	int update(TSystemUserEntity e);
	int delete(String system_user_id);

}