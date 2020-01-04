package com.del.test.dao;

import java.sql.*;
import java.util.ArrayList;
import com.del.test.entity.Courses;

public class CoursesDAO 
{
public boolean insertCourses(Courses cos)
        {
	      int count=0;
	      Connection con=null;
	      PreparedStatement pst=null;
	      String url="jdbc:oracle:thin:@localhost:1521:orcl";
	      try
	      {
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  con=DriverManager.getConnection(url,"scott","tiger");
	    	  pst=con.prepareStatement("insert into courses values(?,?,?,?)");
	    	  pst.setInt(1,cos.getCid()); pst.setString(2,cos.getCname());
	    	  pst.setInt(3,cos.getCd()); pst.setDouble(4,cos.getCfee());
	    	  count=pst.executeUpdate();
	      }
	      catch(Exception ex)
	      {
	    	  ex.printStackTrace();
	      }
	      finally
	      {
	    	  try 
	    	  {
	    		  if(pst!=null) pst.close();
	    		  if(con!=null) con.close();
	    	  }
	    	  
	      catch(Exception ex)
	      {
	    	  ex.printStackTrace();
	      }
	      }
	      return count==1;
	      }
        
public boolean modifyCourses(Courses cos)
{
	int count=0;
    Connection con=null;
    PreparedStatement pst=null;
    String url="jdbc:oracle:thin:@localhost:1521:orcl";
    try
    {
  	  Class.forName("oracle.jdbc.driver.OracleDriver");
  	  con=DriverManager.getConnection(url,"scott","tiger");
  	  pst=con.prepareStatement("update courses set cname=?,cfee=? where cid=?");
  	  pst.setString(1,cos.getCname()); pst.setDouble(2,cos.getCfee());
  	  pst.setInt(3,cos.getCid()); 
  	  count=pst.executeUpdate();
    }
    catch(Exception ex)
    {
  	  ex.printStackTrace();
    }
    finally
    {
  	  try 
  	  {
  		  if(pst!=null) pst.close();
  		  if(con!=null) con.close();
  	  }
  	  
    catch(Exception ex)
    {
  	  ex.printStackTrace();
    }
    }
    return count==1;
}
public boolean removeCourses(int cid)
{
	int count=0;
    Connection con=null;
    PreparedStatement pst=null;
    String url="jdbc:oracle:thin:@localhost:1521:orcl";
    try
    {
  	  Class.forName("oracle.jdbc.driver.OracleDriver");
  	  con=DriverManager.getConnection(url,"scott","tiger");
  	  pst=con.prepareStatement("delete * from courses where cid=? ");
  	  pst.setInt(1,cid); 
  	  count=pst.executeUpdate();
    }
    catch(Exception ex)
    {
  	  ex.printStackTrace();
    }
    finally
    {
  	  try 
  	  {
  		  if(pst!=null) pst.close();
  		  if(con!=null) con.close();
  	  }
  	  
    catch(Exception ex)
    {
  	  ex.printStackTrace();
    }
    }
    return count==1;
}
   public Courses getCourses(int cid)
   {
	      Courses cos=null;
	      Connection con=null;
	      PreparedStatement pst=null;
	      ResultSet rs=null;
	      String url="jdbc:oracle:thin:@localhost:1521:orcl";
	      try
	      {
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  con=DriverManager.getConnection(url,"scott","tiger");
	    	  pst=con.prepareStatement("select * from courses where cid=?");
	    	  pst.setInt(1,cid); 
	    	  rs=pst.executeQuery();
	    	  if(rs.next())
	    		  cos=new Courses(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
	      }
	      catch(Exception ex)
	      {
	    	  ex.printStackTrace();
	      }
	      finally
	      {
	    	  try 
	    	  {
	    		  if(rs!=null) rs.close();
	    		  if(pst!=null) pst.close();
	    		  if(con!=null) con.close();
	    	  }
	    	  
	      catch(Exception ex)
	      {
	    	  ex.printStackTrace();
	      }
	      }
	      return cos;
   }
public ArrayList<Courses> getCourses()
{
	ArrayList<Courses> clist = new ArrayList<Courses>();
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url,"scott","tiger");
		pst = con.prepareStatement("select * from courses");
		rs = pst.executeQuery();
		while(rs.next())
			clist.add(new Courses(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4)));
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
		
	}
	finally
	{
		try
		{
			if(rs!= null) rs.close();
			if(pst!=null) pst.close();
			if(con!=null) con.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	return clist; 
}
}

