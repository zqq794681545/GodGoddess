package com.godgoddess.god.mapper;

import java.util.List;
import com.godgoddess.god.entity.TImageEtEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.god.mapper.TImageEtMapper
 * @Description t_image_et表数据库操作接口
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 16:12:12
 * @version 1.0
 * @remark create by generator
 */

public interface TImageEtMapper {
	
	int getCount(TImageEtEntity e);
	List<TImageEtEntity> selectPagination(TImageEtEntity e,RowBounds rowBounds);
	TImageEtEntity selectByPkey(String id);
	int insert(TImageEtEntity e);
	int update(TImageEtEntity e);
	int delete(String id);

}