package com.manytomanybidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MapManyToManyBidirectional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder regBuilber = new StandardServiceRegistryBuilder();
        regBuilber.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = regBuilber.build();
		 
	    SessionFactory factory=new Configuration().configure().buildSessionFactory();
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();  
		 Student student1 = new Student("Priyanka","Satpute");
	        Student student2 = new Student("Amol", "Pachore");
	         
	        Subject subject1 = new Subject("Java");
	        Subject subject2 = new Subject("Phython");
	        Subject subject3 = new Subject("Ruby");
	 
	        student1.getSubjects().add(subject1);
	        student1.getSubjects().add(subject2);
	        student1.getSubjects().add(subject3);
	   
	        student2.getSubjects().add(subject1);
	        student2.getSubjects().add(subject2);
	 
	       
	        
	 
	        session.persist(student1);
	        session.persist(student2);
	 
	        t.commit();
		 	   session.close(); 
	}

}
