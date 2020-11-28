package com.progrank.factory.method;

public class SqlDatabasePackage extends Package {

	@Override
	protected void creatingPackage() {
		dbList.put(MySql.class.getName(),new MySql());
		dbList.put(MS_SQL.class.getName(),new MS_SQL());
		dbList.put(Oracle.class.getName(),new Oracle());
	}
	
}
