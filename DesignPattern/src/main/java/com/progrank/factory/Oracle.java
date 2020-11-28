package com.progrank.factory;

public class Oracle extends Database{

	public Oracle() {
		setDriverName("oracle.jdbc.driver.OracleDriver");
		setUserName("oracle@123");
	}
}
