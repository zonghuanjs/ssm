package com.ssm.dao;

import java.io.Serializable;
import java.util.List;
import com.ssm.pager.Pager;

public interface BaseMapper<PK extends Serializable, T> {
	
	int deleteByPrimaryKey(PK id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(PK id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKeyWithBLOBs(T record);

	int updateByPrimaryKey(T record);

	List<T> selectAll();

	Pager<T> findByPager(Pager<T> pager);

}
