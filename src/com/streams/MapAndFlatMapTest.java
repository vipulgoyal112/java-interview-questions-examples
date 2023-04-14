package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapTest {
	
	public static void main(String[] args) {
		List<Employee> empLst = new ArrayList<Employee>();
		empLst.add(new Employee(1, "Vipul", 2000, Arrays.asList("Add1", "Add2")));
		empLst.add(new Employee(2, "Saurabh", 5000, Arrays.asList("Add3", "Add4")));
		empLst.add(new Employee(3, "Raman", 7000, Arrays.asList("Add3", "Add2")));
		empLst.add(new Employee(4, "Jai", 1500, Arrays.asList("Add4", "Add6")));
		
		System.out.println("Map");
		empLst.stream().map(e -> e.getAddresses()).forEach(System.out::print);
		System.out.println("\nFlat Map");
		empLst.stream().flatMap(e -> e.getAddresses().stream()).map( v-> v+", ").forEach(System.out::print);
		System.out.println("\nUnique Flat Map");
		empLst.stream().flatMap(e -> e.getAddresses().stream()).map( v-> v+", ").
		collect(Collectors.toSet()).forEach(System.out::print);
		
	}

}
