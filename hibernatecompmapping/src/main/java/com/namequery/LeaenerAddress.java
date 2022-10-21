package com.namequery;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
@Embeddable
@Access(AccessType.PROPERTY)
public class LeaenerAddress {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
