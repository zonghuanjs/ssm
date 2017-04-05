package com.ssm.dao;

import java.util.List;




import com.ssm.domain.Article;
import com.ssm.pager.Pager;

public interface ArticleMapper {
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