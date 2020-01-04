package com.del.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.del.test.dao.CoursesDAO;
import com.del.test.entity.Courses;



@WebServlet("/CoursesCrudServlet")
public class CoursesCrudServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException 
	{
		
		 response.setContentType("text/html");
		    PrintWriter out=response.getWriter();
		    String submit=request.getParameter("sub");
		    CoursesDAO cdao=new CoursesDAO();
		    Courses c = new Courses();
		    String message="Sucessfully";
		    c.setCid(Integer.parseInt(request.getParameter("cid")));
		    RequestDispatcher rd=request.getRequestDispatcher("CoursesCrud.jsp");
		    if(submit.equals("Add_Courses") || submit.equals("Modify_Courses"))
		    {
		    	c.setCname(request.getParameter("cname"));
		    	c.setCd(Integer.parseInt(request.getParameter("cd")));
		    	c.setCfee(Double.parseDouble(request.getParameter("cfee")));
		    	 
		    	 if(submit.equals("Add_Courses"))
		    	 {
		    		 cdao.insertCourses(c);
		    		 message=message+"Inserted Record";
		    	 }
		    	 else
		    	 {
		    		 cdao.modifyCourses(c);
		    		 message=message+"Modified Record";
		    	 }
		    }
		    else if(submit.contentEquals("Delete_Courses")) 
		    {
		    	if(cdao.removeCourses(c.getCid()))
		    		message=message+"Record Deleted";
		    	else
		    		message="Deleted Failed";
		    }                                     
		    else if(submit.equals("Show_Courses"))  
		    {
		    	c=cdao.getCourses(c.getCid());
		    	request.setAttribute("cos", c);
		    	
		    }
		    out.print("<h1><center>"+message+"</center></h1>");
		    rd.include(request,response);
	    
	    }

}
