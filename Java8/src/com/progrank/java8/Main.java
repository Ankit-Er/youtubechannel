package com.progrank.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface DoubleColon {
	void show();
}

class ABC {

	public void display() {
		System.out.println("Hi Double Colon");
	}
}

public class Main {

	public static void main(String[] args) {

		ABC ob = new ABC();
		DoubleColon dc = ob::display;
		dc.show();

		List<Employee> lst = new ArrayList<Employee>();

		lst.addAll(Arrays.asList(new Employee("Dhruv", 101), new Employee("Abhi", 102), new Employee("Yaman", 103),
				new Employee("James", 104), new Employee("Rishi", 105)));

		System.out.println(lst);

		/*
		 * Collections.sort(lst,new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee e1, Employee e2) { return
		 * e1.getEmpName().compareTo(e2.getEmpName()); } });
		 */

		/*
		 * Collections.sort(lst, (Employee e1, Employee e2) ->
		 * e1.getEmpName().compareTo(e2.getEmpName()) );
		 */

		// Class_name :: Method_name

		Collections.sort(lst, Comparator.comparing(Employee::getEmpName));

		System.out.println(lst);

	}

}