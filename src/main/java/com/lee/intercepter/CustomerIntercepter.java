package com.lee.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CustomerIntercepter implements HandlerInterceptor {

//	preHandler()方法:该方法会在控制器方法前执行，其返回值表示是否中断后续操作。当
//	其返回值为true 时，表示继续向下执行;当其返回值为false时，会中断后续的所有操作(包括
//	调用下一个拦截器和控制器类中的方法执行等) 。
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("CustomerIntercepter ... preHandle");
		return true;
	}

//	postHandle()方法:该方法会在控制器方法调用之后，且解析视图之前执行。可以通过此
//	方法对请求域中的模型和视图做出进一步的修改。
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("CustomerIntercepter ... postHandle postHandle");
	}
	
//	a仕erCompletion()方法: 该方法会在整个请求完成，即视图渲染结束之后执行。可以通过
//	此方法实现一些资源清理、记录曰志信息等工作。
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("CustomerIntercepter ... afterCompletion");
	}
}
