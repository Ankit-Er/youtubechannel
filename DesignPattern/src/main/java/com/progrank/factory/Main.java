package com.progrank.factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Press 1 for MySql !");
		System.out.println("Press 2 for Oracle !");
		System.out.println("Press 3 for Mongo !");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<0 && n>2) {
			System.out.println("Invalid input!!");
		}
		else {
			Database db = DatabaseFactory
			.createDatabaseObject(DatabaseType.values()[n-1]);
			db.showConnectionDetails();
		}
		
	}

}
