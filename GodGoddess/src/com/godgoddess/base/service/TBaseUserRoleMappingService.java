package com.godgoddess.base.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseUserRoleMappingEntity;
import com.godgoddess.base.mapper.TBaseUserRoleMappingMapper;
import com.godgoddess.base.util.IDUtil;

/**
 * @ClassName com.godgoddess.base.service.TBaseUserRoleMappingService
 * @Description T_BASE_USER_ROLE_MAPPING表服务类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:21:47
 * @version 1.0
 * @remark create by generator
 */
@Service
public class TBaseUserRoleMappingService {
	
	@Autowired
	private TBaseUserRoleMappingMapper tBaseUserRoleMappingMapper;
	
	public int inserts(TBaseUserRoleMappingEntity e){

		String[] useridsarr = e.getUserids();
		int t = 0;
		for(int i=0; i<useridsarr.length; i++){
			
			TBaseUserRoleMappingEntity e2 = new TBaseUserRoleMappingEntity();
			e2.setId(IDUtil.getId());
			e2.setUserid(useridsarr[i]);
			e2.setRoleid(e.getRoleid());
			e2.setUpdatetime(new Date());
			insert(e2);
			t++;
		}
		return t;
	}
	
	public int insert(TBaseUserRoleMappingEntity e){

		return tBaseUserRoleMappingMapper.insert(e);
	}
	
	public int deletesByRoidAndUserid(TBaseUserRoleMappingEntity e){
		
		String[] useridsarr = e.getUserids();
		int t = 0;
		for(int i=0; i<useridsarr.length; i++){
			
			TBaseUserRoleMappingEntity e2 = new TBaseUserRoleMappingEntity();
			e2.setUserid(useridsarr[i]);
			e2.setRoleid(e.getRoleid());
			deleteByRoidAndUserid(e2);
			t++;
		}
		return t;
	}
	
	public int deleteByRoidAndUserid(TBaseUserRoleMappingEntity e){
		
		return tBaseUserRoleMappingMapper.deleteByRoidAndUserid(e);
	}
	
	/**
	* 以上为代码生成器自动生成
	*/
	
	public int deleteByUserid(String userid){
		return tBaseUserRoleMappingMapper.deleteByUserid(userid);
	}

	public int deleteByRoleid(String roleid){
		return tBaseUserRoleMappingMapper.deleteByRoleid(roleid);
	}
}