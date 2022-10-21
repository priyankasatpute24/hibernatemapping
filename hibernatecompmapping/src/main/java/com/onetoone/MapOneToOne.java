package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.getCurrentSession();
		Transaction tx=null;
		
		try {
			Answer ans= new Answer();
			ans.setAnswerId(102);
			ans.setAnswer("Cascading Style Sheet");
			
			Question que=new Question();
			que.setQuestionId(2);
			que.setQuestionName("CSS Stand For?");
			que.setAnswer(ans);
			
			ans.setQue_Id(que);
			ses=factory.openSession();
			tx=ses.beginTransaction();

			ses.save(que);
			ses.save(ans);
			tx.commit();
			
		}catch(Exception e) {
			
		}

	}

}
