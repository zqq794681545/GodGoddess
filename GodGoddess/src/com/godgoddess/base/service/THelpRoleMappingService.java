package com.godgoddess.base.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.THelpRoleMappingEntity;
import com.godgoddess.base.mapper.THelpRoleMappingMapper;
import com.godgoddess.base.util.IDUtil;

/**
 * @ClassName com.godgoddess.base.service.THelpRoleMappingService
 * @Description T_BASE_ROLE_MENU_MAPPING表服务类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:21:54
 * @version 1.0
 * @remark create by generator
 */
@Service
public class THelpRoleMappingService {
	
	@Autowired
	private THelpRoleMappingMapper tHelpRoleMappingMapper;
	
	public int insert(THelpRoleMappingEntity e){
		e.setId(IDUtil.getId());
		e.setUpdatetime(new Date());
		return tHelpRoleMappingMapper.insert(e);
	}
	
	public int deleteByRoleidAndMenuid(THelpRoleMappingEntity e){
	
		return tHelpRoleMappingMapper.deleteByRoleidAndMenuid(e);
	}
	
	/**
	* 以上为代码生成器自动生成
	*/
	public int deleteByMenuid(String menuid){
		return tHelpRoleMappingMapper.deleteByMenuid(menuid);
	}

	public int deleteByRoleid(String roleid){
		return tHelpRoleMappingMapper.deleteByRoleid(roleid);
	}

}