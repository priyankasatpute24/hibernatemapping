package com.namequery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Query;

public class MainNameQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();  
	    LeaenerAddress la=new LeaenerAddress();
	    la.setCity("pune khed");
	    
	    Learner learner=new Learner("Priyanka","Pune");
	    Learner learner1=new Learner("Riya","Pune");
	    
//	   learner.setLeaenerAddress(la);
//	   learner1.setLeaenerAddress(la,m);
//	    
	    session.save(learner);
	    session.save(learner1);
	    
//	    Query query=session.getNamedQuery("findLearnerById");
//	    query.setInteger("Id1", 27);
//	    List<Learner> list =query.list();
//	    for (int i=0; i<list.size();i++)
//	    {
//	    	System.out.println("lid:"+list.get(i).getLid());
//	    	System.out.println("lname:"+list.get(i).getLname());
//	    }
	    

	    t.commit();
	    session.close();
	}

}
