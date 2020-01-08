package com.deloitte.thirdmvn.hibthird;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.deloitte.thirdmvn.hibthird.entity.Courses;
import com.deloitte.thirdmvn.hibthird.entity.Department;
import com.deloitte.thirdmvn.hibthird.entity.Employee;
import com.deloitte.thirdmvn.hibthird.entity.Student;





public class App8
{
	public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.addAnnotatedClass(Courses.class);
       cfg.addAnnotatedClass(Student.class);
       cfg.configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
      Query qry=session.createQuery("from Department");
      List<Department> dlist=qry.list();
      for(Department d:dlist)
      {
    	  System.out.println(d.getDeptno()+" "+d.getDname());
    	  List<Employee> elist=d.getElist();
    	  for(Employee e:elist)
    		  System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
      }
    	  
 
    		  

		   
       session.close();
       factory.close();
    }
}
