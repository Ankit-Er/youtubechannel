package com.main;

import java.text.ParseException;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		String[] arr = {"09:10AM-09:50AM","10:00AM-12:30AM","02:00AM-02:45AM"};
		System.out.println(new Events().calculateFreeTime(arr));
	}

}
