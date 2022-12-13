package com.MyServlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
   {
	   int i = Integer.parseInt(req.getParameter("num1"));
	   int j = Integer.parseInt(req.getParameter("num2"));
	   
	   int k = i+j;
	   
       //using cookies
	   //Cookie cookie = new Cookie("k",k+ "");
	   //res.addCookie(cookie);
	   PrintWriter out = res.getWriter();
	   
	   
	  // HttpSession session = req.getSession(); using the session method
	  // session.setAttribute("k", k);
	   
	   res.sendRedirect("sq");
	   //USING REQUEST DISPATCHER METHOD
	   //req.setAttribute("k", k);
	   
	   //RequestDispatcher rd = req.getRequestDispatcher("sq");
	   //rd.forward(req, res);
   }
}
