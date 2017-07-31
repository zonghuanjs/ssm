package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.AdminMapper;
import com.ssm.dao.BaseMapper;
import com.ssm.domain.Admin;
import com.ssm.service.AdminService;

@Service
public class AdminServiceImpl extends BaseServiceImpl<Long, Admin> implements AdminService {

	@Resource
	private AdminMapper dao;

	@Resource
	public void setDao(BaseMapper<Long, Admin> dao) {
		// TODO Auto-generated method stub
		super.setDao(this.dao);
	}

}
