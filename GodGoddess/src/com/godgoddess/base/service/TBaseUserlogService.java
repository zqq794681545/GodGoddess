package com.godgoddess.base.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseUserlogEntity;
import com.godgoddess.base.mapper.TBaseUserlogMapper;
import com.godgoddess.base.util.IDUtil;

/**
 * @ClassName com.godgoddess.base.service.TBaseUserlogService
 * @Description T_BASE_USERLOG表服务类
 * @author dzb@kingtopinfo.com
 * @date 2014-04-02 09:29:44
 * @version 1.0
 * @remark create by generator
 */
@Service
public class TBaseUserlogService {
	
	@Autowired
	private TBaseUserlogMapper tBaseUserlogMapper;
	
	public List<TBaseUserlogEntity> selectPagination(TBaseUserlogEntity e,RowBounds rowBounds){
		return tBaseUserlogMapper.selectPagination(e,rowBounds);
	}
	
	public int selectCount(TBaseUserlogEntity e){
		return tBaseUserlogMapper.selectCount(e);
	}
	
	public int insert(TBaseUserlogEntity e){
		e.setLogtime(new Date());
		e.setUserlogid(IDUtil.getId());
		return tBaseUserlogMapper.insert(e);
	}
	
	/**
	* 以上为代码生成器自动生成
	*/

}