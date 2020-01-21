package com.spring.boot.graphql.ai1tutorial.model;


public class Employee {
	
    private String empId;

    private String empName;

    private Department department;

    private int empAge;
    

	public Employee() {
		super();
	}


	public Employee(String empId, String empName, Department department, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.empAge = empAge;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public int getEmployeAge() {
		return empAge;
	}


	public void setEmployeAge(int employeAge) {
		this.empAge = employeAge;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", employeAge="
				+ empAge + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}

    
    
}