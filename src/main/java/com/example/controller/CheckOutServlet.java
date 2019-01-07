package com.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckOutServlet  extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
		
			res.sendRedirect("checkout.jsp");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
	    
	    try {
			res.sendRedirect("checkout.jsp");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
