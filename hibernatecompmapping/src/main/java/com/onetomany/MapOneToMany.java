package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MapOneToMany {
	public static void main(String[] args) {    
	     
 
	    
	    SessionFactory factory=new Configuration().configure().buildSessionFactory();
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();    
	        
	   Question question=new Question();
	   question.setQname("Sql Commands");
	   
	   Answer answer=new Answer();
	   answer.setAnsId(101);
	   answer.setSolution("DDL");
	   answer.setQue(question);
	   
	   Answer answer1=new Answer();
	   answer.setAnsId(102);
	   answer1.setSolution("DML");
	   answer1.setQue(question);
	   
	   Answer answer2=new Answer();
	   answer2.setAnsId(103);
	   answer2.setSolution("DCL");
	   answer2.setQue(question);
	   
	   Answer answer3=new Answer();
	   answer3.setAnsId(104);
	   answer3.setSolution("TCL");
	   answer3.setQue(question);
	   
	   
	  List<Answer> list1=new ArrayList<Answer>();
	  list1.add(answer1);
	  list1.add(answer2);
	  list1.add(answer3);
	  list1.add(answer);
	  
	  question.setAns(list1);
	  session.save(question);
	  session.save(answer);
	  session.save(answer1);
	  session.save(answer2);
	  session.save(answer3);
	  t.commit();
	   session.close();
	    
	}    
}
