package com.example;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeDriver {
	public static void main(String[] args) {
		
		List<Employee> l = Arrays.asList(new Employee(1,25, 50000, "niki"),new Employee(1,25, 50000, "niki"),
				new Employee(2,27, 57000, "avi"),
				new Employee(3,22, 84000, "neha"),
				new Employee(4,27, 23000, "sumit"),
				new Employee(5,23, 575000, "adi"),
				new Employee(6,27, 50400, "jhon"),
				new Employee(7,25, 32400, "aru"));
	
DoubleSummaryStatistics o=	l.stream().filter(e-> e.getAge()>25).collect(Collectors.summarizingDouble(Employee::getSalary));
System.out.println(o);
   
int salary= l.stream().filter(e-> e.getAge()>25).collect(Collectors.summingInt(Employee::getSalary));
System.out.println(salary);

l.stream().collect(Collectors.summingInt(Employee::getSalary));
}
}