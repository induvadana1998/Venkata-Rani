package com.del.first.servlet;
import javax.servlet.annotation.WebServlet;

import com.del.first.dao.UsersDAO;
import com.del.first.entity.Users;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AuthenticateServlet3") // should change in login. should give webservlet single name per program//  
public class AuthenticateServlet3 extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");  // method=post is added in the 4th line
		String username=request.getParameter("uid");
		String password=request.getParameter("pwd");
		Users u=new Users(username,password);
		RequestDispatcher rd=null;
		PrintWriter out=response.getWriter();
		out.println("<h1><center>");
		if(new UsersDAO().validateUser(u))
			out.println("Welcome to the Website");
		else
		{
			out.println("Invalid Username/Password");
		rd=request.getRequestDispatcher("login.html");
		rd.include(request, response);
		out.println("</center></h1>");
		}
	}
}
