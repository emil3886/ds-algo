package com.emil.org.domain;

public class Employee {

	private int employeeId;
	private int rating;
	private int departmentId;

	public int getEmployeeId() {
		return employeeId;
	}

	public int getRating() {
		return rating;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public Employee(int departmentId, int employeeId, int rating) {
		super();
		this.employeeId = employeeId;
		this.rating = rating;
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", rating=" + rating + ", departmentId=" + departmentId + "]";
	}

	
}
