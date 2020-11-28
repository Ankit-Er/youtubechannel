package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import statement..

//load driver  ====  petrol
//Create Connection  === keys(kick)
//Create statements  === gear change
//execute statement  === race with clutch release
//show result  == reach place
///close connection  === (bike)stop engine

public class DBManager {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/dbtest";
	private String uid = "root";
	private String passwd = "";
	
	public void selectRecords() {
		
		try {
			Class.forName(driver);		
			Connection con = DriverManager.getConnection(url, uid, passwd);
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from tbl_student");

			while(result.next()) {
				System.out.println("SID = "+result.getInt(1));
				System.out.println("Student Name = "+result.getString(2));
				System.out.println("Student RollNo = "+result.getString(3));
				System.out.println("Student Marks = "+result.getInt(4));
				System.out.println("====================");
			}
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	//insertion, updation, deletion
	public boolean RecordsManipulation(String query) {
		boolean flag= false;
		try {
			Class.forName("com.mysql.jdbc.Driver");		
			Connection con = DriverManager.getConnection(url, uid, passwd);
			Statement stmt = con.createStatement();
			flag = stmt.executeUpdate(query) > 0 ? true : false;
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return flag;
	}
	
}
