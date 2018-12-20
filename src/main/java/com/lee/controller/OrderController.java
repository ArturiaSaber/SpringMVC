package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lee.po.Orders;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping("/toFind")
	public String toFind() {
		return "order/orders";
	}
	
	@RequestMapping("/find")
	public String find(Orders orders) {
		System.out.println("find orders : " + orders);
		return "success";
	}
}
