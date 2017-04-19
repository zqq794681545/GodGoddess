package com.godgoddess.base.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseTypeEntity;
import com.godgoddess.base.mapper.TBaseTypeMapper;
import com.godgoddess.base.util.IDUtil;

/**
 * @ClassName com.godgoddess.service.TBaseTypeService
 * @Description T_BASE_TYPE表服务类
 * @author dzb@kingtopinfo.com
 * @date 2013-11-19 15:45:37
 * @version 1.0
 * @remark create by generator
 */
@Service
public class TBaseTypeService {
	
	@Autowired
	private TBaseTypeMapper tBaseTypeMapper;
	
	public List<TBaseTypeEntity> selectByCode(String code){
		return tBaseTypeMapper.selectByCode(code);
	}
	
	public List<TBaseTypeEntity> selectAllByCode(String code){
		return tBaseTypeMapper.selectAllByCode(code);
	}
	
	public TBaseTypeEntity selectByCodeAndValue(TBaseTypeEntity e){
		return tBaseTypeMapper.selectByCodeAndValue(e);
	}
	
	public int save(TBaseTypeEntity e){
		
		if(null != e && !"".equals(e.getId())){
			return update(e);
		}
		else{
			return insert(e);
		}
	}
	
	public int insert(TBaseTypeEntity e){
		
		e.setId(IDUtil.getId());
		e.setVer(1);
		e.setUpdateTime(new Date());
		int maxSequ = selectMaxSequ();
		e.setSequ(maxSequ+1);
		
		return tBaseTypeMapper.insert(e);
	}
	
	public int update(TBaseTypeEntity e){
		
		e.setUpdateTime(new Date());
		return tBaseTypeMapper.update(e);
	}
	
	private int delete(String id){
		return tBaseTypeMapper.delete(id);
	}
	
	public int deletes(String[] keys){
		int row = 0;
		for(String id : keys){
			row += delete(id);
		}
		return row;
	}
	
	public int move(TBaseTypeEntity e){
		TBaseTypeEntity ex = selectByKey(e.getId());
		updateVerByCode(ex.getCode());
		return tBaseTypeMapper.move(e);
	}
	/**
	* 以上为代码生成器自动生成
	*/
	
	public String getMaxVlueByCode(String code){
		return tBaseTypeMapper.selectMaxVlueByCode(code);
	}
	
	public List<TBaseTypeEntity> selectMenu(String type){
		return tBaseTypeMapper.selectMenu(type);
	}
	
	public int selectCountByPid(String pid){
		return tBaseTypeMapper.selectCountByPid(pid);
	}
	
	public int selectMaxSequ(){
		Integer i = tBaseTypeMapper.selectMaxSequ();
		if(null == i){
			return 0;
		}else{
			return Integer.valueOf(i);
		}
	}
	
	public int moveUpOrDown(TBaseTypeEntity current,TBaseTypeEntity np){
		int currentSequ = current.getSequ();
		current.setSequ(np.getSequ());
		np.setSequ(currentSequ);
		int row =tBaseTypeMapper.updateSequ(current);
		row += tBaseTypeMapper.updateSequ(np);
		TBaseTypeEntity e = selectByKey(current.getId());
		updateVerByCode(e.getCode());
		return row;
	}
	
	public List<TBaseTypeEntity> selectAll(){
		return tBaseTypeMapper.selectAll();
	}

	public TBaseTypeEntity selectByKey(String id) {
		return tBaseTypeMapper.selectByKey(id);
	}

	public List<TBaseTypeEntity> selectByQjxzqh(TBaseTypeEntity tBaseTypeEntity) {
		return tBaseTypeMapper.selectByQjxzqh(tBaseTypeEntity);
	}
	
	public int selectVerByCode(String code){
		return tBaseTypeMapper.selectVerByCode(code);
	}
	
	public int updateVerByCode(String code){
		
		TBaseTypeEntity tBaseTypeEntity = new TBaseTypeEntity();
		int ver = selectVerByCode(code);
		if(ver < 99999){
			ver = ver + 1;
		}else{
			ver = 0;
		}
		tBaseTypeEntity.setCode(code);
		tBaseTypeEntity.setVer(ver);
		tBaseTypeEntity.setUpdateTime(new Date());
		return tBaseTypeMapper.updateVerByCode(tBaseTypeEntity);
	}
	
	public String selectNameByCodeAndValue(String code, String value){
		
		TBaseTypeEntity e = new TBaseTypeEntity();
		e.setCode(code);
		e.setValue(value);
		return tBaseTypeMapper.selectNameByCodeAndValue(e);
	}
	
	public List<TBaseTypeEntity> selectNameAndValueByCode(String code){
		return tBaseTypeMapper.selectNameAndValueByCode(code);
	}
	
}