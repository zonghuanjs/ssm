package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.ArticleMapper;
import com.ssm.domain.Article;
import com.ssm.pager.Pager;
import com.ssm.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	private ArticleMapper dao;
	
	@Override
	public Article selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public List<Article> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Pager<Article> findByPager(Pager<Article> pager) {
		// TODO Auto-generated method stub
		return dao.findByPager(pager);
	}

}
