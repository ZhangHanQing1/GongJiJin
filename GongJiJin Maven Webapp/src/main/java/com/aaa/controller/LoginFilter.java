package com.aaa.controller;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
public class LoginFilter implements Filter {
     

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        //获取请求路径
        String path = req.getRequestURI();
        //获取session中作为判断的字段
        String user_name = (String) session.getAttribute("user_name");
            //判断请求的 路径中是否包含了 登录页面的请求
            //判断 session中否有标志，如果没有标志，去登录页面，反之执行操作！
            if (user_name==null&&path.indexOf("/deng.jsp")==-1) {
               req.getRequestDispatcher("deng.jsp").forward(req, resp); 
            } else {
            	 filterChain.doFilter(req, resp);
            }
        }
 
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
