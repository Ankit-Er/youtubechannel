package com.progrank.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		//IntStream.range(1,6).forEach(System.out :: println);
		
		/*
		 * IntStream num = IntStream.iterate(2, x -> x+1);
		 * 
		 * num.limit(5).forEach(System.out :: println);]
		 */
		
		
		/*
		 * Stream.of("Java","JavaScript","Python","GO","Dart") .filter(x->
		 * x.contains("J")) .map(String :: isEmpty) .forEach(System.out :: println);
		 */
		
		//Stream.generate(Math :: random).limit(5).forEach(System.out :: println);
		
		/*
		 * System.out.println(
		 * Arrays.asList("Java","JavaScript","Python","GO","Dart","Java") .stream()
		 * .filter(x -> x.contains("J")) .collect(Collectors.toSet()) );
		 */
		
		
		/*
		 * List<Student> lst = new ArrayList<>(); lst.add(new
		 * Student("Raj",Subjects.SCIENCE,45)); lst.add(new
		 * Student("Rajiv",Subjects.MATH,35)); lst.add(new
		 * Student("Sneha",Subjects.SCIENCE,29));
		 * 
		 * System.out.println( lst.stream().collect(Collectors.toMap(Student :: getName,
		 * Student :: getSub)) );
		 */
		
		/*
		 * List<Student> lst = new ArrayList<>(); lst.add(new
		 * Student("Rajiv",Subjects.SCIENCE,45)); lst.add(new
		 * Student("Rajiv",Subjects.MATH,35)); lst.add(new
		 * Student("Sneha",Subjects.SCIENCE,29)); lst.add(new
		 * Student("Rajiv",Subjects.ENGLISH,40)); lst.add(new
		 * Student("Sneha",Subjects.ENGLISH,42)); lst.add(new
		 * Student("Shashi",Subjects.LITERATURE,18));
		 * 
		 * Map<String,List<Subjects>> map = new HashMap<>();
		 * 
		 * lst.stream().forEach(stu -> { map.computeIfAbsent(stu.getName(), x -> new
		 * ArrayList<Subjects>()) .add(stu.getSub()); });
		 * 
		 * System.out.println(map);
		 */
		
		/*
		 * List<String> lst1 = Arrays.asList("A","B"); List<String> lst2 =
		 * Arrays.asList("C","D","E"); List<String> lst3 = Arrays.asList("F");
		 * 
		 * System.out.println( Stream.of(lst1,lst2,lst3).flatMap(List ::
		 * stream).collect(Collectors.toList()) );
		 */
		
		
		/*
		 * Map<String,List<Integer>> map = new LinkedHashMap<>(); map.put("one",
		 * Arrays.asList(1,2,3)); map.put("two", Arrays.asList(4,5,6));
		 * 
		 * System.out.println( map.values().stream().flatMap(List ::
		 * stream).collect(Collectors.toList()) );
		 */
		
		/*
		 * List<Map<String,Integer>> lst = new ArrayList<Map<String,Integer>>();
		 * 
		 * Map<String,Integer> m1 = new HashMap<String, Integer>(); m1.put("one", 11);
		 * m1.put("two", 12);
		 * 
		 * 
		 * Map<String,Integer> m2 = new HashMap<String, Integer>(); m2.put("three", 13);
		 * m2.put("four", 14);
		 * 
		 * lst.add(m1); lst.add(m2);
		 * 
		 * System.out.println( lst.stream().map(Map :: values).flatMap(Collection ::
		 * stream).collect(Collectors.toList()) );
		 */
		
		
	}
	

}










