package com.progrank.factory;

public class DatabaseFactory {

	public DatabaseFactory() throws IllegalAccessException {
		throw new IllegalAccessException("can't be created");
	}
	
	public static Database createDatabaseObject(DatabaseType type) {
		switch (type) {
		case MYSQL:
			return new MySql();
		case ORACLE:
			return new Oracle();
		case MONGO:
			return new MongoDb();	
		default:
			return null;
		}
	}
}
