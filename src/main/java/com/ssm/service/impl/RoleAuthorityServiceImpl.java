package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.BaseMapper;
import com.ssm.dao.RoleAuthorityMapper;
import com.ssm.domain.RoleAuthority;
import com.ssm.service.RoleAuthorityService;

@Service
public class RoleAuthorityServiceImpl extends BaseServiceImpl<Long, RoleAuthority> implements RoleAuthorityService {

	@Resource
	private RoleAuthorityMapper dao;

	@Resource
	public void setDao(BaseMapper<Long, RoleAuthority> dao) {
		// TODO Auto-generated method stub
		super.setDao(this.dao);
	}

}
