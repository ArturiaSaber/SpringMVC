package com.lee.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lee.po.Customer;

public class CustomerDaoTest {
	
	@Test
	public void findByIdTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao dao = (CustomerDao)ctx.getBean("customerDao");
		Customer customer = dao.findById(1);
		System.out.println(customer);
	}
}
