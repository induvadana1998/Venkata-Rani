package com.deloitte.thirdmvn.hibthird;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.deloitte.thirdmvn.hibthird.entity.Department;
import com.deloitte.thirdmvn.hibthird.entity.Employee;


public class App3 
{
	public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
       Employee e1=new Employee(101,"Ajay",1000);
       Employee e2=new Employee(102,"Max",6000);
       Employee e3=new Employee(103,"Babu",9000);
       Employee e4=new Employee(104,"Chandu",5000);
       ArrayList<Employee> el1=new ArrayList<Employee>();
       ArrayList<Employee> el2=new ArrayList<Employee>();
       el1.add(e1); el1.add(e3);
       el2.add(e2); el2.add(e4);
       Department d1=new Department(10,"Sales",el1);
       Department d2=new Department(20,"Marketing",el2);
       session.save(e1); session.save(e2);
       session.save(e3); session.save(e4); 
       session.save(d1); session.save(d2);
       session.beginTransaction().commit();
       session.close();
       factory.close();
    }
}
