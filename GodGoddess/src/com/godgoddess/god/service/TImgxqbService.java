package com.godgoddess.god.service;

import com.godgoddess.god.mapper.TImgxqbMapper;
import com.godgoddess.god.entity.TImgxqbEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.RowBounds;

/**
 * @ClassName com.godgoddess.god.service.TImgxqbService
 * @Description t_imgxqb表Service类
 * @author 张秋权  zhangqq@kingtopinfo.com
 * @date 2017-05-03 16:10:16
 * @version 1.0
 * @remark create by generator
 */
@Service("TImgxqbService")
@Transactional
public class TImgxqbService {
	
	@Autowired
	private TImgxqbMapper tImgxqbMapper;
	
	/**
	 * 查询条数
	 * @param e TImgxqbEntity
	 * @return 条数
	 */
	public int getCount(TImgxqbEntity e){
		return tImgxqbMapper.getCount(e);
	}
	
	/**
	 * 按条件查询
	 * @param e TImgxqbEntity
	 * @param rowBounds 分页实体
	 * @return TImgxqbEntity
	 */
	public List<TImgxqbEntity> selectPagination(TImgxqbEntity e,int rows,int page){
		int start = (page-1)*rows;
		RowBounds rowBounds = new RowBounds(start,rows);
		return tImgxqbMapper.selectPagination(e,rowBounds);
	}
	public List<TImgxqbEntity> selectPaginas(TImgxqbEntity e){
		return tImgxqbMapper.selectPaginas(e);
	}
	
	/**
	 * 按id查询
	 * @param id 主键id
	 * @return TImgxqbEntity
	 */	
	public TImgxqbEntity selectByPkey(String id){
		return tImgxqbMapper.selectByPkey(id);
	}
	
	/**
	 * 新增
	 * @param e TImgxqbEntity
	 * @return 条数
	 */	
	public int insert(TImgxqbEntity e){
		return tImgxqbMapper.insert(e);
	}
	
	/**
	 * 编辑
	 * @param e TImgxqbEntity
	 * @return 条数
	 */	
	public int update(TImgxqbEntity e){
		return tImgxqbMapper.update(e);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return 条数
	 */	
	private int delete(String id){
		return tImgxqbMapper.delete(id);
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