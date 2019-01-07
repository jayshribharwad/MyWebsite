package com.example.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
		System.out.println("Product Name : "+req.getParameter("pname"));
		System.out.println("Quantity : "+req.getParameter("qty"));
		System.out.println("Price : " +req.getParameter("pp"));
		
		String productName=req.getParameter("pname"); 
		String quantity=req.getParameter("qty");
		String price=req.getParameter("pp");
		
		int iquantity = Integer.parseInt(quantity);
		int pprice = Integer.parseInt(price);
		int totalAmount = iquantity * pprice ;
		//System.out.println("total : " +req.getParameter("totalAmount"));
		
		HttpSession cookie=req.getSession();
		if(cookie.getAttribute("total") == null ){
		cookie.setAttribute("total",totalAmount);
		}
		else{
		int previousTotal=(int)cookie.getAttribute("total") ;
		totalAmount = totalAmount + previousTotal;
		System.out.println("My total amount is : " +totalAmount);
		cookie.setAttribute("total",totalAmount);
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
