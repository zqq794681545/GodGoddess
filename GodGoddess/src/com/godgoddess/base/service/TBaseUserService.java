package com.godgoddess.base.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.entity.TBaseUserEntity;
import com.godgoddess.base.mapper.TBaseUserMapper;
import com.godgoddess.base.util.IDUtil;
import com.godgoddess.base.util.Md5;

/**
 * @ClassName com.godgoddess.base.service.TBaseUserService
 * @Description T_BASE_USER表服务类
 * @author dzb@kingtopinfo.com
 * @date 2014-02-18 09:21:43
 * @version 1.0
 * @remark create by generator
 */
@Service
public class TBaseUserService {
	
	@Autowired
	private TBaseUserMapper tBaseUserMapper;
	
//	public List<TBaseUserEntity> select(){
//		
//		return tBaseUserMapper.select();
//	}
//	
//	public TBaseUserEntity selectByKey(String id){
//	
//		return tBaseUserMapper.selectByKey(id);
//	}
	
	public int insert(TBaseUserEntity e){
			e.setPassword(Md5.md5Digest("2"));
			e.setId(IDUtil.getId());
			e.setPhone("18759608988");
			e.setGroupid(2);
			e.setReg_time(new Date());
		return tBaseUserMapper.insert(e);
	}
	public int selectName(){
		return tBaseUserMapper.selectName("18759608988");
	}
	public int updateNiCAndLogo(TBaseUserEntity e){
		e.setUpdatetime(new Date());
		return tBaseUserMapper.updateNiCAndLogo(e);
	}
	public int updatePassword(TBaseUserEntity e){
		e.setUpdatetime(new Date());
		return tBaseUserMapper.updatePassword(e);
	}
	
//	public int update(TBaseUserEntity e){
//		e.setUpdatetime(new Date());
//		return tBaseUserMapper.update(e);
//	}
	
//	public int updatePassword(TBaseUserEntity e){
//
//		e.setPassword(Md5.md5Digest(e.getPassword()));
//		return tBaseUserMapper.updatePassword(e);
//	}

	

	
	
	
//	public Integer getCount(TBaseUserEntity tBaseUserEntity){
//		return tBaseUserMapper.getCount(tBaseUserEntity);
//	}
//	
//	/**
//	* 以上为代码生成器自动生成
//	*/
//	public List<TBaseUserEntity> selectUnauthorizedPagination(TBaseUserEntity tBaseUserEntity,RowBounds rowBounds){
//		return tBaseUserMapper.selectUnauthorizedPagination(tBaseUserEntity,rowBounds);
//	}
//	
//	public Integer getUnauthorizedCount(TBaseUserEntity tBaseUserEntity){
//		return tBaseUserMapper.getUnauthorizedCount(tBaseUserEntity);
//	}
//	
//	public List<TBaseUserEntity> selectAuthorizedPagination(TBaseUserEntity tBaseUserEntity,RowBounds rowBounds){
//		return tBaseUserMapper.selectAuthorizedPagination(tBaseUserEntity,rowBounds);
//	}
//	
//	public Integer getAuthorizedCount(TBaseUserEntity tBaseUserEntity){
//		return tBaseUserMapper.getAuthorizedCount(tBaseUserEntity);
//	}
	
	public TBaseUserEntity selectByAccount(String phone){
		return tBaseUserMapper.selectByAccount(phone);
	}
//	public int selectByAccountnum(String account){
//		return tBaseUserMapper.selectByAccountnum(account);
//	}
//	
//	public String selectPasswordByAccount(String account){
//		
//		return tBaseUserMapper.selectPasswordByAccount(account);
//	}
	
//	public String selectXzqhByAccount(String account){
//		
//		return tBaseUserMapper.selectXzqhByAccount(account);
//	}
//	public List<String> selectRoleIdByAccount(String account){
//		
//		return tBaseUserMapper.selectRoleIdByAccount(account);
//	}
//	public int verifyUserInfo(String account, String password){
//		
//		TBaseUserEntity e = new TBaseUserEntity();
//		e.setAccount(account);
//		e.setPassword(password);
//		return tBaseUserMapper.verifyUserInfo(e);
//	}
	
//	//查询未加入机构用户
//	public List<TBaseUserEntity> selectUnaddGroupUserPagination(TBaseUserEntity tBaseUserEntity,RowBounds rowBounds){
//		return tBaseUserMapper.selectUnaddGroupUserPagination(tBaseUserEntity,rowBounds);
//	}
//	
//	public Integer getUnaddGroupUserCount(TBaseUserEntity tBaseUserEntity){
//		return tBaseUserMapper.getUnaddGroupUserCount(tBaseUserEntity);
//	}
//	
//	//查询已加入机构用户
//		public List<TBaseUserEntity> selectAddGroupUserPagination(TBaseUserEntity e,RowBounds rowBounds){
//			return tBaseUserMapper.selectAddGroupUserPagination(e,rowBounds);
//		}
//		
//		public Integer getAddGroupUserCount(TBaseUserEntity e){
//			return tBaseUserMapper.getAddGroupUserCount(e);
//		}
//	
//	//加入机构
//		public int AddGroupByGid(String userid,String gid){
//			TBaseUserEntity tBaseUserEntity = new TBaseUserEntity();
//			tBaseUserEntity.setGid(gid);
//			tBaseUserEntity.setId(userid);
//			return tBaseUserMapper.AddGroupByGid(tBaseUserEntity);
//		}
//		
//	//移除机构
//			public int DropGroupByGid(String userid){
//				return tBaseUserMapper.DropGroupByGid(userid);
//			}
//
//			public List<TBaseUserEntity> selectUserByGid(String gid) {
//				return tBaseUserMapper.selectUserByGid(gid);
//			}
//			
//			public String selectUserNameByKey(String assignee) {
//				return tBaseUserMapper.selectUserNameByKey(assignee);
//			}
}