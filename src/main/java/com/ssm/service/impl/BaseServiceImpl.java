package com.ssm.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssm.dao.BaseMapper;
import com.ssm.pager.Pager;
import com.ssm.service.BaseService;

@Service
public class BaseServiceImpl<PK extends Serializable, T> implements BaseService<PK, T> {

	private BaseMapper<PK, T> dao;

	public BaseMapper<PK, T> getDao() {
		return dao;
	}

	public void setDao(BaseMapper<PK, T> dao) {
		this.dao = dao;
	}

	@Override
	public int deleteByPrimaryKey(PK id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(T record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int insertSelective(T record) {
		// TODO Auto-generated method stub
		return dao.insertSelective(record);
	}

	@Override
	public T selectByPrimaryKey(PK id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(T record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(T record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(record);
	}

	@Override
	public List<T> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Pager<T> findByPager(Pager<T> pager) {
		// TODO Auto-generated method stub
		return dao.findByPager(pager);
	}

}
