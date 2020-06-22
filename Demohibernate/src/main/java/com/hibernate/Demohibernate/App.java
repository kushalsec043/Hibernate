package com.hibernate.Demohibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernatecaching.Alien;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName an = new AlienName();
    	an.setFname("first");
    	an.setLname("last");
    	an.setMname("middle");
    	
    	Alien obj = new Alien();
    	obj.setAid(101);
        obj.setColor("Green");
        obj.setAname(an);
    	
        //Alien obj = new Alien();
        
        /*obj.setAid(101);
        obj.setAname("navvv");
        obj.setColor("Green");*/
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
       
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        //obj = (Alien) session.get(Alien.class, 101);
        
        session.save(obj);
        
        tx.commit();
        
        System.out.println(obj);
    }
}
