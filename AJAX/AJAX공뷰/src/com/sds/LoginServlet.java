package com.sds;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet Call..");
		String id = request.getParameter("id");
		String pwd= request.getParameter("pwd");
		if(id.equals("aaa") && pwd.contentEquals("111")) {
			response.sendRedirect("loginok.html");
		}else {
			response.sendRedirect("loginfail.html");
			
		}
	}

}
