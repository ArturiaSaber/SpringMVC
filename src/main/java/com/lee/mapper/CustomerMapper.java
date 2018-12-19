package com.lee.mapper;

import com.lee.po.Customer;

public interface CustomerMapper {
	Customer findById(int id);
	void add(Customer customer);
}
