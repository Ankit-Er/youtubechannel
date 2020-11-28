package com.progrank.factory;

public class MySql extends Database{

	public MySql() {
		setDriverName("com.mysql.cj.jdbc.Driver.");
		setUserName("mysql@123");
	}

}
