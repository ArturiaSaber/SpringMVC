package com.lee.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lee.po.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/selectUser")
	public String selectUser(HttpServletRequest request) {
		String id = request.getParameter("id");
		System.out.println("id=" + id);
		return "/success";
	}
	
	@RequestMapping("/search")
	public String search() {
		return "user/restful";
	}
	
	//RESTFUL风格
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	@ResponseBody/*返回json对象数据*/
	public User selectUser2(@PathVariable("id") int id) {
		User user = new User();
		user.setId(id);
		user.setUsername("用户" + id);
		return user;
	}
	
	//http://localhost:8080/SpringMVCMyBatis/user/simpleDataBind?id=3
	@RequestMapping("/simpleDataBind")
	public String simpleDataBind(Integer id) {
		System.out.println("simple data bind[id=" + id + "]");
		return "/success";
	}
	
	//http://localhost:8080/SpringMVCMyBatis/user/requestParam?user_id=5
	@RequestMapping("/requestParam")
	public String requestParam(@RequestParam(value="user_id", required=true, defaultValue="4")Integer id) {
		System.out.println("requestParam[id=" + id + "]");
		return "success";
	}
	
	@RequestMapping("/toRegister")
	public String toRegister(HttpServletRequest request) {
		return "user/register";
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(User user) {
		System.out.println("POJO bind: " + user);
		return "success";
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		return "user/index";
	}
	
	@RequestMapping("/testJson")
	@ResponseBody/*返回json对象数据*/
	public User testJson(@RequestBody User user/* json数据绑定到POJO对象 */) {
		System.out.println(user);
		return user;
	}
}
