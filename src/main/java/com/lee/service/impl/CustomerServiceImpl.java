package com.lee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lee.mapper.CustomerMapper;
import com.lee.po.Customer;
import com.lee.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public void add(Customer customer) {
		customerMapper.add(customer);
		int a = 1;
		int b = a + 1 - 2;
		int c = a/b;
		System.out.println(c);
	}

}
