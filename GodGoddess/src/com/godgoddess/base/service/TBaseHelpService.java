package com.godgoddess.base.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseHelpEntity;
import com.godgoddess.base.mapper.TBaseHelpMapper;
import com.godgoddess.base.util.IDUtil;


/**
 * @ClassName com.kingtopinfo.base.service.TBaseHelpService
 * @Description T_BASE_MENU表服务类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-20 09:12:37
 * @version 1.0
 * @remark create by generator
 */
@Service
public class TBaseHelpService {
	
	@Autowired
	private TBaseHelpMapper TBaseHelpMapper;
	
	public List<TBaseHelpEntity> select(){
		
		return TBaseHelpMapper.select();
	}
	
	public List<String> selectIdByName(String name){
	
		return TBaseHelpMapper.selectIdByName(name);
	}
	
	public int insert(TBaseHelpEntity e){
		e.setId(IDUtil.getId());
		e.setUpdatetime(new Date());
		int maxSequ = selectMaxSequ();
		e.setSequ(maxSequ+1);
		e.setState(1);
		return TBaseHelpMapper.insert(e);
	}
	
	public int update(TBaseHelpEntity e){
		e.setUpdatetime(new Date());
		return TBaseHelpMapper.update(e);
	}
	
	public int delete(String id){
		return TBaseHelpMapper.delete(id);
	}
	
	/**
	* 以上为代码生成器自动生成
	*/
	public List<TBaseHelpEntity> selectByPid(String pid){
		return TBaseHelpMapper.selectByPid(pid);
	}
	
	public int selectMaxSequ(){
		return TBaseHelpMapper.selectMaxSequ();
	}
	
	public int moveUpOrDown(TBaseHelpEntity current,TBaseHelpEntity np){
		int currentSequ = current.getSequ();
		current.setSequ(np.getSequ());
		np.setSequ(currentSequ);
		int rows = TBaseHelpMapper.updateSequ(current);
		rows += TBaseHelpMapper.updateSequ(np);
		return rows;
	}

	public List<String> selectUrlByName(String name) {
		return TBaseHelpMapper.selectUrlByName(name);
	}

	public List<TBaseHelpEntity> selectByRole(List<String> roleids){
		return TBaseHelpMapper.selectByRole(roleids);
	}
	
}