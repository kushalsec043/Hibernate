package com.telusko.JpawithMaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	/*Alien a1 = new Alien();
    	a1.setAid(101);
    	a1.setAname("aaa");
    	a1.setTech("ios");*/
    
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	//em.getTransaction().begin();
    	//em.persist(a1);
    	//em.getTransaction().commit();
    	
       Alien a = em.find(Alien.class, 101);
       
       System.out.println(a);
    }
}
