package com.godgoddess.base.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseRoleMenuMappingEntity;
import com.godgoddess.base.mapper.TBaseRoleMenuMappingMapper;
import com.godgoddess.base.util.IDUtil;


/**
 * @ClassName com.kingtopinfo.base.service.TBaseRoleMenuMappingService
 * @Description T_BASE_ROLE_MENU_MAPPING表服务类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:21:54
 * @version 1.0
 * @remark create by generator
 */
@Service
public class TBaseRoleMenuMappingService {
	
	@Autowired
	private TBaseRoleMenuMappingMapper tBaseRoleMenuMappingMapper;
	
	public int insert(TBaseRoleMenuMappingEntity e){
		e.setId(IDUtil.getId());
		e.setUpdatetime(new Date());
		return tBaseRoleMenuMappingMapper.insert(e);
	}
	
	public int deleteByRoleidAndMenuid(TBaseRoleMenuMappingEntity e){
	
		return tBaseRoleMenuMappingMapper.deleteByRoleidAndMenuid(e);
	}
	
	/**
	* 以上为代码生成器自动生成
	*/
	public int deleteByMenuid(String menuid){
		return tBaseRoleMenuMappingMapper.deleteByMenuid(menuid);
	}

	public int deleteByRoleid(String roleid){
		return tBaseRoleMenuMappingMapper.deleteByRoleid(roleid);
	}

	public List<TBaseRoleMenuMappingEntity> selectByMenuid() {
		return tBaseRoleMenuMappingMapper.selectByMenuid();
	}
}