package com.godgoddess.god.mapper;

import java.util.List;
import com.godgoddess.god.entity.TImgxqbEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.god.mapper.TImgxqbMapper
 * @Description t_imgxqb表数据库操作接口
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 16:10:16
 * @version 1.0
 * @remark create by generator
 */

public interface TImgxqbMapper {
	
	int getCount(TImgxqbEntity e);
	List<TImgxqbEntity> selectPagination(TImgxqbEntity e,RowBounds rowBounds);
	TImgxqbEntity selectByPkey(String id);
	int insert(TImgxqbEntity e);
	int update(TImgxqbEntity e);
	int delete(String id);

}