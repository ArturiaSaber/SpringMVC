package com.lee.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lee.dao.CustomerDao;
import com.lee.po.Customer;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {

	@Override
	public Customer findById(int id) {
		return this.getSqlSession().selectOne("com.lee.po.CustomerMapper.findById", id);
	}

}
