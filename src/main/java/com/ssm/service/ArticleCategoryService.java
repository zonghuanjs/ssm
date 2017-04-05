package com.ssm.service;

import com.ssm.domain.ArticleCategory;




/**
 * 文章服务接口
 * 
 */

public interface ArticleCategoryService
{

	 ArticleCategory selectByPrimaryKey(Long id);
}
