package com.demo.test;


import java.util.Date;
import java.util.List;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.ssm.domain.Article;
import com.ssm.domain.ArticleCategory;
import com.ssm.service.ArticleCategoryService;
import com.ssm.service.ArticleService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class BeanViewTest
{

	@Resource
	private ArticleService service;
	
	@Resource
	private ArticleCategoryService categoryService;
	
	/*@Test
	public void testAdd(){
		Article article = new Article();
		article.setAuthor("test");
		article.setContent("a");
		article.setTitle("a1");
		article.setCreateDate(new Date());
		article.setModifyDate(new Date());
		ArticleCategory category = this.categoryService.selectByPrimaryKey(1L);
		article.setCategory(category);
		int i =this.service.insertSelective(article);
		System.out.println(i);
	}*/
	
	@Test
	public void testUpdate(){
		Article article = this.service.selectByPrimaryKey(2L);
		/*article.setAuthor("test");
		article.setContent("a");
		article.setTitle("a1");
		article.setCreateDate(new Date());
		article.setModifyDate(new Date());
		int i =this.service.updateByPrimaryKey(article);
		System.out.println(i);*/
		System.out.println(article.getCategory().getName());
	}
	
	/*@Test  
    public void testGet(){  
         
		int pageNum = 1;
        
        //获取第1页，10条内容，默认查询总数count
		PageHelper.startPage(pageNum , 10);
        
		List<Article> list = this.service.selectAll();
        for(Article ov : list){  
            System.out.println(ov.getCreateDate());  
            System.out.println(ov.getTitle()); 
        }
		Article article = this.service.selectByPrimaryKey(9L);
		System.out.println(article.getTitle());
		System.out.println(article.getCreateDate());
		System.out.println(article.getCategory().getName());
		System.out.println(this.service.selectAll().size()); 
		
    }  */
}
