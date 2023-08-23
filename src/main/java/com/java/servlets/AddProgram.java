package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddProgram extends HttpServlet{
	public void init(ServletConfig config) throws ServletException { 
		super.init(config); 
		ServletContext contextObj = config.getServletContext();
		System.out.println(contextObj.getInitParameter("JDBCDriver"));
	} 
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		System.out.println(req.getParameterNames());
		int k= i+j;
		PrintWriter out = res.getWriter();
		out.println("Result is: "+k);
	}
}