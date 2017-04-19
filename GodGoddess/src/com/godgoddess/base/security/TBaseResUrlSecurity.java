package com.godgoddess.base.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.godgoddess.base.entity.TBaseMenuEntity;
import com.godgoddess.base.entity.TBaseRoleEntity;
import com.godgoddess.base.service.TBaseMenuService;
import com.godgoddess.base.service.TBaseResUrlService;
import com.godgoddess.base.service.TBaseRoleService;

public class TBaseResUrlSecurity{
	
	@Autowired
	private TBaseResUrlService tBaseResUrlService;
	@Autowired
	private TBaseRoleService tBaseRoleService;
	@Autowired
	private TBaseMenuService tBaseMenuService;

	public List<String> getResUrl(String roleid){
		
		return tBaseResUrlService.getResUrl(roleid);
	}
	
	public List<TBaseRoleEntity> getRoleid(){
		
		return tBaseRoleService.select();
	}
	
	public List<TBaseMenuEntity> getAllUrl(){
		return tBaseMenuService.selectAllUrl();
	}
	
	public List<String> getRoleByUrl(String url){
		if(url.indexOf(".action")<0)
			return tBaseMenuService.selectRoleByUrl(url);
		else{
			List<String> result = new ArrayList<String>();
			List<TBaseMenuEntity> list = tBaseMenuService.selectByUrl(url);
			if(list != null && !list.isEmpty()){
				for(TBaseMenuEntity each:list){
					TBaseMenuEntity t = tBaseMenuService.selectByKey(each.getPid());
					if(t != null)
						result.addAll(tBaseMenuService.selectRoleByUrl(t.getUrl()));
				}
			}
			return result;
		}
			
	}

	public TBaseMenuEntity getByMenuId(String menuId){
		return tBaseMenuService.selectByKey(menuId);
	}
}
