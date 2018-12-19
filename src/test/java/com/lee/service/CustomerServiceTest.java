package com.lee.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lee.po.Customer;

public class CustomerServiceTest {

	private CustomerService customerService;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		customerService = ctx.getBean(CustomerService.class);
	}

	@Test
	public void testAdd() {
		Customer customer = new Customer();
		customer.setUserName("客户3");;
		customer.setJobs("master");
		customer.setPhone("phone3333");
		customerService.add(customer);
	}

}
