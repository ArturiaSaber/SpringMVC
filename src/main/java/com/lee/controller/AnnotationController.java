package com.lee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/annotation")
public class AnnotationController {
	
	@RequestMapping(value="/test")
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "第一个Spring MVC annotaion程序.");
		mav.setViewName("/test");
		
//		常见的返回类型是Model AndView 、String 和void 。其
//		中ModelAndView 类型中可以添加Model 数据，并指定视图j String 类型的返回值可以跳
//		转视图，但不能携带数据;而void 类型主要在异步请求时使用，它只返回数据，而不会跳
//		转视图。
		return mav;
	}
	
	@RequestMapping("/test2")
	public String test2(HttpServletRequest request, HttpServletResponse response, Model model) {
		model.addAttribute("msg", "Spring MVC return String");
		return "/test";
	}
}
