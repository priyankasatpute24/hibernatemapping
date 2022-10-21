package com.onetomany;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Table;



@Entity

public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;    
	private String qname;  
	
	@OneToMany(mappedBy= "que")
	private List<Answer> ans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	
	
}
