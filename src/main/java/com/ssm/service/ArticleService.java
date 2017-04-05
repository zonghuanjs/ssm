package com.ssm.service;

import java.util.List;

import com.ssm.domain.Article;
import com.ssm.pager.Pager;




/**
 * 文章服务接口
 * 
 */

public interface ArticleService
{

	 Article selectByPrimaryKey(Long id);
	 
	 List<Article> selectAll();
	 
	 Pager<Article> findByPager(Pager<Article> pager);
}
