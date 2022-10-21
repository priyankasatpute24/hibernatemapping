package com.namequery;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({@NamedQuery(name="findLearnerById",query="from Learner  where lid=:Id1")})
@Entity
@Access(AccessType.FIELD)
public class Learner {
  
	@Id
	@GeneratedValue
	int lid;
	String lname;
	
	String lcity;
	
	@Embedded
	private String LeaenerAddress;
	
	
	public String getLeaenerAddress() {
		return LeaenerAddress;
	}
	public void setLeaenerAddress(String leaenerAddress) {
		LeaenerAddress = leaenerAddress;
	}
	public Learner() {
		
	}
	@Access(AccessType.PROPERTY)
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLcity() {
		return lcity;
	}
	public void setLcity(String lcity) {
		this.lcity = lcity;
		
	}
	
	public Learner(String lname, String lcity) {
		super();
		this.lname = lname;
		this.lcity = lcity;
	}
	
	
}
