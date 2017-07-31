package com.demo.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.domain.Admin;
import com.ssm.service.AdminService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
@Transactional
public class AdminTest {

	@Resource
	private AdminService service;

	/*@Test
	public void select() {

		Admin record = this.service.selectByPrimaryKey(1L);
		System.out.println(record.getUsername());

	}*/
	
	@Test
	public void add() {

		Admin record = new Admin();
		record.setUsername("zong");
		record.setPassword("123");
		int i = this.service.insert(record);
		System.out.println(i);

	}
}
