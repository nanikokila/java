package org.nt.sathya;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	private int empId;

	public Employee() {
		super();
		System.out.println("default-constructor");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}

	public void destroy() throws Exception {
		System.out.println("destroy-method");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init-method");

	}

	@PostConstruct
	public void bgf(){
		System.out.println("In init-method");
	}
	@PreDestroy
	public void ghd(){
		System.out.println("In destroy-method");
	}

}
