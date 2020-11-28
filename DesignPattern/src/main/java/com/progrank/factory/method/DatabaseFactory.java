package com.progrank.factory.method;

public class DatabaseFactory {

	public DatabaseFactory() throws IllegalAccessException {
		throw new IllegalAccessException("can't be created");
	}
	
	public static Package createDatabaseObject(PackageType type) {
		switch (type) {
		case SQL:
			return new SqlDatabasePackage();
		case NOSQL:
			return new NoSqlDatabasePackage();
		default:
			return null;
		}
	}
}
