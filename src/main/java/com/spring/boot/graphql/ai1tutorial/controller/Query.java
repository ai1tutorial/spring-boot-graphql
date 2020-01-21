package com.spring.boot.graphql.ai1tutorial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.spring.boot.graphql.ai1tutorial.model.Department;
import com.spring.boot.graphql.ai1tutorial.model.DepartmentType;
import com.spring.boot.graphql.ai1tutorial.model.Employee;

@Component
public class Query implements GraphQLQueryResolver {

	List<Employee> employeesList = new ArrayList<>();

	public List<Employee> findAllEmployee() {
		Department dept1 = new Department("dept1", "dept1nm", DepartmentType.COE);
		Employee emp1 = new Employee("emp1", "emp1nm", dept1, 31);
		if (!employeesList.contains(emp1)) {
			employeesList.add(emp1);
		}
		
		Department dept2 = new Department("dept2", "dept2nm", DepartmentType.HR);
		Employee emp2 = new Employee("emp2", "emp2nm", dept2, 32);
		if (!employeesList.contains(emp2)) {
			employeesList.add(emp2);
		}
		return employeesList;
	}

	public int countEmployee() {
		return employeesList.size();
	}
}