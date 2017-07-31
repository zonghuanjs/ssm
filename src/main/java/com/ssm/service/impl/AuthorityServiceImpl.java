package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.AuthorityMapper;
import com.ssm.dao.BaseMapper;
import com.ssm.domain.Authority;
import com.ssm.service.AuthorityService;

@Service
public class AuthorityServiceImpl extends BaseServiceImpl<Long, Authority> implements AuthorityService {

	@Resource
	private AuthorityMapper dao;

	@Resource
	public void setDao(BaseMapper<Long, Authority> dao) {
		// TODO Auto-generated method stub
		super.setDao(this.dao);
	}

}
