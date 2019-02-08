package com.hotel.aws;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserReview extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public UserReview() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printWriter=null;
		String first_name = request.getParameter("first_name");
		System.out.println(first_name);
		String last_name = request.getParameter("last_name");
		System.out.println(last_name);
		String phone_number = request.getParameter("phone_number");
		System.out.println(phone_number);
		String email = request.getParameter("email");
		System.out.println(email);
		String review = request.getParameter("review");
		System.out.println(review);
		
		
	
		request.setAttribute("first_name", first_name);

		//HttpSession session = request.getSession();
		RequestDispatcher requestDispatcher=null;
		response.setContentType("text/html");
		if(first_name!=""){
			requestDispatcher=request.getRequestDispatcher("ReviewPage.jsp");
			requestDispatcher.forward(request, response);
		}
		else{
			printWriter=response.getWriter();
			printWriter.println("Please dont't keep first_name empty");
			printWriter.close();		}
	}



}
