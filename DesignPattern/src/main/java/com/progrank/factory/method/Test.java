package com.progrank.factory.method;

public class Test {

	public static void main(String[] args) {
		Package df1 = DatabaseFactory
				.createDatabaseObject(PackageType.NOSQL);
		System.out.println(df1);
		
		Package df2 = DatabaseFactory
				.createDatabaseObject(PackageType.SQL);
		System.out.println(df2);
		System.out.println(df2.dbList.get(MySql.class.getName()));
	}

}
