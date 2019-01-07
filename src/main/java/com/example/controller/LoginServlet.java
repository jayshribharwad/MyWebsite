package com.example.controller;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet  {
	// doget, dopost, init, service
	 
//	public void doGet(HttpServletRequest req, HttpServletResponse res) {
//		System.out.println("Entering get method");
//		System.out.println("customer passed userid : "+req.getParameter("email"));
//		System.out.println("customer passed password : "+req.getParameter("psw"));
//		System.out.println("Exiting get method");
//		}
//
//		public void doPost(HttpServletRequest req, HttpServletResponse res) {
//		    System.out.println("Entering post  method");
//		    System.out.println("customer passed userid : "+req.getParameter("email"));
//		    System.out.println("customer passed password : "+req.getParameter("psw"));
//		    System.out.println("Exiting post  method");
//		}
		
		public void doGet(HttpServletRequest req, HttpServletResponse res) {
			try {
			System.out.println("customer passed userid : "+req.getParameter("email"));
			System.out.println("customer passed password : "+req.getParameter("psw"));
			String userid=req.getParameter("email"); // john
			String password=req.getParameter("psw"); // john

			        if(userid.equals("java" ) && password.equals("jee"))
			        {
			            req.getSession().setAttribute("isLoggedin", true);
			            res.sendRedirect("mypage.html");
			        }
			        else
			        {
			            req.getSession().setAttribute("isLoggedin", false);
			            res.sendRedirect("error.html");
			        }
			    }
			    catch(Exception e) {
			        e.printStackTrace();
			    }
			    
			}
			public void doPost(HttpServletRequest req, HttpServletResponse res) {
			    doGet(req,res);
			}
	}


