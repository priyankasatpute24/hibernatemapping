package com.manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="EMPLOYEE")
public class Employee
{
    @Id
    @Column(name="EMP_ID")
    @GeneratedValue
    private int empId;
    
    @Column(name="EMP_NAME")
    private String empName;
    
    @ManyToMany(cascade = {CascadeType.ALL})
//    @JoinTable(name="EMPLOYEE_DEPARTMENT", 
//                joinColumns={ @JoinColumn(name="EMP_ID")}, 
//                inverseJoinColumns={@JoinColumn(name="DEP_ID")})
    private Set<Department> department;

	public Employee() {
		super();
	}
	
		public Employee(String empName) {
		super();
		this.empName = empName;
		
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public Set<Department> getDepartment() {
			return department;
		}

		public void setDepartment(Set<Department> department) {
			this.department = department;
		}
    
		@Override
	    public String toString()
	    {
	        return "Employee [empId=" + empId + ", empName=" + empName + "]";
	    }

}
