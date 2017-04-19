package com.godgoddess.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godgoddess.base.mapper.TBaseMenuMapper;


@Service
public class TBaseResUrlService {
	
	@Autowired
	private TBaseMenuMapper tBaseMenuMapper;

	public List<String> getResUrl(String roleid){
		
		return tBaseMenuMapper.selectUrlByRoleId(roleid);
	}
}
