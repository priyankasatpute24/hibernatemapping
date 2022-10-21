package com.manytomany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class Department
{
    @Id
    @Column(name="DEP_ID")
    @GeneratedValue
    private int depId;
    
    @Column(name="DEP_NAME")
    private String depName;
    
    @ManyToMany(mappedBy="department")
    private Set<Employee> employee;

	public Department() {
		super();
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	

	}
    
    