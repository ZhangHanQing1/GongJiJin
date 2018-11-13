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
        //��ȡ����·��
        String path = req.getRequestURI();
        //��ȡsession����Ϊ�жϵ��ֶ�
        String user_name = (String) session.getAttribute("user_name");
            //�ж������ ·�����Ƿ������ ��¼ҳ�������
            //�ж� session�з��б�־�����û�б�־��ȥ��¼ҳ�棬��ִ֮�в�����
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
