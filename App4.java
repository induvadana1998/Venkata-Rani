package com.deloitte.thirdmvn.hibthird;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.deloitte.thirdmvn.hibthird.entity.Department;
import com.deloitte.thirdmvn.hibthird.entity.Employee;

//navagating from dep to emp//
public class App4 
{
	public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
       Department d=session.get(Department.class,20);
       if(d!=null) //if we want lazy fetching then we can "//" if condition, then we will get dept only
       {
    	   System.out.println(d.getDname()+" "+d.getDeptno());
    	   for(Employee e:d.getElist())
    		   System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
       }
       
       session.close();
       factory.close();
    }
}
