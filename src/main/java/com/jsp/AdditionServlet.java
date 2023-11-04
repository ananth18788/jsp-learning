package com.jsp; 
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
{
	int i = Integer.parseInt(req.getParameter("n1"));
	int j = Integer.parseInt(req.getParameter("n2"));
	int k = i+j;
	req.setAttribute("k", k);
	RequestDispatcher rd = req.getRequestDispatcher("sq");
	rd.forward(req, res);
	
// 1st program
//	PrintWriter out = res.getWriter();
//	out.println("Addition of " + i+ " and " + j + "is " + k );
//	 another type :
//	 res.getwriter.println("Addition of " + i+ " and " + j + "is " + k);
}
}