package com.godgoddess.base.mapper;

import java.util.List;
import com.godgoddess.base.entity.TBaseDocumentEntity;
import org.apache.ibatis.session.RowBounds;
/**
 * @ClassName com.godgoddess.base.mapper.TBaseDocumentMapper
 * @Description T_BASE_DOCUMENT表数据库操作接口
 * @author zqq
 * @date 2016-10-14 13:49:04
 * @version 1.0
 * @remark create by generator
 */

public interface TBaseDocumentMapper {
	
	int getCount(TBaseDocumentEntity e);
	List<TBaseDocumentEntity> selectPagination(TBaseDocumentEntity e,RowBounds rowBounds);
	TBaseDocumentEntity getByPkey(String base_document_id);
	int insert(TBaseDocumentEntity e);
	int update(TBaseDocumentEntity e);
	int delete(String base_document_id);
	List<TBaseDocumentEntity> selectBySrcId(String src_id);

}