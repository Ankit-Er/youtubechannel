package com.progrank.arg;

interface Operation{
	public int opt(int x, int y);
}

public class Main {

	public static void result(int x, int y, Operation obj) {
		System.out.println(obj.opt(x, y));
	}
	
	public static void main(String[] args) {
		//result(50,8, (a,b) -> (a*b));
		
		Operation obj = (a,b) -> (a*b);
		
		System.out.println(obj.opt(5,8));
		
		
	}

}
