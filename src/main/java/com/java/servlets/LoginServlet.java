package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
  
  
public class LoginServlet extends HttpServlet {   
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n = request.getParameter("userName");  
	    String p = request.getParameter("userPass");  
	    System.out.println("Line1");
	    
	    String n1 = request.getParameter("userName");  
	    String p1 = request.getParameter("userPass");  

	    if(p.equals("servlet")){  
	        RequestDispatcher rd = request.getRequestDispatcher("servlet2");  
	        rd.forward(request, response);  
		    System.out.println("Line2");
	    }  
	    else{  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/ReqDispatcher.html");  
	        rd.include(request, response);  
		    System.out.println("Line3");
        }  
    }  
}  