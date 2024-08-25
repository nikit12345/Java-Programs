package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			    new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
			    new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
			    new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
			    new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
			    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
			    new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
			    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
			    new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
			    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
			    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));
	
		//sum of salary
		
	//Group The Student By Department Names
Map<String, Long> h=	list.stream().collect(Collectors.groupingBy(Student::getBranch, Collectors.counting()));
System.out.println(h);
	
	//Find the max age of student
	Optional<Student> i= list.stream().max(Comparator.comparing(Student::getAge));
			System.out.println(i);;
	//Find all departments names
			
List<String> o=	list.stream().map(e->e.getBranch()).collect(Collectors.toList());
System.out.println(o);

   // Find the count of student in each department
   Map<String, Long> u= list.stream().collect(Collectors.groupingBy(Student::getBranch, Collectors.counting()));
	System.out.println(u);
	
	//Find the average age of male and female students
	Map<String, Double> oo= list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));
	System.out.println(oo);
	
	//Find the department who is having maximum number of students
	Entry<String, Long> entry = list.stream().collect(Collectors.groupingBy(Student::getBranch, Collectors.counting())).entrySet()
			.stream().max(Map.Entry.comparingByValue()).get();
			
			
	System.out.println(entry);
	
	//Find the Students who stays in Delhi and sort them by their names
		List<Student> s=	list.stream().filter(r->r.getAddress().equals("Karnataka")).sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	System.out.println(s);
	s.forEach(ss-> System.out.println(ss.getName()+" , "+ss.getAddress()));
	
	
	// Find the average rank in all departments
 Map<String, Double> fd=	list.stream().collect(Collectors.groupingBy(Student::getBranch, Collectors.averagingInt(Student::getRank)));
	System.out.println(fd);
	
	//Find the highest rank in each department
	Map<String, Optional<Student>> ff=list.stream().collect(Collectors.groupingBy(Student::getBranch, Collectors.minBy(Comparator.comparing(Student::getRank))));
	System.out.println(ff);
	
//Find the list of students and sort them by their rank
	System.out.println();System.out.println();
	List<Student> n= list.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());;
	System.out.println(n);
	n.forEach(c-> System.out.println(c.getName()));
	
	//Find the student who has second rank
	
Optional<Student> hh=	list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst();;
	System.out.println(hh);
	}
	
	

}
