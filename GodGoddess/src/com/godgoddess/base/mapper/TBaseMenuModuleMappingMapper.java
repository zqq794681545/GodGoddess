package com.godgoddess.base.mapper;

import java.util.List;
import com.godgoddess.base.entity.TBaseMenuModuleMappingEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.base.mapper.TBaseMenuModuleMappingMapper
 * @Description T_BASE_MENU_MODULE_MAPPING表数据库操作接口
 * @author zqq
 * @date 2017-03-21 09:32:54
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseMenuModuleMappingMapper {
	
	int getCount(TBaseMenuModuleMappingEntity e);
	List<TBaseMenuModuleMappingEntity> selectPagination(TBaseMenuModuleMappingEntity e,RowBounds rowBounds);
	TBaseMenuModuleMappingEntity selectByPkey(String id);
	int insert(TBaseMenuModuleMappingEntity e);
	int update(TBaseMenuModuleMappingEntity e);
	int delete(String id);
	int deletemenuAndModule(TBaseMenuModuleMappingEntity e);

}