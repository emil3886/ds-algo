package com.emil.org.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.emil.org.domain.Employee;

public class EmployeeTestRun {
	
	private static final int IT_DEPT_ID = 101;
	private static final int HR_DEPT_ID = 102;

	public static void main(String[] args) {
		//1. sort based on deptid and then rating and then convert to linkedlist
		sortingCheck();
		//2. List to Map
		listToMap();
	}
	
	private static void sortingCheck() {
		
		List<Employee> employees = getEmployees();
		
		LinkedList<Employee> sortedList = employees.stream().sorted(Comparator.comparing(Employee::getDepartmentId).thenComparing(Employee:: getRating)).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(sortedList);
		
		
	}

	private static List<Employee> getEmployees() {
		Employee e1 = new Employee(IT_DEPT_ID, 10, 2);
		Employee e2 = new Employee(IT_DEPT_ID, 11, 3);
		Employee e3 = new Employee(IT_DEPT_ID, 12, 2);
		Employee e4 = new Employee(IT_DEPT_ID, 13, 4);
		Employee e5 = new Employee(IT_DEPT_ID, 14, 1);
		
		Employee e6 = new Employee(HR_DEPT_ID, 15, 2);
		Employee e7 = new Employee(HR_DEPT_ID, 16, 4);
		Employee e8 = new Employee(HR_DEPT_ID, 17, 1);
		Employee e9 = new Employee(HR_DEPT_ID, 18, 0);
		
		List<Employee> employees = new ArrayList();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		return employees;
	}
	
	private static void listToMap() {
		List<Employee> employees = getEmployees();
		
		Map<Integer, Employee> employeeMap = employees.stream().collect(Collectors.toMap(e -> e.getEmployeeId(), e->e));
		Map<Integer, Employee> employeeMap1 = employees.stream().collect(Collectors.toMap(Employee :: getEmployeeId, Function.identity()));
		System.out.println("EmployeeMap : " +employeeMap);
		System.out.println("EmployeeMap1 : " +employeeMap1);
		OptionalDouble average = employees.stream().mapToInt(emp -> emp.getRating()).average();
		System.out.println("avg : " +average.getAsDouble());
		
	}

}
