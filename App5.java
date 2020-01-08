package com.deloitte.thirdmvn.hibthird;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.deloitte.thirdmvn.hibthird.entity.Department;
import com.deloitte.thirdmvn.hibthird.entity.Employee;


public class App5  //for cascade=cascadetype.remove
{
	public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
     Department d=session.get(Department.class,20);
     session.delete(d);
     session.beginTransaction().commit();
       session.close();
       factory.close();
    }
}
