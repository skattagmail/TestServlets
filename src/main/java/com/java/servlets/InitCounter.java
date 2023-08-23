package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitCounter extends HttpServlet {

	int count; 
	public void init(ServletConfig config) throws ServletException { 
		super.init(config); 
		String initial = config.getInitParameter("initial"); 
		
		System.out.println("Initial..." + initial);
		try { 
			count = Integer.parseInt(initial); 
		} catch (NumberFormatException e) { 
			count = 0; 
		} 
		System.out.println("Count...."  + count);
		ServletContext contextObj = config.getServletContext();
		System.out.println(contextObj.getInitParameter("JDBCDriver"));
	} 
//	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		System.out.println("In service method...........");
//		res.setContentType("text/plain"); 
//		PrintWriter out = res.getWriter(); 
//		count++; 
//		out.println("Since loading (and with a possible initialization"); 
//		out.println("parameter figured in), this servlet has been accessed"); 
//		out.println(count + " times."); 	
//	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("In service method...........");
		res.setContentType("text/plain"); 
		PrintWriter out = res.getWriter(); 
		count++; 
		out.println("Since loading (and with a possible initialization"); 
		out.println("parameter figured in), this servlet has been accessed"); 
		out.println(count + " times."); 	
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("In service method...........");
		res.setContentType("text/plain"); 
		PrintWriter out = res.getWriter(); 
		count++; 
		out.println("Since loading (and with a possible initialization"); 
		out.println("parameter figured in), this servlet has been accessed"); 
		out.println(count + " times."); 	
	}


	} 
