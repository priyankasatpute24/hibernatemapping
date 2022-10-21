package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Answer {
   @Id
   private int ansId;
   private String solution;
   
  @ManyToOne
  private Question que;

public int getAnsId() {
	return ansId;
}

public void setAnsId(int ansId) {
	this.ansId = ansId;
}

public String getSolution() {
	return solution;
}

public void setSolution(String solution) {
	this.solution = solution;
}

public Question getQue() {
	return que;
}

public void setQue(Question que) {
	this.que = que;
}

  
  
}
