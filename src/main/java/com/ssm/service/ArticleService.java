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

	int deleteByPrimaryKey(Long id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
    
    List<Article> selectAll();
    
    Pager<Article> findByPager(Pager<Article> pager);
}
