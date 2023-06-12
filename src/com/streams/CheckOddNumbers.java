package com.streams;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface A {
	boolean isOdd(int a);
}

public class CheckOddNumbers {

	public static void main(String[] args) {
		A a = (a1) -> {
			if (a1%2 != 0) {
				return true;
			}
			return false;
		};
		System.out.println("a : " + a.isOdd(10));
		System.out.println("a : " + a.isOdd(11));
		System.out.println("a : " + a.isOdd(12));
		System.out.println("a : " + a.isOdd(13));
		
		List<Integer> intLst = Arrays.asList(1,2,3,4,5);
		//intLst.st
		
		
	}
	
}
