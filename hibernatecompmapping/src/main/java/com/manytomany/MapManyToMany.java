package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import com.manytomany.Employee;

public class MapManyToMany {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder regBuilber = new StandardServiceRegistryBuilder();
        regBuilber.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = regBuilber.build();
		 
	    SessionFactory factory=new Configuration().configure().buildSessionFactory();
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();  
	        
	       
	    Employee employee1= new Employee();
	        employee1.setEmpName("Employee 1");
	        
	        
	        Employee employee2=new Employee();
	        employee2.setEmpName("Employee 2");

	        Department department1 = new Department();
	        department1 .setDepName("Computer Department");
	        
	        Department department2 = new Department();
	        department2 .setDepName("Electrical Department");
	        
	        Set s = new HashSet();
	        s.add(department1);
	        s.add(department2);
	        
	        
	        employee2.setDepartment(s);
	        
	       
	        session.save(employee1);
	        session.save(employee2);     
	      
	        t.commit();
	 	   session.close();
	    }
}
