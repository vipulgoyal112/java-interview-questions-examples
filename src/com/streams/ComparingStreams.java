/**
 * 
 */
package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Admin
 *
 */
public class ComparingStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strLst = Arrays.asList("This is couting frequency of words couting frequency".split(" "));
		Map<String, Long> map = strLst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("map = " + map);
		
		//for string find duplicate characters
		String str = "Characters";
		char[] charArray = str.toCharArray();
		//List<Character> charLst = Arrays.asList(charArray);
		
		
		Map<String, Long> map1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("map1 = " + map1);
		
		
		
	}

}
