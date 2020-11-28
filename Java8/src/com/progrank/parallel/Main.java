package com.progrank.parallel;

import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		List<Integer> value = Arrays.asList(1,2,3,4,5);
		
		//value.stream().parallel().forEach(System.out :: println);
		value.parallelStream().forEach(System.out :: println);
	}

}
