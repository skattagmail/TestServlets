package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
  
public class WelcomeServlet extends HttpServlet {  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
	    System.out.println("Line1");
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    System.out.println("Line2");	          
	    String n = request.getParameter("userName");  
	    out.print("Welcome "+n);  
    }  
  
}  