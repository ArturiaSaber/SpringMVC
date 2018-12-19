package com.lee.po;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Customer {
	private int id;
	private String userName;
	private String jobs;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getJobs() {
		return jobs;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	/*//对象及其属性一行显示  
    System.out.println(ToStringBuilder.reflectionToString(u));  
    System.out.println(ToStringBuilder.reflectionToString(u, ToStringStyle.DEFAULT_STYLE));  
    //属性换行显示  
    System.out.println(ToStringBuilder.reflectionToString(u, ToStringStyle.MULTI_LINE_STYLE));  
    //不显示属性名，只显示属性值，在同一行显示  
    System.out.println(ToStringBuilder.reflectionToString(u, ToStringStyle.NO_FIELD_NAMES_STYLE));  
    //对象名称简写  
    System.out.println(ToStringBuilder.reflectionToString(u, ToStringStyle.SHORT_PREFIX_STYLE));  
    //只显示属性  
    System.out.println(ToStringBuilder.reflectionToString(u, ToStringStyle.SIMPLE_STYLE));  
    
    结果显示： 
    -------------ToStringBuilder------------------------- 
    test.User@141d683[name=zhengtian,age=25] 
    test.User@141d683[name=zhengtian,age=25] 
    test.User@141d683[ 
      name=zhengtian 
      age=25 
    ] 
    test.User@141d683[zhengtian,25] 
    User[name=zhengtian,age=25] 
    zhengtian,25*/
}
