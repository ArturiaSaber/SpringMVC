package com.lee.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lee.dao.CustomerDao;
import com.lee.po.Customer;

public class CustomerMapperTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindById() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerMapper mapper = ctx.getBean(CustomerMapper.class);
		Customer customer = mapper.findById(1);
		System.out.println(customer);
	}

}
