package com.deloitte.thirdmvn.hibthird;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.thirdmvn.hibthird.entity.AadharCard;
import com.deloitte.thirdmvn.hibthird.entity.Person;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
       AadharCard ac=new AadharCard(7001,"Govt of India",new Date(2019,11,10));
       Person p1=new Person("Ajay Sharma",23,"HitechCity",ac);
       Transaction trans=session.beginTransaction();
       session.save(ac);
       session.save(p1);
       trans.commit();
       session.close();
       factory.close();
    }
}
