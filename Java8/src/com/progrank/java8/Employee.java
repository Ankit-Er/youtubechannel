package com.progrank.java8;

public class Employee {

	private String empName;
	private int empID;
	
	public Employee(String empName, int empID) {
		super();
		this.empName = empName;
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpID() {
		return empID;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + "]";
	}
	
	
}
