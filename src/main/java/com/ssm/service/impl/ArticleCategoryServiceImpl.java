package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.ArticleCategoryMapper;
import com.ssm.domain.ArticleCategory;
import com.ssm.service.ArticleCategoryService;

@Service
public class ArticleCategoryServiceImpl implements ArticleCategoryService{

	@Resource
	private ArticleCategoryMapper dao;
	
	@Override
	public ArticleCategory selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

}
