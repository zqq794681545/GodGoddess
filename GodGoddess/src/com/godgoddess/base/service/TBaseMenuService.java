package com.godgoddess.base.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseMenuEntity;
import com.godgoddess.base.mapper.TBaseMenuMapper;
import com.godgoddess.base.util.IDUtil;


/**
 * @ClassName com.kingtopinfo.base.service.TBaseMenuService
 * @Description T_BASE_MENU表服务类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-20 09:12:37
 * @version 1.0
 * @remark create by generator
 */
@Service
public class TBaseMenuService {
	
	@Autowired
	private TBaseMenuMapper tBaseMenuMapper;
	@Autowired
	private TBaseRoleMenuMappingService tBaseRoleMenuMappingService;
	
	public List<TBaseMenuEntity> select(){
		
		return tBaseMenuMapper.select();
	}
	public List<TBaseMenuEntity> selectroleOfMenu(String roleid){
		
		return tBaseMenuMapper.selectroleOfMenu(roleid);
	}
	
	public TBaseMenuEntity selectByKey(String id){
	
		return tBaseMenuMapper.selectByKey(id);
	}
	
	public int insert(TBaseMenuEntity e){
		e.setId(IDUtil.getId());
		e.setType("MENU");
		e.setUpdatetime(new Date());
		int maxSequ = selectMaxSequ();
		e.setSequ(maxSequ+1);
		return tBaseMenuMapper.insert(e);
	}
	
	public int update(TBaseMenuEntity e){
		e.setUpdatetime(new Date());
		int row =  tBaseMenuMapper.update(e);
		return row;
	}
	
	public int delete(String id){
		int rows = 0;
		List<TBaseMenuEntity> list = tBaseMenuMapper.selectByPid(id);
		if(list !=null && !list.isEmpty())
			for(TBaseMenuEntity each :list)
				delete(each.getId());
		rows+=tBaseMenuMapper.delete(id);
		tBaseRoleMenuMappingService.deleteByMenuid(id);
		return rows;
	}
	
	/**
	* 以上为代码生成器自动生成
	*/
	public List<TBaseMenuEntity> selectByPid(String pid){
		return tBaseMenuMapper.selectByPid(pid);
	}
	
	public int move(TBaseMenuEntity e){
		return tBaseMenuMapper.move(e);
	}
	
	public List<TBaseMenuEntity> selectByRole(List<String> roleids){
		if(roleids == null || roleids.isEmpty())
			return new ArrayList<TBaseMenuEntity>();
		return tBaseMenuMapper.selectByRole(roleids);
	}
	
	public int selectMaxSequ(){
		return tBaseMenuMapper.selectMaxSequ();
	}
	
	public int moveUpOrDown(TBaseMenuEntity current,TBaseMenuEntity np){
		int currentSequ = current.getSequ();
		current.setSequ(np.getSequ());
		np.setSequ(currentSequ);
		int rows = tBaseMenuMapper.updateSequ(current);
		rows += tBaseMenuMapper.updateSequ(np);
		return rows;
	}
	public List<TBaseMenuEntity> selectAllUrl(){
		return tBaseMenuMapper.selectAllUrl();
	}
	
	public List<String> selectRoleByUrl(String url){
		return tBaseMenuMapper.selectRoleByUrl(url);
	}
	
	public List<String> selectRoleByActionUrl(String url){
		return tBaseMenuMapper.selectRoleByActionUrl(url);
	}
	
	public List<TBaseMenuEntity> find(String rootUrl,String url) {
		return UrlService.findAction(rootUrl,url);
	}

	public List<TBaseMenuEntity> selectAction(String pid) {
		return tBaseMenuMapper.selectAction(pid);
	}

	public int urlIfExist(TBaseMenuEntity e) {
		return tBaseMenuMapper.urlIfExist(e);
	}

	
	public List<TBaseMenuEntity> selectByUrl(String url){
		return tBaseMenuMapper.selectByUrl(url);
	}
	
}