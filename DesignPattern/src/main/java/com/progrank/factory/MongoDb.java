package com.progrank.factory;

public class MongoDb extends Database{

	public MongoDb() {
		setDriverName("Mongo_Driver");
		setUserName("mongo@123");
	}

}
