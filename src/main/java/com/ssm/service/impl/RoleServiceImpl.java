package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.BaseMapper;
import com.ssm.dao.RoleMapper;
import com.ssm.domain.Role;
import com.ssm.service.RoleService;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Long, Role> implements RoleService {

	@Resource
	private RoleMapper dao;

	@Resource
	public void setDao(BaseMapper<Long, Role> dao) {
		// TODO Auto-generated method stub
		super.setDao(this.dao);
	}

}
