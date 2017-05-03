package com.godgoddess.god.service;

import com.godgoddess.god.mapper.TImageEtMapper;
import com.godgoddess.god.entity.TImageEtEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

/**
 * @ClassName com.godgoddess.god.service.TImageEtService
 * @Description t_image_et表Service类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 16:12:12
 * @version 1.0
 * @remark create by generator
 */
@Service("TImageEtService")
@Transactional
public class TImageEtService {
	
	@Autowired
	private TImageEtMapper tImageEtMapper;
	
	/**
	 * 查询条数
	 * @param e TImageEtEntity
	 * @return 条数
	 */
	public int getCount(TImageEtEntity e){
		return tImageEtMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TImageEtEntity
	 * @param rowBounds 分页实体
	 * @return TImageEtEntity
	 */
	public List<TImageEtEntity> selectPagination(TImageEtEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tImageEtMapper.selectPagination(e,rowBounds);
	}
	
	/**
	 * 按id查询
	 * @param id 主键id
	 * @return TImageEtEntity
	 */	
	public TImageEtEntity selectByPkey(String id){
		return tImageEtMapper.selectByPkey(id);
	}
	
	/**
	 * 新增
	 * @param e TImageEtEntity
	 * @return 条数
	 */	
	public int insert(TImageEtEntity e){
		return tImageEtMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TImageEtEntity
	 * @return 条数
	 */	
	public int update(TImageEtEntity e){
		return tImageEtMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return 条数
	 */	
	private int delete(String id){
		return tImageEtMapper.delete(id);
	}
	
	/**
	 * 批量删除
	 * @param idArray id
	 * @return 条数
	 */	
	public int deletes(String[] keys){
		int row = 0;
		for(String id : keys){
			row += delete(id);
		}
		return row;
	}

}