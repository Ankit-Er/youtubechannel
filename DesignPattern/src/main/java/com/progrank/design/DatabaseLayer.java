package com.progrank.design;

import javax.management.RuntimeErrorException;


//Double checking singleton

public class DatabaseLayer {

	private static volatile DatabaseLayer db;// = new DatabaseLayer();
	
	private DatabaseLayer() {
		if(db != null) {
			throw new RuntimeException("get your object by getDbInstance()");
		}
	}		
	
	public static DatabaseLayer getDbInstance() {
		if(db==null) {
			synchronized (DatabaseLayer.class) {
				if(db == null) {
					db = new DatabaseLayer();
				}
			}
		}
			
		return db;
	}
	
}
