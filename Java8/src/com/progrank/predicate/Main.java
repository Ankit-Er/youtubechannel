package com.progrank.predicate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface MyPredicate<T>{
	boolean operation(T t);
}

public class Main {

	public static void main(String[] arg) {

		Collection<Car> carList = Arrays.asList(
				new Car("Toyota", "White", 300000),
				new Car("BMW", "Black", 750000),
				new Car("Marcedes Benz", "Yellow", 600000),
				new Car("Hyundai Honda", "White", 500000)
				);
		
		System.out.println(carList);
		
		
		/*
		 * Predicate<Car> p = x -> x.getPrice() > 600000;
		 * MyPredicate<Car> p = x -> x.getPrice() > 600000;
		 * 
		 * for(Car car : carList) { if(p.operation(car))
		 * System.out.println(car.getName()); }
		 */
		
		List<Car> carList2 = carList.stream().filter(x -> x.getPrice() < 600000)
				.collect(Collectors.toList());
		
		System.out.println(carList2);
		
	}

}
