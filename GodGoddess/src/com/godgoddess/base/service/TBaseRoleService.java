package com.godgoddess.base.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseRoleEntity;
import com.godgoddess.base.mapper.TBaseRoleMapper;
import com.godgoddess.base.util.IDUtil;


/**
 * @ClassName com.kingtopinfo.base.service.TBaseRoleService
 * @Description T_BASE_ROLE表服务类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:22:06
 * @version 1.0
 * @remark create by generator
 */
@Service
public class TBaseRoleService {
	
	@Autowired
	private TBaseRoleMapper tBaseRoleMapper;
	@Autowired
	private TBaseUserRoleMappingService tBaseUserRoleMappingService;
	@Autowired
	private TBaseRoleMenuMappingService tBaseRoleMenuMappingService;
	
	public List<TBaseRoleEntity> select(){
		
		return tBaseRoleMapper.select();
	}
	
	public TBaseRoleEntity selectByKey(String id){
	
		return tBaseRoleMapper.selectByKey(id);
	}
	
	public List<TBaseRoleEntity> selectByPid(String pid){
		return tBaseRoleMapper.selectByPid(pid);
	}
	
	public int insert(TBaseRoleEntity e){
		e.setId(IDUtil.getId());
		e.setUpdatetime(new Date());
		return tBaseRoleMapper.insert(e);
	}
	
	public int update(TBaseRoleEntity e){
		e.setUpdatetime(new Date());
		return tBaseRoleMapper.update(e);
	}
	
	public int move(TBaseRoleEntity e){
		
		return tBaseRoleMapper.move(e);
	}
	
	public int delete(String id){
		int rows = 0;
		List<TBaseRoleEntity> list = tBaseRoleMapper.selectByPid(id);
		if(list !=null && !list.isEmpty())
			for(TBaseRoleEntity each :list)
				delete(each.getId());
		tBaseUserRoleMappingService.deleteByRoleid(id);
		tBaseRoleMenuMappingService.deleteByRoleid(id);
		rows+=tBaseRoleMapper.delete(id);
		return rows;
	}
	
	/**
	* 以上为代码生成器自动生成
	*/

	public List<TBaseRoleEntity> selectAddedMenuRoles(String menuid){
		return tBaseRoleMapper.selectAddedMenuRoles(menuid);
	}
	
	public List<String> selectRoleIdByAccount(String account){	
		return tBaseRoleMapper.selectRoleIdByAccount(account);
	}
	
	public List<TBaseRoleEntity> selectRolesByUserid(String userid){	
		return tBaseRoleMapper.selectRolesByUserid(userid);
	}

	public List<TBaseRoleEntity> selectAddedHelpRoles(String menuid){
		return tBaseRoleMapper.selectAddedHelpRoles(menuid);
	}

	public List<TBaseRoleEntity> selectMKMenuRoles(String menuid) {
		return tBaseRoleMapper.selectMKMenuRoles(menuid);
	}

	public List<TBaseRoleEntity> selectRoleNameByAccount(String account) {
		return tBaseRoleMapper.selectRoleNameByAccount(account);
	}
}