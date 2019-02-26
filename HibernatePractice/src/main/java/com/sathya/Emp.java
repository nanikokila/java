package com.sathya;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
@DiscriminatorValue("E")
public class Emp extends Person{

	@Column(name="joining_date")
	private Date joiningDate;
	
	@Column(name="department_name")
	private String departmentName;

	public Emp() {
		super();
	}

	public Emp(Date joiningDate, String departmentName) {
		super();
		this.joiningDate = joiningDate;
		this.departmentName = departmentName;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Emp [joiningDate=" + joiningDate + ", departmentName=" + departmentName + "]";
	}
	
	
	
}
