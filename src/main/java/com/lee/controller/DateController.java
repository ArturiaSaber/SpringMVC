package com.lee.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/date")
public class DateController {
	
	@RequestMapping("/converter")
	public String converter(Date date) {
		//有多个converter时，最后定义的才有效，如后面定义的fastjson
		//http://localhost:8080/SpringMVCMyBatis/date/converter?date=2018-12-20%2010:54:01
		System.out.println(date);
		return "success";
	}
}
