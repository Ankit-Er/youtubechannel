package com.progrank.factory.method;

public class NoSqlDatabasePackage extends Package{
	
	@Override
	protected void creatingPackage() {
		dbList.put(MongoDB.class.getName(),new MongoDB());
	}
}
