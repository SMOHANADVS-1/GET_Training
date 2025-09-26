package com.coforge.training.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.coforge.training.hibernatedemo.model.Student;

/** 
*Author :Sola.Sri
*Date   :Sep 24, 2025
*Time   :12:35:29 PM
*Project:hibernate-demo
*/

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf=cfg.buildSessionFactory();
        Session session =sf.openSession();
        
        Transaction t=session.beginTransaction();
        
        Student p1=new Student();
       
        p1.setName("rama");
        p1.setMarks(85);
        p1.setBranch("ece");
      
        
        //persist() is a JPA method to save the entity, used for annotated classes
        //used within transactional context
        //session.persist(p1);
        session.save(p1);
        
        t.commit();
        
        System.out.println("Data Succussfully Saved to Database");
        session.close();
        sf.close();

	}

}
