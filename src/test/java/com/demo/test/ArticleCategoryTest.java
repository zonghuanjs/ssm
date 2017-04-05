package com.demo.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.domain.ArticleCategory;
import com.ssm.service.ArticleCategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class ArticleCategoryTest
{

	@Resource
	private ArticleCategoryService service;
	@Test  
    public void testGet(){  
        
		ArticleCategory category = this.service.selectByPrimaryKey(1L);
		System.out.println(category.getName());
         
    }  
}
