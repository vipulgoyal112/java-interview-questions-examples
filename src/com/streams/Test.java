package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> empLst = new ArrayList<Employee>();
		empLst.add(new Employee(1, "Vipul", 2000));
		empLst.add(new Employee(2, "Saurabh", 5000));
		empLst.add(new Employee(3, "Raman", 7000));
		empLst.add(new Employee(4, "Jai", 1500));
		
		
		empLst.stream().forEach(e -> System.out.println(e));
		
		//filter
//		empLst.stream().
//		filter(e-> (e.getSalary() > 2000)).
//		filter(e -> e.getId() == 2).
//		forEach(e -> System.out.println(e));
//		
//		Employee emp = empLst.stream().
//		filter(e-> (e.getSalary() > 2000)).
//		filter(e -> e.getId() == 3).
//		findFirst().orElse(null);
//		
//		System.out.println(emp);
		
		//map
		System.out.println("gap ---- ");
		empLst.stream().map(e -> { e.setSalary(e.getSalary()*2); return e;}).forEach(e -> System.out.println(e));
		
		String names = empLst.stream().map(e->e.getName()).collect(Collectors.joining(","));
		System.out.println("names ---- " + names);
		
		//sorting
		empLst.stream().sorted((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName())).
		forEach(e -> System.out.println(e));
		
		
		
		
	}

}
