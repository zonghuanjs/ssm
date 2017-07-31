package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.ArticleCategoryMapper;
import com.ssm.dao.BaseMapper;
import com.ssm.domain.ArticleCategory;
import com.ssm.service.ArticleCategoryService;

@Service
public class ArticleCategoryServiceImpl extends BaseServiceImpl<Long, ArticleCategory> implements ArticleCategoryService{

	@Resource
	private ArticleCategoryMapper dao;

	@Resource
	public void setDao(BaseMapper<Long, ArticleCategory> dao) {
		// TODO Auto-generated method stub
		super.setDao(this.dao);
	}
	

}
