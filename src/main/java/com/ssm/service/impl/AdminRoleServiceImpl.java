package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.AdminRoleMapper;
import com.ssm.dao.BaseMapper;
import com.ssm.domain.AdminRole;
import com.ssm.service.AdminRoleService;

@Service
public class AdminRoleServiceImpl extends BaseServiceImpl<Long, AdminRole> implements AdminRoleService {

	@Resource
	private AdminRoleMapper dao;

	@Resource
	public void setDao(BaseMapper<Long, AdminRole> dao) {
		// TODO Auto-generated method stub
		super.setDao(this.dao);
	}

}
