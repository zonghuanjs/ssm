package com.demo.test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.domain.Article;
import com.ssm.service.ArticleService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class BeanViewTest
{

	@Resource
	private ArticleService service;
	@Test  
    public void testGet(){  
         
		int pageNum = 1;
        
        //获取第1页，10条内容，默认查询总数count
		PageHelper.startPage(pageNum , 10);
        
		List<Article> list = this.service.selectAll();
        for(Article ov : list){  
            System.out.println(ov.getCreateDate());  
            System.out.println(ov.getTitle()); 
        }
		/*Article article = this.service.selectByPrimaryKey(9L);
		System.out.println(article.getTitle());
		//System.out.println(article.getCreateDate());
		System.out.println(article.getCategory().getName());
		//System.out.println(this.service.selectAll().size()); 
		*/
    }  
}
