package com.coforge.training.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.training.hibernatedemo.model.Employee;



//import org.hibernate.cfg.Configuration;

/**
 *Hibernate Demo Application to Save Employee Object using Hibernate  ORM TOOL
 *
 * using XML Configuration
 */
public class EmployeeApp 
{
    public static void main( String[] args )
    {
    	//Configure hibernate App
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        System.out.println("Configuration Object Created");
        
        //it is factory of sessions
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println("SessionFactory Object Created");
        
        
        //creating physical connection with db
        Session session = factory.openSession();
        System.out.println("session Object Created");
        
        //creating transaction object to handle transactions
        Transaction tx = session.beginTransaction();
        System.out.println("Transaction Object Created");
        
        //create Employee Object
        
        Employee emp = new Employee(106,"Vasudeva","krishna",100000,"Human Resource","vasudev@hibernate.org");
        
        //save() method is a Hibernate method to save the entity, used for non - annotated classes
        //it returns the generated identifier.
        //used without transactional context.
        
        session.save(emp);//Save Employee Object to DB
        
        
        tx.commit();
        System.out.println("Employee Object Saved");
        session.close();
        
    }
}
